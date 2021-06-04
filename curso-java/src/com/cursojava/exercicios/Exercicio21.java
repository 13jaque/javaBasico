package com.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o numero de turmas: ");
        int turmas = scan.nextInt();

        int alunos;
        int soma = 0;
        boolean invalido = false;

        for (int i = 1; i <=turmas; i++){

            invalido = false;
            do {
                System.out.println("Entre com o numero de alunos p/ turmas: " +i);
                alunos = scan.nextInt();

                if (alunos <= 40){
                    invalido = true;
                }else {
                    System.out.println("Numeros de alunos invalido.");
                }
            }while (!invalido);

            soma += alunos;
        }

        double media = soma / turmas;

        System.out.println("Media: " + media);
    }
}
