package nivelamentoJava.oo;

import java.util.Locale;

import nivelamentoJava.oo.entities.Carro;
import nivelamentoJava.oo.entities.Picape;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Carro fusca = new Carro(80, "fusca");
		Carro polo = new Carro (200, "Polo");
		Carro mini = new Carro (180, "mini");
		Carro beetle = new Carro (180, "beetle");
		Picape saveiro = new Picape(160, "Saveiro", 1.500);
		
		System.out.println(fusca);
		System.out.println(polo);
		System.out.println(mini);
		System.out.println(beetle);
		System.out.println(saveiro);
		
		

	}

}
