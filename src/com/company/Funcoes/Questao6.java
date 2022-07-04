package com.company.Funcoes;

import java.util.Scanner;

public class Questao6 {
    public static void primo(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = scan.nextInt();
        boolean condicao = true;

        if (num>0){
            for (int f = 2 ; f<num;f++){
                if (num%f==0){
                    condicao=false;
                    System.out.println(f);
                }
            }}else
            System.out.println("");
        System.out.println(condicao);

    }

    public static void main(String[] args) {
        primo();
    }
}
