package com.lista1.ex4;

public class Triangulo {
	
	double lado1;
	double lado2;
	double lado3;
	double area;
	double perimetro;
	
	public Triangulo()
	{
		lado1=10;
		lado2=10;
		lado3=10;
	}

	void calcularArea()
	{
		this.area=lado1*(Math.sqrt(3)/2);
		
	}
	
	void calcularperimetro()
	{
		
		this.perimetro=lado1*3;
	}

	 double getPerimetro() {
		return this.perimetro;
	}
	
	 double getArea() {
		return this.area;
	}
}
