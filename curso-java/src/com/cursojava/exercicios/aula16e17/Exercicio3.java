package com.cursojava.exercicios.aula16e17;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean infoValida = false;

        do {
            System.out.println("Nome: ");
            String nome = scan.next();

            if (nome.length() > 3) {
                infoValida = true;
            } else {
                System.out.println("tente de novo");
            }
        } while (!infoValida);

       infoValida = false;
        do {
            System.out.println("idade: ");
            int idade = scan.nextInt();

            if (idade > 0 && idade < 150) {
                infoValida = true;
            } else {
                System.out.println("tente de novo");
            }
        } while (!infoValida);

        infoValida = false;
        do {
            System.out.println("salario: ");
            double salario = scan.nextInt();

            if (salario > 0) {
                infoValida = true;
            } else {
                System.out.println("tente de novo");
            }
        } while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Sexo: ");
            String sexo = scan.next();

            if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
                infoValida = true;
            } else {
                System.out.println("tente de novo");
            }
        } while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Estado civil: ");
            String estadoCivil = scan.next();

            switch (estadoCivil) {
                case "s":
                    System.out.println("ok");
                    break;
                case "c":
                    System.out.println("ok");
                    break;
                case "v":
                    System.out.println("ok");
                    break;
                case "d":
                    System.out.println("ok");
                    break;
                default:
                    System.out.println("tente de novo");break;
            }return;

        } while (!infoValida);
    }
}

