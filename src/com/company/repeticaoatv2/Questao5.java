package com.company.repeticaoatv2;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        int quantidadePar = 0;
        int quantidadeImpar = 0;
        int parar;
        Scanner scan = new Scanner(System.in);

        for(int i = 1; i<=50;i++){


            System.out.println("Digite um número: ");
            int num = scan.nextInt();
            if (num%2==1) {
                quantidadeImpar++;
                System.out.println("impar "+ quantidadeImpar);
            }else {
                quantidadePar++;
                System.out.println("par "+quantidadePar);}
            if (i%5==0){
                System.out.println("DESEJA PARAR? Digite 1 para parar: ");
                parar = scan.nextInt();
                if (parar==1){
                    System.out.println("Quantidade de par :" + quantidadePar);
                    System.out.println("Quantidade de par :" + quantidadeImpar);
                    break;}
            }





        }
    }
}
