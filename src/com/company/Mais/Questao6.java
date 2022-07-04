package com.company.Mais;

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite quantas amostras: ");
        int amostras = scan.nextInt();
        int quantidade;
        int somaQuantidade = 0;
        double somaR=0;
        double somaC=0;
        double somaS=0;
        String cobaia;

        while (amostras>0){
            amostras--;
            System.out.println("Digite a quantidade de cobaias: ");
            quantidade = scan.nextInt();
            somaQuantidade+=quantidade;
            System.out.println("INforme qual tipo de cobaia abaixo:\n c = coelho \n r = rato \n s = sapo ");
            cobaia = scan.next();
            switch (cobaia){
                case "c":

                    somaC+=quantidade;
                    break;
                case "r":

                    somaR+=quantidade;
                    break;
                case "s":

                    somaS+=quantidade;
                    break;
            }
        }


        System.out.println("Total: " + somaQuantidade+" cobaias");
        System.out.println("Total Coelhos: "+ somaC);
        System.out.println("Total Sapos: "+ somaS);
        System.out.println("Total Ratos: "+ somaR);
        System.out.println("Percentual Ratos: "+ (somaR*100)/somaQuantidade +"%" );
        System.out.println("Percentual Sapos: "+(somaS*100)/somaQuantidade+"%" );
        System.out.println("Percentual Coelhos: "+ (somaC*100)/somaQuantidade+"%" );


    }
}
