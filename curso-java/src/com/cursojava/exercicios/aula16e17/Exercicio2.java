package com.cursojava.exercicios.aula16e17;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean acesso = false;
        do {
            System.out.println("Nome de usuario: ");
            String nome = scan.next();

            System.out.println("Senha: ");
            String senha = scan.next();

            if (nome.equalsIgnoreCase(senha)) {
                acesso = false;
                System.out.println("Erro, nome e senha não pode ser igual!");
            } else{
                acesso = true;
                System.out.println("Acesso autorizado!");

            }
        }while (!acesso);

    }
}
