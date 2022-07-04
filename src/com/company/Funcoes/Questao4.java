package com.company.Funcoes;

import java.util.Arrays;
import java.util.Scanner;

public class Questao4 {
    public static void crescente(){

        Scanner scan = new Scanner(System.in);
        int[] crescente= new int[3];
        for (int i=0; i< crescente.length;i++){System.out.println("Digite um número");
           crescente[i] =(scan.nextInt());
        }

        System.out.println("Ordem crescente");
        for (int i=0; i< crescente.length;i++){

            System.out.println(crescente[i]);

        }
        Arrays.sort(crescente);
        for (int i=0; i< crescente.length;i++){

            System.out.println(crescente[i]);

        }

    }

    public static void main(String[] args) {

        crescente();
    }
}
