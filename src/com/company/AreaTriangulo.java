package com.company;

public class AreaTriangulo {
    public static void triangulo(double base, double altura) {
        double res= (base * altura) /2;
        System.out.println(res);
    }

    public static void main(String[] args) {
        triangulo(18,14);
    }
}
