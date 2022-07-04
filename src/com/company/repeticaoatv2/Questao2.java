package com.company.repeticaoatv2;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        int somaP=0;
        int quantidadeN= 0;
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i<=50; i++){
            System.out.println("Digite um número: ");
            int num = scan.nextInt();
            if (num >=0)
                somaP += num;
            else
                quantidadeN++;}
        System.out.println(somaP);
        System.out.println(quantidadeN);

    }

}
