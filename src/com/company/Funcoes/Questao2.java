package com.company.Funcoes;

import java.util.Scanner;

public class Questao2 {
    public static void quadrante(float x, float y){

        if (x==0&&y==0)
            System.out.println("Origem");

        else if (x>0&&y>0)
            System.out.println("Q1");

        else if (x<0&&y>0)
            System.out.println("Q2");

        else if (x<0&&y<0)
            System.out.println("Q3");

        else if (x>0&&y<0)
            System.out.println("Q4");
        else if (x==0&&(y<0||y>0))
            System.out.println("Eixo X");
        else if ((x>0||x<0)&&y==0)
            System.out.println("Eixo Y");

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a coordenada de  x: ");
        float x = scan.nextFloat();
        System.out.println("Digite a coordenada de  y: ");
        float y = scan.nextFloat();
        quadrante(x,y);
    }
}
