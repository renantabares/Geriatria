package nivelamentoJava;

import java.util.HashMap;

public class ColecoesHashMap {
	
	public static void main(String[] args) {
		
		HashMap <String, String> chaveValor = new HashMap<String, String>();
		chaveValor.put("chave1", "valor1");
		chaveValor.put("chave2", "valor2");
		chaveValor.put("chave3", "valor3");
		
		//Obtendo o valor apartir da chave
		System.out.println(chaveValor.get("chave2"));
		   
		for (String key : chaveValor.keySet()) {
               //Capturamos o valor a partir da chave
               String value = chaveValor.get(key);
               System.out.println(key + " = " + value);
        }
	}
	
}
