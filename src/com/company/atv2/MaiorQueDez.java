package com.company.atv2;

import java.util.Scanner;

public class MaiorQueDez {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int valor = scan.nextInt();
        if (valor<10) {
            System.out.println("Valor menor que 10");
        }else if (valor>10){
            System.out.println("Valor maior que 10");}
        else
            System.out.println("valor igual a 10");
    }
}
