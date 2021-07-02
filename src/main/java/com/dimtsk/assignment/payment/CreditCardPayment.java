package com.dimtsk.assignment.payment;

public class CreditCardPayment implements IPaymentMethod{

    private String cardType;
    private String CardHolderName;
    private String cardNumber;
    private String cardExpDate;
    private String cardCVV;

    public CreditCardPayment() {
    }

    
    public CreditCardPayment(String cardType, String CardHolderName, String cardNumber, String cardExpDate, String cardCVV) {
        this.cardType = cardType;
        this.CardHolderName = CardHolderName;
        this.cardNumber = cardNumber;
        this.cardExpDate = cardExpDate;
        this.cardCVV = cardCVV;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardHolderName() {
        return CardHolderName;
    }

    public void setCardHolderName(String CardHolderName) {
        this.CardHolderName = CardHolderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardExpDate() {
        return cardExpDate;
    }

    public void setCardExpDate(String cardExpDate) {
        this.cardExpDate = cardExpDate;
    }

    public String getCardCVV() {
        return cardCVV;
    }

    public void setCardCVV(String cardCVV) {
        this.cardCVV = cardCVV;
    }       
    
    @Override
    public void payment(int amount) {
        System.out.println("Credit Card. Total amount is: " +amount);
    }

    
    
}
