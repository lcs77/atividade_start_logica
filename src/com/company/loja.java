package com.company;

import java.util.Scanner;

public class loja {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    System.out.println("Bem vindo a nossa loja de móveis");


    System.out.println("Digite o valor da compra: ");
    double valorPagamento= scan.nextDouble();
    System.out.println(" 1 >> Para Pagamento a vista \n 2 >> Para Pagamento no prazo de 30 dias \n 3 >> Para" +
            " Pagamento no prazo de 60 dias \n 4 >> Para Pagamento no prazo de 90 dias \n" +
            " 5 >> Para Pagamento no débito \n 6 >> Para Pagamento no crédito \n \n Escolha sua forma de pagamento:");


    int numeroPagamento= scan.nextInt();
    switch(numeroPagamento) {

        case 1:
            System.out.println("Pagamento a vista  \n valor final: "+ (valorPagamento - (valorPagamento*0.10)));
            break;
        case 2:
            System.out.println("Pagamento no prazo de 30 dias \n valor final:" +
                    " " + (valorPagamento -(valorPagamento*0.5)));
            break;
        case 3:
            System.out.println("Pagamento no prazo de 60 dias \n valor final: " + valorPagamento);
            break;
        case 4:
            System.out.println("Pagamento no prazo de 90 dias \n valor final: " + (valorPagamento +(valorPagamento*0.5)));
            break;
        case 5:
            System.out.println("Pagamento no débito \n valor final: " + (valorPagamento +(valorPagamento*0.8)));
            break;
        case 6:
            System.out.println("Pagamento no crédito \n valor final: " + (valorPagamento +(valorPagamento*0.7)));
            break;
        default:
            System.out.println("Digite um número válido");
    }
    }
}
