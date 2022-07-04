package com.company;

import java.util.Scanner;

public class Raiz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double valor = scan.nextDouble();
        System.out.println("101 -> Para raiz quadrada \n 102-> A metade \n 103-> 10% do valor \n 104 -> O dobro ");

        int operacao = scan.nextInt();
        switch(operacao){

            case 101 :
                System.out.println(" A raiz quadrada do valor escolhido : " + (valor * valor));
                break;
            case 102:
                System.out.println(" A metade do valor : " + (valor / 2));
                break;
            case 103:
                System.out.println(" 10% do valor : " + (valor * 0.10));
                break;
            case 104:
                System.out.println(" O dobro do valor : " + (valor *2));
                break;
            default:
                System.out.println(" Digite um número válido");
        }
    }
}
