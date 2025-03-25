package org.adheesha;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");

        User user = context.getBean(User.class);
        user.sayHello();
    }
}