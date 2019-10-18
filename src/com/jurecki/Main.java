package com.jurecki;

public class Main {

    public static void main(String[] args) {

        System.out.println(checkBrackets("(()))"));
        System.out.println(checkBrackets("(())"));
   }

    public static boolean checkBrackets(String s){
        int firstCounter = 0;
        int secondCounter = 0;
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if(c == '(') firstCounter++;
            if(c == ')') secondCounter++;
            if(secondCounter > firstCounter) return false;
            if(i == s.length()-1 && secondCounter == firstCounter) return true;
        }
        return false;
    }
}