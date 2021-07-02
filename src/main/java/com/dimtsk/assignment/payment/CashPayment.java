package com.dimtsk.assignment.payment;

public class CashPayment implements IPaymentMethod{

    public CashPayment() {
    }

    
    @Override
    public void payment(int amount) {
        System.out.println("Payment with cash. Total amount is: "+ amount);
    }
    
}
