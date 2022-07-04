package com.company.Mais;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scan.nextInt();
        for (int i=0; i <=numero;i++){
           if (i%2==1){
               System.out.println(i);
           }
        }
    }
}
