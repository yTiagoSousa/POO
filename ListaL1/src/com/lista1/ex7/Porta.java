package com.lista1.ex7;

public class Porta {
	boolean isOpean;
	int numAberturas;
	
	void abrir(){
		numAberturas++;
		isOpean=true;
		System.out.println("Porta Abriu");
	}
	void fechar() {
		isOpean=false;
		System.out.println("Porta Fechou");
	}
}
