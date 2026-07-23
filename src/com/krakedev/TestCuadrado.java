package com.krakedev;

public class TestCuadrado {

    public static void main(String[] args) {
        Cuadrado c1 = new Cuadrado();
        Cuadrado c2 = new Cuadrado();
        Cuadrado c3 = new Cuadrado();

        c1.lado = 4;
        c2.lado = 5;
        c3.lado = 6;

        System.out.println("--- Cuadrado 1 ---");
        System.out.println("Lado: " + c1.lado);
        System.out.println("Área: " + c1.calcularArea());
        System.out.println("Perímetro: " + c1.calcularPerimetro());

        System.out.println("--- Cuadrado 2 ---");
        System.out.println("Lado: " + c2.lado);
        System.out.println("Área: " + c2.calcularArea());
        System.out.println("Perímetro: " + c2.calcularPerimetro());

        System.out.println("--- Cuadrado 3 ---");
        System.out.println("Lado: " + c3.lado);
        System.out.println("Área: " + c3.calcularArea());
        System.out.println("Perímetro: " + c3.calcularPerimetro());
    }

}