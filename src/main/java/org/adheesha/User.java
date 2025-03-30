package org.adheesha;

public class User {

    private String username;
    private String password;
    private Product product;


    User () {
        System.out.println("User object is created!");
    }

    public void sayHello() {
        System.out.println("Hello, World! - User");
    }

    public void buyProduct() {
        product.buy();
    }

    public void setUsername(String username) {
//        System.out.println("Setting username: " + username);
        this.username = username;
    }

    public void setPassword(String password) {
//        System.out.println("Setting password: " + password);
        this.password = password;
    }

    public void setProduct(Product product) {
//        System.out.println("Setting product: " + product);
        this.product = product;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Product getProduct() {
        return product;
    }
}
