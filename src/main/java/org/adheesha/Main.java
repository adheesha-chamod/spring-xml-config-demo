package org.adheesha;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
        printBeans(context);


        /**
         * get bean by id specified in configuration.xml
         */
//        User user = (User) context.getBean("user");

//        user.sayHello();

//        user.setUsername("john");
//        user.setPassword("john@1234");
//        System.out.printf("username: %s, password: %s%n", "john", "john@1234");

//        user.buyProduct();


//        Product product = (Product) context.getBean("product");
//        System.out.printf("id: %s, name: %s, price: %.2f%n", product.getId(), product.getName(), product.getPrice());

        Buyer buyer = (Buyer) context.getBean("buyer");
        buyer.pay();
    }

    public static void printBeans(ApplicationContext context) {
        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }
}