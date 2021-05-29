package com.cursojava.anotacoes;

import java.util.Scanner;

public class Exer2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("x: ");
        int x = scan.nextInt();

        if (x > 10) {
            x = x * x;
            System.out.print("x: " + x);
        }else {
            System.out.print("Erro!");
        }
    }
}
