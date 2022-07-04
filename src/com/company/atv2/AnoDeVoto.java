package com.company.atv2;

import java.util.Scanner;

public class AnoDeVoto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o seu ano de nascimento: ");
        int anoNascimento = scan.nextInt();
        System.out.println("Digite o atual: ");
        int anoAtual = scan.nextInt();

        if (anoAtual-anoNascimento > 16)
            System.out.println("Pode votar");
        else
            System.out.println("Não pode votar este ano");
    }
}
