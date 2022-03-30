package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        printWhile();
    }

    public static void printWhile() {
        int counter=0;
        while(counter<3) {
            System.out.println(counter);
            counter++;
        }
        System.out.println("after while: " +counter);
    }

    public static void printFor(){
        for (int counter=0; counter<3; counter++){
            System.out.println(counter);
        }
    }
}
