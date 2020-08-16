package com.company;

public class Calculator {
    String s;

    private char[] massiv;

    void Calculator(String source){

        s = source;
        massiv = s.toCharArray();

        Array ar = new Array();
        ar.Array(massiv);

    }
}
