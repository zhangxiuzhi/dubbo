package com.mss.contact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(scanBasePackages = "com.mss.contact.web")
@SpringBootApplication
public class ContactConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ContactConsumerApplication.class, args);
    }
}
