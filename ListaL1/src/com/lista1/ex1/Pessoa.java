package com.lista1.ex1;

public class Pessoa{
	String nome;									//Atributos do objeto
	Sexo sexo;
	int idade;										
	boolean vegetariana;
	
	Pessoa(String nome, Sexo sexo, int idade, boolean vegetariana){ 		//Construtor
		  this.nome = nome;
		  this.sexo = sexo;
		  this.idade = idade;
		  this.vegetariana = vegetariana;
	}
	
}