package com.java.designpatterns.behaviorpattern.chainofresponsibilitypattern;

import com.java.designpatterns.behaviorpattern.chainofresponsibilitypattern.interfacesandabstracts.ChainedCashDispenser;
import com.java.designpatterns.behaviorpattern.chainofresponsibilitypattern.interfacesandabstracts.Currency;
import com.java.designpatterns.behaviorpattern.chainofresponsibilitypattern.interfacesandabstracts.impl.Cash100RupeesDispenser;
import com.java.designpatterns.behaviorpattern.chainofresponsibilitypattern.interfacesandabstracts.impl.Cash2000RupeesDispenser;
import com.java.designpatterns.behaviorpattern.chainofresponsibilitypattern.interfacesandabstracts.impl.Cash500RupeesDispenser;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan Gupta
 * Date: 15-05-2021
 * Time: 13:21
 */
public class AtmCashDispenser {

    private final ChainedCashDispenser chainedCashDispenser2000;

    public AtmCashDispenser() {
        this.chainedCashDispenser2000 = new Cash2000RupeesDispenser();
        ChainedCashDispenser chainedCashDispenser500 = new Cash500RupeesDispenser();
        ChainedCashDispenser chainedCashDispenser100 = new Cash100RupeesDispenser();

        chainedCashDispenser2000.setNextChainedCashDispenser(chainedCashDispenser500);
        chainedCashDispenser500.setNextChainedCashDispenser(chainedCashDispenser100);
    }

    public static void main(String[] args) {
        AtmCashDispenser atmCashDispenser = new AtmCashDispenser();
        while (true) {
            int amount = 0;
            System.out.println("Please Enter The Amount To Withdraw ..!!");
            Scanner sc = new Scanner(System.in);
            amount = sc.nextInt();
            if (amount % 100 != 0) {
                System.out.println("Please Enter the Amount in the multiples of 100 ..!!");
                continue;
            }
            atmCashDispenser.chainedCashDispenser2000.dispense(new Currency(amount));
        }
    }
}
