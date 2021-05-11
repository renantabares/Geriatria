package nivelamentoJava.oo;

import java.util.Locale;

import nivelamentoJava.oo.entities.Conta;
import nivelamentoJava.oo.entities.ContaEmpresa;
import nivelamentoJava.oo.entities.Poupanca;
import nivelamentoJava.oo.exception.JavaBankException;

public class JavaBank {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		System.out.println("Javabank");
		System.out.println("CONTA COMUM");
		Conta conta = new Conta(123, "Renan", 200.00);
		System.out.println(conta);
		conta.depositar(800.00);
		System.out.println(conta);
		conta.sacar(500.00);
		System.out.println(conta);
		System.out.println("POUPANÇA");
		Poupanca poupanca = new Poupanca(321, "Renan Poupador", 100.00);
		System.out.println(poupanca);
		poupanca.depositar(50.00);
		System.out.println(poupanca);
		poupanca.sacar(30.00);
		System.out.println(poupanca);
		ContaEmpresa contaEmpresa = new ContaEmpresa(231, "Renan Empresário", 1000.00, 500.00);
		try {
			System.out.println(contaEmpresa.realizarEMprestimo(510.00, 12));
		}catch (JavaBankException e){
			System.out.println("empréstimo não autorizado: "+e.getMessage() );
		}
		System.out.println(contaEmpresa);
	}

}
