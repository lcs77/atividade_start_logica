package com.company;

import java.util.Scanner;

public class LerIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int somaIdade =0;
        int quantidadeIdade = 0;
        double media;

        while (true){
            System.out.println("Digite uma idade: ");

            int idade = scan.nextInt();
            somaIdade+=idade;
            quantidadeIdade++;
            media = somaIdade/quantidadeIdade;
            if (idade == 0){
                quantidadeIdade -=1;
                break;}
        }
        System.out.println("A média das idades é de : "+media);
        System.out.println("A quantidade das idades é de : "+quantidadeIdade);
    }
}
