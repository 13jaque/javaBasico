package com.cursojava.exercicios.aula16e17;


import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double popA;
        double popB;
        double porcA;
        double porcB;


        boolean valido = false;

        do {
            System.out.println("Informe a população A: ");
            popA = scan.nextInt();

            if (popA > 0) {
                valido = true;
            } else {
                System.out.println("População precisa ser maior que 0.");
            }

        }while (!valido);

        valido = false;
        do {
            System.out.println("Informe a população B: ");
            popB = scan.nextInt();

            if (popB > 0) {
                valido = true;
            } else {
                System.out.println("População precisa ser maior que 0.");
            }

        } while (!valido);

        valido = false;
        do {
            System.out.println("Informe a porcentagem A: ");
            porcA = scan.nextInt();

            if (porcA > 0) {
                valido = true;
            } else {
                System.out.println("Porcentagem precisa ser maior que 0.");
            }

        } while (!valido);

        valido = false;
        do {
            System.out.println("Informe a porcentagem B: ");
            porcB = scan.nextInt();

            if (porcB > 0) {
                valido = true;
            } else {
                System.out.println("Porcentagem precisa ser maior que 0.");
            }

        } while (!valido);

        int cont = 0;

        while (popA < popB) {

            popA += (popA * porcA) / 100;
            popB += (popB * porcB) / 100;
            cont++;
        }

        System.out.println("População A: " + popA);
        System.out.println("População b: " + popB);
        System.out.println("Qtd anos: " + cont);
    }
}