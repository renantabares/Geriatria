package nivelamentoJava;

import java.util.Scanner;

public class Colecoes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		//
		String[] vetorString = new String[4];
		for (int i = 0; i < 4; i++ ) {
			System.out.println("digite o "+(i+1)+"º texto de 4");
			vetorString[i] = sc.next();
			System.out.println((i+1)+"º texto digitado: "+vetorString[i]);
		}
		System.out.println("textos digitados no vetor");
		for (int i =0; i < vetorString.length; i++) {
			System.out.println(vetorString[i]);
		}

	}

}
