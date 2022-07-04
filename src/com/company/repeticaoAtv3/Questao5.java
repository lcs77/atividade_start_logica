package com.company.repeticaoAtv3;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double alturaAluno ;
        double alturaMedia = 0;
        double idadeMedia = 0;
        double somaidade = 0;
        double somaaltura = 0;
        int idadeAluno ;
        int quantidadeIdade = 0;
        int quantidadealtura = 0;
        int contador = 0 ;

        while (contador<87){
            System.out.println("Digite a sua idade: ");
            idadeAluno = scan.nextInt();
            System.out.println("Digite a sua altura: ");
            alturaAluno = scan.nextDouble();

            if (alturaAluno<=1.70){
                quantidadeIdade++;
                somaidade += idadeAluno;
                idadeMedia = somaidade /quantidadeIdade ;}
            if(idadeAluno>20){
                quantidadealtura++;
                somaaltura += alturaAluno;
                alturaMedia = somaaltura/quantidadealtura;}
            contador++;

        }
        System.out.println(idadeMedia);
        System.out.println(alturaMedia);
    }
}


