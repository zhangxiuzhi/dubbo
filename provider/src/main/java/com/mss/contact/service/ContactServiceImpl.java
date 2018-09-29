package com.mss.contact.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: zhangxiuzhi
 * Date: 2018-09-29
 * Time: 14:12
 */
@Service
public class ContactServiceImpl implements ContactService {

    private Logger logger = LoggerFactory.getLogger(ContactServiceImpl.class);

    @Override
    public String sayHello(String name) {
        logger.info("sayHello {}",name);
        return "hello " + name;
    }
}
