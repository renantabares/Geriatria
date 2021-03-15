package nivelamentoJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// tipos primitivos
		int variavelInt = 10;
		long variavelPrimitivaLong = 10l;
		float variavelPrimitivaFloat = 10;
		double variavelPrimitivaDouble = 10.00;
		// wrappers
		String helloWord = "Hello World!";
		Double variavelDouble = 10.00;
		Float variavelFloat = 10F;
		Integer variavelInteger = 10;
		Long variavelLong = (long) 10;

		System.out.println("Primitiva int :" + variavelInt);
		System.out.println("Primitiva long :" + variavelPrimitivaLong);
		System.out.println("Primitiva float :" + variavelPrimitivaFloat);
		System.out.println("Primitiva double :" + variavelPrimitivaDouble);
		System.out.println("Integer :" + variavelInteger);
		System.out.println("Long " + variavelLong);
		System.out.println("Float :" + variavelFloat);
		System.out.println("Double: " + variavelDouble);
		System.out.println(helloWord);

	}
}
