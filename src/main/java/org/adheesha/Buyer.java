package org.adheesha;

public class Buyer {

    private Payable cardPay;

    public void pay() {
        cardPay.pay();
    }

    public void setCardPay(Payable paymentMethod) {
        this.cardPay = paymentMethod;
    }


//    private Payable cashPay;
//
//    public void pay() {
//        cashPay.pay();
//    }
//
//    public void setCashPay(Payable paymentMethod) {
//        this.cashPay = paymentMethod;
//    }
}
