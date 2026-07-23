package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo();
		r1.base = 4;
		r1.altura = 2;
		double perimetro = r1.calcularPerimetro();
		System.out.println("El perímetro del rectángulo es: " + perimetro);
	}

}
