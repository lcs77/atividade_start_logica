package com.company.atv2;

import java.util.Scanner;

public class OrdemCrescente {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número ");
        int numero1 = scan.nextInt();
        System.out.println("Digite outro número: ");
        int numero2 = scan.nextInt();
        if(numero1 == numero2){
            System.out.println("erro");}
        else if (numero1>numero2){
            System.out.println(numero2+ " , "+ numero1);
        }else
            System.out.println(numero1+ " , "+ numero2);


    }
}
