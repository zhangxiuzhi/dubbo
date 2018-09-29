package com.mss.contact.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.mss.contact.service.ContactService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: zhangxiuzhi
 * Date: 2018-09-29
 * Time: 14:40
 */
@RestController
public class IndexController {

    private Logger logger = LoggerFactory.getLogger(IndexController.class);

    //使用zookeeper时 使用下面的配置之一
    @Reference(url = "dubbo://localhost:12345")
//    @Reference(version = "1.0.0",timeout = 6000)
//    @Reference
    private ContactService contactService;

    @RequestMapping("/hello")
    public String sayHello(String name){
        logger.info("hello {}",name);
        return contactService.sayHello(name);
    }

}
