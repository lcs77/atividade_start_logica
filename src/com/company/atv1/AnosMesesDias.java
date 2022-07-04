package com.company.atv1;

import java.util.Scanner;

public class AnosMesesDias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos anos você tem? ");
        int idade = scan.nextInt();
        System.out.println("Quantos meses? ");
        int meses = scan.nextInt();
        System.out.println("Quantos dias? ");
        int dias = scan.nextInt();
        if (meses <=12 && dias<=30) {
            int resultado = (idade * 365) + (meses * 30) + dias;
            System.out.println("Sua idade em dias é:  " + resultado);
        }

    }
}
