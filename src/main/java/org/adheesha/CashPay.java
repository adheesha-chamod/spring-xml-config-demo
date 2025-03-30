package org.adheesha;

public class CashPay implements Payable {

//    CashPay() {
//        System.out.println("CashPay object is created!");
//    }

    @Override
    public void pay() {
        System.out.println("Cash payment is done!");
    }
}
