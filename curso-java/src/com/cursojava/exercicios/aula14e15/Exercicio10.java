package com.cursojava.exercicios.aula14e15;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual turno você estuda (M-V-N): ");
        String turno = scan.next();
        //m = matutino
        //v = vespertino
        //n = noturno
        switch (turno){
        case "M":
        case "m": System.out.println("Bom Dia!");break;
        case "V":
        case "v": System.out.println("Boa tarde!");break;
        case "N":
        case "n": System.out.println("Boa noite!");break;
        default:System.out.println("Não existe");

       }
    }
}
