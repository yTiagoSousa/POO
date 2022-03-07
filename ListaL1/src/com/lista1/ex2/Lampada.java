package com.lista1.ex2;

public class Lampada {
	int qntClicks;
	boolean estado;

	void clickInterruptor() {
		if (this.qntClicks < 7) {
			this.qntClicks++;
			mudarEstado();
		}else 
			this.estado = false;
	}

	void mudarEstado() {
		if (this.estado == true)
			this.estado = false;
		else 
			this.estado = true;
	}

	boolean getEstado() {
		return this.estado;
	}

}

//Exercício 1.2.Implemente uma classe Lâmpada. Toda lâmpada pos-sui um estado (on/off).
//Sabe-se que as lâmpadas podem ter seu estadotrocado (click do interruptor). Será necessário 
//também uma funcionali-dade para checar o estado atual da lâmpada. Uma lâmpada estraga após uma 
//quantidade de clicks (o click não troca mais o estado deixando-aeternamente em off) e esta 
//depende da lâmpada. Implemente esta situação e seu teste.