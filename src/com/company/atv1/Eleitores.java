package com.company.atv1;

import java.util.Scanner;

public class Eleitores {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a quantidade de eleitores de sua cidade: ");
        int quantidadePessoas = scan.nextInt();
        System.out.println("Informe a quantidade de votos nulos: ");
        int votoNulo = scan.nextInt();
        System.out.println("Informe a quantidade de votos em branco: ");
        int votoBranco = scan.nextInt();
        int percentualNulo = (votoNulo*100)/quantidadePessoas;
        int percentualBranco = (votoBranco*100)/quantidadePessoas;
        int quantidadeValido = (quantidadePessoas-(votoBranco+votoNulo));
        int percentualValido = (quantidadeValido*100)/quantidadePessoas;
        System.out.println("O percentual de votos em branco foi de : "+ percentualBranco + "%");
        System.out.println("O percentual de votos nulo foi de : "+ percentualNulo + "%");
        System.out.println("O percentual de votos válidos : "+ percentualValido + "%");


    }

}
