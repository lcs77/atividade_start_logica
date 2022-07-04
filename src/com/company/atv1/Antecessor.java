package com.company.atv1;

import java.util.Scanner;

public class Antecessor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite um número: ");
        int num = scan.nextInt();
        num -= 1;
        System.out.println("o seu antecessor é: " + num);


    }
}
