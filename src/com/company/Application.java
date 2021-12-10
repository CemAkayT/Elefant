package com.company;

import java.text.DecimalFormat;

public class Application {
    UserInterface ui = new UserInterface();
    DecimalFormat df = new DecimalFormat(".##DKK");


    public void run() {

        double numOfItems, valueOfItem;
        String stateCode;

        double taxRateUtah = 1.0685;
        double taxRateNevada = 1.08;
        double taxRateTexas = 1.0625;
        double taxRateAL = 1.04;
        double taxRateCA = 1.0825;


        System.out.println("Indtast antal varer:");
        numOfItems = ui.getInputDouble();

        System.out.println("Indtast pris på vare:");
        valueOfItem = ui.getInputDouble();

        System.out.println("Indtast state code:");
        stateCode = ui.getInputString();


        double sum = 0.0;
        switch (stateCode) {
            case "ut" -> sum = (taxRateUtah * numOfItems * valueOfItem);
            case "nv" -> sum = (taxRateNevada * numOfItems * valueOfItem);
            case "tx" -> sum = (taxRateTexas * numOfItems * valueOfItem);
            case "al" -> sum = (taxRateAL * numOfItems * valueOfItem);
            case "ca" -> sum = (taxRateCA * numOfItems * valueOfItem);
        }
        System.out.println("Før rabat: " + df.format(sum));


        if (sum > 50000) {
            System.out.println("Efter rabat: " + df.format(sum * 0.85));

        } else if (sum > 10000) {
            System.out.println("Efter rabat: " + df.format(sum * 0.90));

        } else if (sum > 7000) {
            System.out.println("Efter rabat: " + df.format(sum * 0.93));

        } else if (sum > 5000) {
            System.out.println("Efter rabat: " + df.format(sum * 0.95));

        } else {
            System.out.println("Efter rabat: " + df.format(sum * 0.97));
        }

    }

}
