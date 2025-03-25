package org.adheesha;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
//        printBeans(context);

        /**
         * get bean by id specified in configuration.xml
         */
        User user = (User) context.getBean("user");

//        user.sayHello();

//        user.setUsername("john");
//        user.setPassword("john@1234");
//        System.out.println(user.getUsername());
//        System.out.println(user.getPassword());

        user.buyProduct();
    }

    public static void printBeans(ApplicationContext context) {
        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }
}