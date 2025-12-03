package com.arcade;


public class MathOperations {

    public int split(int a) {
        return a / 2;
    }


    public boolean checkIfEven(int number) {
        if (number == 0){
            return false;
        }
        return Math.abs(number) % 2 == 0;
    }
}
