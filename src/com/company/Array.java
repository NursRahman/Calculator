package com.company;

public class Array extends Calculator{
    private int x, y, flag;
    private char[] massiv, punkt;
    private char k;
    private String s, r1, r2;
    protected int i=0;

    void Array(char[] array){
        massiv = array;
        s = new String(massiv);
        punkt = new char[] {'+','-','*','/'};

        for (int i = 0; i < massiv.length; i++) {
            for (int j = 0; j < punkt.length; j++) {
                if (massiv[i] == punkt[j]) {
                    k = massiv[i];
                    System.out.println(k);
                    flag = i;
                    break;
                }
            }
        }
        if (Character.isDigit(massiv[0])) {
            if (flag == 2 & massiv.length == 4) {
                x = Integer.parseInt(s.substring(0, 2));
                y = Integer.parseInt(s.substring(3));
            } else if (flag == 1 & massiv.length == 4) {
                x = Integer.parseInt(s.substring(0, 1));
                y = Integer.parseInt(s.substring(2, 4));
            } else if (flag == 2 & massiv.length == 5) {
                x = Integer.parseInt(s.substring(0, 2));
                y = Integer.parseInt(s.substring(3, 5));
            } else {
                x = Character.getNumericValue(massiv[0]);
                y = Character.getNumericValue(massiv[2]);
            }
            System.out.println(Math(x,k,y));
        }else
        {
            if (flag == 1 & massiv.length == 3){
                r1 = s.substring(0, 1);
                r2 = s.substring(2);
            } else if (flag == 1 & massiv.length == 4){
                r1 = s.substring(0, 1);
                r2 = s.substring(2, 4);
            } else if (flag == 1 & massiv.length == 5){
                r1 = s.substring(0, 1);
                r2 = s.substring(2, 5);
            } else if (flag == 2 & massiv.length == 4){
                r1 = s.substring(0, 2);
                r2 = s.substring(2, 3);
            } else if (flag == 2 & massiv.length == 5){
                r1 = s.substring(0, 2);
                r2 = s.substring(3, 4);
            } else if (flag == 3 & massiv.length == 5){
                r1 = s.substring(0, 3);
                r2 = s.substring(4);
            } else if (flag == 3 & massiv.length == 6){
                r1 = s.substring(0, 3);
                r2 = s.substring(4, 6);
            } else if (flag == 3 & massiv.length == 7){
                r1 = s.substring(0, 3);
                r2 = s.substring(4, 7);
            }
            RomanConverter con = new RomanConverter(r1);
            x = con.toInt();
            RomanConverter com = new RomanConverter(r2);
            y = com.toInt();

            int res = Math(x,k,y);
            RomanConverter result = new RomanConverter(res);
            System.out.println(result.toString());
        }

    }

    int Math(int a, char b, int c){
        switch (b) {
            case '+':
                return a+c;
            case '-':
                return a-c;
            case '*':
                return a*c;
            case '/':
                if (c==0)
                    return 0;
                else
                    return a/c;
            default:
               return -1;
        }
    }
}
