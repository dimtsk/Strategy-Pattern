
package com.dimtsk.assignment.payment;

import com.dimtsk.assignment.payment.IPaymentMethod;



public class BankTransferPayment implements IPaymentMethod{
    
    private String iBankAccount;

    public BankTransferPayment() {
    }

    public BankTransferPayment(String iBankAccount) {
        this.iBankAccount = iBankAccount;
    }

    public String getiBankAccount() {
        return iBankAccount;
    }

    public void setiBankAccount(String iBankAccount) {
        this.iBankAccount = iBankAccount;
    }
    
    @Override
    public void payment(int amount) {
        System.out.println("Payment with IBank. Total amount is: "+amount);
    }
    
}
