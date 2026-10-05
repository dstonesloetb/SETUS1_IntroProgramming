
package com.mycompany.intro;

public class FunReceipt {
    public static void main(String[] args) {
        // \n creates a new line, \t creates a clean tab alignment
        String receipt = "=== COFFEE SHOP ===\n" +
                         "Item\t\tPrice\n" +
                         "---------------------\n" +
                         "Espresso\t$3.50\n" +
                         "Croissant\t$4.00\n" +
                         "Java Chip\t$5.25\n" +
                         "---------------------\n" +
                         "Thank you!";
                         
        System.out.println(receipt);
    }
}
