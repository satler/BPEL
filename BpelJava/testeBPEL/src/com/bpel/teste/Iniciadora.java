package com.bpel.teste;

import com.bpel.libos.Functions;

public class Iniciadora {

	public static void main(String[] args) {
		System.out.println("iniciando o bagulhao");
		Functions fun = new Functions();
		fun.executarVoid();
		fun.executarString();
		fun.executarStringParameters("lambao");
		
	}

}
