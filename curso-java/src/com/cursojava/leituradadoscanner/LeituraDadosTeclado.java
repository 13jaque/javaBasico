package com.cursojava.leituradadoscanner;

import java.util.Scanner;

public class LeituraDadosTeclado {

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        /*System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome completo é:  " + nomeCompleto);

        System.out.println("Digite seu primeiro nome: ");
        String primeiroNome = scan.next();
        System.out.println("Seu primeiro nome é: " + primeiroNome );*/

        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();
        String anos = " anos!";
        System.out.println("Sua idade é: "+idade + anos);
    }
}
