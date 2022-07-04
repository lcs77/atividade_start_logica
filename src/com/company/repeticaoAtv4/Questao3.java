package com.company.repeticaoAtv4;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite quantos produtos você vai dar entrada: ");
        int product = scan.nextInt();
        double calculoProduto =0;
        double reservaDoProduto= 0;

        for (int i =1; i<= product; i++){
            System.out.println("Digite o código do produto");
            int codigoDoProduto = scan.nextInt();
            System.out.println("Digite a quantidade do produto");
            int quantidadeDoProduto = scan.nextInt();
            System.out.println("Digite o valor do produto");
            double valorDoProduto = scan.nextDouble();
            System.out.println();
            calculoProduto= quantidadeDoProduto * valorDoProduto;
            reservaDoProduto += calculoProduto;
        }
        System.out.println("Valor total da compra: "+reservaDoProduto);
    }
}
