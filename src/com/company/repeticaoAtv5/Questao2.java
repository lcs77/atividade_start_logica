package com.company.repeticaoAtv5;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int carro2 = 0;//km/h
        int carro =0;

        System.out.println("Digite o valor em km: ");
        int km = scan.nextInt();
        for (int i=0; i<=km;i++){
            carro = i;
            carro2 = carro*2;
        }
        System.out.println(carro2 + "Minutos");
    }
}
