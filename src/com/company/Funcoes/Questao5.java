package com.company.Funcoes;

import java.util.Scanner;

public class Questao5 {
    public static void media(){
        Scanner scan = new Scanner(System.in);
        double resultado;
        System.out.println("doigite a nota 1:");
        double a = scan.nextDouble();
        System.out.println("doigite a nota 2:");
        double b = scan.nextDouble();
        System.out.println("doigite a nota 3:");
        double c = scan.nextDouble();

        while (a<0&&a>10){
            System.out.println("Digite um valor válido");
            a = scan.nextDouble();}
        while (b<0&&b>10){
            System.out.println("Digite um valor válido");
            a = scan.nextDouble();}
        while (c<0&&b>10){
            System.out.println("Digite um valor válido");
            a = scan.nextDouble();}




        System.out.println("Digite qual tipo de média:\n A: Aritmética \n P : Ponderada \n H: Harmônica");
        String mediaAPH = scan.next();
        switch (mediaAPH){
            case "A":
                resultado = (a + b + c) / 3;
                System.out.println(resultado);
                break;
            case  "P":
                resultado = (a*5)+(b*3)+(c*2)/10;
                System.out.println(resultado);
                break;
            case  "h":
                resultado = 3/(1/a +1/b+1/c);
                System.out.println(resultado);
                break;
            default:
                System.out.println("Digite uma letra válida");
        }
    }

    public static void main(String[] args) {
        media();

    }
}
