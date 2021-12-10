package com.company;

import java.util.Scanner;

public class UserInterface {
            Scanner scanner = new Scanner(System.in);

        public double getInputDouble(){
            return scanner.nextDouble();

        }
        public String getInputString(){
            return scanner.next().toLowerCase();
        }


}
