package com.cursojava.condicionais;

import java.util.Scanner;

public class MultiplosIfElse {

    public static void main(String[] args) {

        //barato <= 10
        //10 > valor < 15 - pedir desconto
        //15 >= valor 17 - pesquisar mais
        // >= 17 - muito caro

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o preço do item: ");
        double valor = scan.nextDouble();

        if (valor <= 10){
            System.out.println("Esta barato!");

        } else if (valor > 10 && valor < 15){
            System.out.println("Pedir um desconto");

        } else if (valor >= 15 && valor < 17){
            System.out.println("Pesquisar mais!");

        } else{
            System.out.println("Muito caro!");
        }
    }
}
