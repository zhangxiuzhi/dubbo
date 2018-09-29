package com.mss.contact;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ContactProviderApplication {

    public static void main(String[] args) {

        new SpringApplicationBuilder(ContactProviderApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

    }
}
