package ModuloDezComportamentoMemoriaArraysListaVetoresProblemaMaisVelho;

import java.util.Locale;
import java.util.Scanner;

public class Pricipal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		Pessoas pessoas [] = new Pessoas [n];
		
		for (int i = 0; i < n; i++) {
			
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			
			pessoas[i] = new Pessoas(nome, idade);
			
		}
		
		
		Pessoas maiorIdade = pessoas[0];
		Pessoas posicao;
		System.out.println("PESSOA MAIS VELHA: ");
		for(int i = 0; i < n; i++) {
			if (pessoas[i].getIdade() > maiorIdade.getIdade()) {
				maiorIdade = pessoas[i];
				posicao = pessoas[i];
				
				System.out.println(posicao.getNome());
				
			}
			
		}
		
		
		sc.close();

	}

}
