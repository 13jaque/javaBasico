package com.cursojava.exercicios.aula14e15;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a letra: ");
        String letra = scan.next();

        /*switch (letra){
            case "a": case "e": case "i": case "o":
            case "u": System.out.println("Vogal");break;
            default: System.out.println("Consoante");
        }*/

        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")){
            System.out.println("Vogal");
        }else {
            System.out.println("Consoante");
        }


    }
}
