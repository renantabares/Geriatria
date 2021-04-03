package nivelamentoJava.exercicios;

import java.util.HashMap;
import java.util.Scanner;
import java.util.function.Function;

public class Salary {
	
	public static void main(java.lang.String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashMap <String, Double> funcionarios = new HashMap<String, Double>();
		System.out.println("Quantos funcion�rios voc� vai lan�ar?");
		int numfuncionarios = sc.nextInt();
		for(int i=0; i<numfuncionarios; i++) {
			System.out.println("Nome do "+(i+1)+"o funcion�rio: "+" de "+numfuncionarios);
			String nome = sc.next();
			System.out.println("n�mero de horas trabalhadas de "+nome+" : ");
			int numeroDeHorasTrabalhadas = sc.nextInt();
			System.out.println("valor da hora trabalhada de "+nome+" : ");
			Double valorDaHoraTrabalhada = sc.nextDouble();
			
			funcionarios.put(nome, calcSalario(numeroDeHorasTrabalhadas, valorDaHoraTrabalhada));			
		}
		
		
		for (String nome : funcionarios.keySet()) {
			Double salario = funcionarios.get(nome);
			System.out.println("funcionario "+nome+" receber� R$ "+salario);
		}
		
		sc.close();
	}
	
	public static Double calcSalario(int numHoras, Double valorDaHora) {
		return numHoras*valorDaHora;
	}

}
