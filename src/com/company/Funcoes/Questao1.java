package com.company.Funcoes;

import java.util.Scanner;

public class Questao1 {

    public static void barraca(int a, int b){
         double valor=0;

        switch (a){
            case 1:
                System.out.println("R$: "+ b*4);
                break;
            case 2:
                System.out.println("R$: "+ b*4.5);
                break;
            case 3:
                System.out.println("R$: "+ b*5);
                break;
            case 4:
                System.out.println("R$: "+ b*2);
                break;
            case 5:
                System.out.println("R$: "+ b*1.5);
                break;
        }




    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite qual produto escolhido : ");
        int a = scan.nextInt();
        System.out.println("Digite oa quantidade dos itens: ");
        int b = scan.nextInt();
        barraca(a,b);

    }
}
