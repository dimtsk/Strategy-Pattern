package com.dimtsk.assignment;

import com.dimtsk.assignment.payment.BankTransferPayment;
import com.dimtsk.assignment.payment.CashPayment;
import com.dimtsk.assignment.payment.CreditCardPayment;
import com.dimtsk.assignment.dummydata.DummyDataGenerator;
import com.dimtsk.assignment3.model.TShirt;
import java.util.Scanner;

public class AppMain {

    public static int onlyNumbers() {
        Scanner input = new Scanner(System.in);
        int result;

        while (true) {
            try {
                String num = input.next();
                int number = Integer.parseInt(num);
                result = number;
                break;
            } catch (Exception e) {
                System.err.println("INVALID NUMBER TRY AGAIN");
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Cart cart = new Cart();
        DummyDataGenerator generator = new DummyDataGenerator();

        System.out.println("How many TShirts did you chose?");
        int number=onlyNumbers();

        for (int i = 1; i <= number; i++) {
            TShirt tShirt = new TShirt(
                    generator.randomColor(),
                    generator.randomSize(),
                    generator.randomFabric());
            cart.addItem(tShirt);

            System.out.println(i + " ) " + tShirt);
            cart.executePaymant(new CashPayment());
            cart.executePaymant(new CreditCardPayment());
            cart.executePaymant(new BankTransferPayment());
            System.out.println("------------------------------------------------");

        }

    }

}
