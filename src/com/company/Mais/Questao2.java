package com.company.Mais;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um código de operadora: ");
        int codigoOperadora = scan.nextInt();
        switch (codigoOperadora){
            case 61 :
                System.out.println("Brasília");
                break;
            case 71 :
                System.out.println("Salvador");
                break;
            case 11 :
                System.out.println("São Paulo");
                break;
            case 21 :
                System.out.println("Rio de Janeiro");
                break;
            case 32 :
                System.out.println("Juiz de fora");
                break;
            case 19 :
                System.out.println("Campinas");
                break;
            case 27 :
                System.out.println("Vitória");
                break;
            case 31 :
                System.out.println("Belo Horizonte");
                break;
            default:
                System.out.println("Código inválido");
        }

    }
}
