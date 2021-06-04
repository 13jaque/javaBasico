package com.cursojava.comandowhile;

public class LoopFor {

    public static void main(String[] args) {

        //for normal = crescente
        for (int i = 0; i < 5; i++){
            System.out.println("i tem valor: " +i  );
        }
        //for normal decrescente
        for (int i = 5; i > 0; i--){
            System.out.println("i tem valor: " +i  );
        }
        //Com mais de uma variavel
        //contagem de 1 a 10 e depois de 10 a 9
        for (int i = 1, j = 10; i <= 10; i++, j--){
            System.out.println("i = " + i + " - j = " + j);
        }
        //Partes ausentes
        int count = 0;
        int j =10;
        for (;count < j;){
            System.out.println("i = " + count);
            count ++;
        }
        // loop sem corpo
        int soma = 0;
        for (int i = 1;i < 5; soma += i++){
            System.out.println("o valor da soma é: " +soma);
        }
    }
}
