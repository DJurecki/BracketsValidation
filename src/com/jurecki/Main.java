package com.jurecki;

public class Main {

    public static void main(String[] args) {

        String str = "())((())))";
        int firstCounter = 0;
        int secondCounter = 0;
        for (int i = 0 ; i != str.length() ; i++){
            char c = str.charAt(i);
            if(c == '('){
                firstCounter++;
            }
            if(c == ')'){
                secondCounter++;
            }
            if (secondCounter > firstCounter){
                System.out.println("Not good!");
                break;
            }
        }
        int liczba = 0;
        System.out.println(liczba);

        System.out.println("Tyle '(': " + firstCounter + " i tyle ')': " + secondCounter);

        System.out.println("Siemanko z brancza");

        System.err.println("Error i kapa");
    }
}
