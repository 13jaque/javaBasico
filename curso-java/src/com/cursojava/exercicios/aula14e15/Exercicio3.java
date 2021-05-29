package com.cursojava.exercicios.aula14e15;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu genero (F/M): ");
        String genero = scan.next();

       /*switch (genero){
           case "f": System.out.println("Feminino");break;
           case "m": System.out.println("Masculino");break;
           default:System.out.println("Genero inválido!");
       }*/

        if (genero.equalsIgnoreCase("F")){
            System.out.println("Feminino");
        }else if (genero.equalsIgnoreCase("m")){
            System.out.println("Masculino");
        }else {
            System.out.println("Genero inválido!");
        }

    }
}
