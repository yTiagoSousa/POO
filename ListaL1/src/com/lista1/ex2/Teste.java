package com.lista1.ex2;

public class Teste {

	public static void main(String[] args) {		
		Lampada lamp = new Lampada();
		for (int x = 0 ; x < 10 ; x++ ) {
			lamp.clickInterruptor();
			System.out.println( lamp.getEstado() );
		}
	}
}
