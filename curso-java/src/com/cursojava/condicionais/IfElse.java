package com.cursojava.condicionais;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe sua idade: ");
        int idade = scan.nextInt();

        if (idade >= 18){
            System.out.println("É maior de idade.");
        }else {
            System.out.println("É menor.");
        }
    }
}
