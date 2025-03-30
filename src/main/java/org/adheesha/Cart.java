package org.adheesha;

public class Cart {

    private Item item;

//    Cart() {
//        System.out.println("Cart object is created!");
//    }

    public void addToCart() {
        System.out.println("Item added to cart");
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
