package com.company.repeticaoatv2.Atv2;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pecentual = 0;
        int pecentual2 = 0;
        int pecentual3 = 0;
        int unidade = 0;
        int unidade2 = 0;
        int unidade3 = 0;
        for (int i = 0;i<5;i++){
            System.out.println("Digite a quantidade de vezes que você foi ao refeitório: ");
            int numero = scan.nextInt();
            if (numero<10){
                unidade++;
                pecentual = (unidade*100)/5;}
            else if (numero>=10&&numero<=15){
                unidade2++;
                pecentual2 = (unidade2*100)/5;}
            else
                unidade3++;
                pecentual3 = (unidade3*100)/5;

        }
        System.out.println(pecentual+ "% , foram menos que 10 vezes!");
        System.out.println(pecentual2+ "% , foram entre 10 e 15 vezes!");
        System.out.println(pecentual3+"%, mais que 15 vezes!");
    }
}
