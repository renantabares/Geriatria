package nivelamentoJava;

public class StringExample {

	public static void main(java.lang.String[] args) {
		String texto= " Funcoes basicas da classe string ";
		//Formatar
		System.out.println("######ALTERANDO TODA STRING PARA MAIUSCULO E MINUSCULO#######");
		String textoUpperCase = texto.toUpperCase();
		System.out.println("upercase exemplo: "+textoUpperCase);
		String textoLowerCase = texto.toLowerCase();
		System.out.println("lower case exemplo: "+textoLowerCase);
		String semEspacoInicioeFim = texto.trim();
		System.out.println("#####SEM ESPACO NO INICIO E FIM######");
		System.out.println("sem espaço no inicio e fim ex: "+semEspacoInicioeFim);
		//Manipulação de String
		System.out.println("#####QUEBRANDO POE POSIÇÃO DA STRING#####");
		System.out.println("ex quebrando string apartir de da posição (17)-> "+texto.substring(17));
		System.out.println("ex quebrando string apartir de da posição (0 a 17)"+texto.substring(0, 17));
		System.out.println("####QUEBRANDO APARTIR DE UMA CHAR OU FRAÇÃO DE STRING####");
		String deixaAMaiusculo = texto.replace("a", "A");
		System.out.println("substituir (char) letras de uma string->"+deixaAMaiusculo);
		String substituiPalavra = texto.replaceAll("basicas", "iniciais"); 
		System.out.println("substituir (string) palavra de uma string-> "+substituiPalavra);
		
		//quebra palavra a palavra apartir de cada espaço
		String[] listaDeString = texto.split(" ");
		System.out.print("ex, quebrando um texto em um vetor de palavras:");
		for (String item : listaDeString) {
			System.out.println(item);
		}
		
	}

}
