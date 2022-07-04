package com.company.atv2;

import java.util.Scanner;

public class ValorDasVendas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = scan.nextLine();
        System.out.println("Digite o seu salário atual : ");
        double salarioAtual = scan.nextDouble();
        System.out.println("Digite o quanto você vendeu: ");
        double totalVendas = scan.nextDouble();
        if(totalVendas<=1500)
            System.out.println("Olá "+nome+" seu salário total é de R$ :"+(totalVendas*0.03+(salarioAtual)));
        else
            System.out.println("Olá "+nome+" seu salário total é de R$: "+(totalVendas*0.05+(salarioAtual)));
    }
}
