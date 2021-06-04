package com.cursojava.exercicios.aula16e17;

public class Exercicio24 {

    public static void main(String[] args) {

        System.out.println("Preço do pão: R$ 0.18");
        System.out.println("Panificadora Pão de ontem - Tabela de preços");

        for (int i = 1; i <= 50; i++){
            System.out.println(i + " - R$ " + (0.18*i));
        }
    }
}
