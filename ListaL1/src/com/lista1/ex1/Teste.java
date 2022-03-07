package com.lista1.ex1;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa p1 = new Pessoa("Jose" , Sexo.Masculino , 12 , false);
		Pessoa p2 = new Pessoa("Flavia" , Sexo.Feminino ,02 , true);
		Pessoa p3 = new Pessoa("Jaco", Sexo.Masculino , 55 , false);
		Pessoa p4 = new Pessoa("Jucelino" , Sexo.Masculino , 500 , true);
		
		Churrasco churrascoDeDomingo = new Churrasco();
		
		churrascoDeDomingo.verificarConsumo(p1);
		churrascoDeDomingo.verificarConsumo(p2);
		churrascoDeDomingo.verificarConsumo(p3);
		churrascoDeDomingo.verificarConsumo(p4);
		
		System.out.println(churrascoDeDomingo.getQtdCarne());
	}
}
