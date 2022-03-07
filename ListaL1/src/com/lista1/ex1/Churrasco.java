package com.lista1.ex1;

public class Churrasco {
	double qtdCarne;						//Atributos do objeto
	
	void verificarConsumo(Pessoa pessoa) {	//Metodo Verificar Consumo de Carne
		if(pessoa.vegetariana==true || pessoa.idade<=3)
			this.qtdCarne=this.qtdCarne+0;
			else
		if(pessoa.idade>=4 && pessoa.idade<=12)
			this.qtdCarne=this.qtdCarne+1;
			else
		if(pessoa.idade>13)
			this.qtdCarne=this.qtdCarne+2;
	}
	
	double getQtdCarne(){				//Metodo obter Consumo Medio de carne
		return this.qtdCarne;
	}

}