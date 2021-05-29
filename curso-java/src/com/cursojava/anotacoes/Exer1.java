package com.cursojava.anotacoes;

import java.util.Scanner;

public class Exer1 {

    public static void main(String[] args) {

        Scanner scan =  new Scanner(System.in);

        System.out.print("x");
        int x = scan.nextInt();

        if (x > 1000){
            x = (x - 150) * 15/100;
            System.out.print("Y: " + x);
        }else {
            System.out.print("Sem desconto! ");
        }
    }
}
