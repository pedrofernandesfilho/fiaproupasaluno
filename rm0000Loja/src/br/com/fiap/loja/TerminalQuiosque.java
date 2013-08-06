package br.com.fiap.loja;

import java.util.Scanner;

import br.com.fiap.quiosque.MoedaEstrangeiraProxy;

public class TerminalQuiosque {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MoedaEstrangeiraProxy converter = new MoedaEstrangeiraProxy();
		
		
		try {
			System.out.println("Digite o valor em Dolar:");
			
			Scanner teclado = new Scanner(System.in);
			
			int valorDolar = teclado.nextInt();
			
			int valorReal = converter.converterDolar(valorDolar);
			
			System.out.println("Valor em Real: " + valorReal);
			
			teclado.close();
			
		} catch (Exception e) {
			
			System.out.println("Erro: Tente Mais Tarde");
		}
	}


}
