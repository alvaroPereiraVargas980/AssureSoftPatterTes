package com.alvaro.ChainResponsabilityPatter;
import java.util.Scanner;

public class ATMDispenseChain {
    private DisperseChain c1;

    public ATMDispenseChain() {
        this.c1 = new Dollar50Dispenser();
        DisperseChain c2 = new Dollar20Dispenser();
        DisperseChain c3 = new Dollar10Dispenser();

        c1.setNextChain(c2);
        c2.setNextChain(c3);
    }

    public static void main(String[] arg) {
        ATMDispenseChain atmDispenseChain = new ATMDispenseChain();
        while (true) {
            int amount = 0;
            System.out.print("enter a amount of money");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if (amount % 10 != 0) {
                System.out.print("amount should be returned in multiple of 10");
                return;
            }
            atmDispenseChain.c1.disperse(new Currency(amount));

        }

    }
}