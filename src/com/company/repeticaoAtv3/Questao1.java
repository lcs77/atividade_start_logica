package com.company.repeticaoAtv3;

public class Questao1 {
    public static void main(String[] args) {
        int contador = 0;
        int soma = 0;
        while (contador<11){
            contador++;
            if (contador<=10){
            soma+=contador;
            System.out.println(soma);}

        }
        System.out.println(" A quantidade dos inteiros"+contador);
        System.out.println("A soma dos interiros" +soma);

    }
}
