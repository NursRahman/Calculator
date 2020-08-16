package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while (true) {

            Scanner in = new Scanner(System.in);
            String s = in.nextLine();

            Calculator calc = new Calculator();
            calc.Calculator(s);

        }
    }
}
