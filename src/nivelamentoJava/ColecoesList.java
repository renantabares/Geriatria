package nivelamentoJava;

import java.util.ArrayList;
import java.util.List;

public class ColecoesList {

	public static void main(String[] args) {
		List <String> lista = new ArrayList<String>();
		lista.add("texto1");
		lista.add("texto2");
		lista.add("texto3");
		lista.add("texto4");
		
		System.out.println(lista);
		
		for (String item : lista) {
			System.out.println(item);
		}
	
		System.out.println("expressão lambda");
		lista.forEach(item->System.out.println(item));
		
		

	}

}
