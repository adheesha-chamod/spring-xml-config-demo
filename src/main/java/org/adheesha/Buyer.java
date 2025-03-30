package org.adheesha;

public class Buyer {

    private Payable cardPay;

    public void pay() {
        cardPay.pay();
    }

    public void setCardPay(Payable cardPay) {
        this.cardPay = cardPay;
    }
}
