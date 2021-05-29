package com.cursojava.exercicios.aula13;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        /*int base = 17;
        int altura = 17;
        int area = base * altura;
        int dobro = area * 2;

        System.out.println("A area do quadrado é: " + area);
        System.out.print("Dobro da area é: " + dobro);*/

        //Com Scanner

        Scanner scan = new Scanner(System.in);

        System.out.print("Infome a base do quadrado: ");
        int base = scan.nextInt();

        System.out.print("Informe a altura do quadrado: ");
        int altura = scan.nextInt();

        int area = base * altura;

        System.out.print("A area do quadrado é: " + area);

        int dobro = area * 2;
        System.out.print("\nDobro da area é: " + dobro);



    }
}
