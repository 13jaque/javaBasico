package com.cursojava.exercicios.aula16e17;

public class Exercicio9 {

    public static void main(String[] args) {

        System.out.println("Numeros impares: ");

        for (int i = 1; i < 50; i++){
            //(i% 2 != 0)
            if (i % 2 == 0){
            }else {
                System.out.print(i + " - ");
            }
        }
    }
}
