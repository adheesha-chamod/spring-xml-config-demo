package org.adheesha;

public class CardPay implements Payable {

    CardPay() {
        System.out.println("CardPay object is created!");
    }

    @Override
    public void pay() {
        System.out.println("Card payment is done!");
    }
}
