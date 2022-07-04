package com.company.atv1;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {Scanner scan = new Scanner(System.in);
        System.out.println("Informe o seu salário atual: ");
        double salarioMensal = scan.nextDouble();
        System.out.println("Informe o reajuste do seu salário: ");
        double salarioReajuste = scan.nextDouble();
        double percentualSalario = (salarioReajuste*100)/salarioMensal;

        System.out.printf("O reajuste percentual do almento do salário é: %.2f%n ", percentualSalario );
        System.out.printf("O Salário reajustado é de:  " + salarioMensal+salarioReajuste);



    }

}
