package com.company.atv2;

import java.util.Scanner;

public class maca {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de maçãs que deseja comprar: ");
        int macan = scan.nextInt();
        if (macan<12){
            System.out.println("valor das maçãs : " + macan * 1.30);
        }else
            System.out.println("valor das maçãs : " + macan * 1.0);
    }
}
