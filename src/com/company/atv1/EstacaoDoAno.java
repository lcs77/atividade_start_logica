package com.company.atv1;

import java.util.Scanner;

public class EstacaoDoAno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o dia: ");
        int dia = scan.nextInt();

        System.out.println("Digite o mês: ");
        int mes = scan.nextInt();

        System.out.println("Digite o Ano: ");
        int ano = scan.nextInt();


                if (dia <= 20 && mes <= 3 || mes == 12){
                    System.out.println("Verão no hemisfério sul");
                    System.out.println("Inverno no hemisfério norte");}

               else if (dia >20 && mes >=3 && mes < 6  || dia <22 && mes <=6){
                    System.out.println("Outono no hemisfério sul");
                    System.out.println("Primavera no hemisfério norte");}

               else if (dia >=22 && mes >=6 && mes < 9  || dia <21 && mes <=9){
                    System.out.println("Inverno no hemisfério sul");
                    System.out.println("Verão no hemisfério norte");}

               else if (dia >=22 && mes >=9 || dia <21 && mes <=12){
                    System.out.println("Primavera no hemisfério sul");
                    System.out.println("Outono no hemisfério norte");}


        }
    }

