package com.company.repeticaoAtv3;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número : ");
        int num = scan.nextInt();

        int fatorial = num;

        while (num>1){
            fatorial= fatorial*(num-1);
            num--;
        }
        System.out.println(fatorial);
    }
}
