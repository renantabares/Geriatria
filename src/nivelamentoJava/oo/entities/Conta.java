package nivelamentoJava.oo.entities;

public class Conta {
	private Integer numeroDaConta;
	private String titular;
	private Double saldo;

	public Conta(Integer numeroDaConta, String titular, Double saldo) {
		this.numeroDaConta = numeroDaConta;
		this.titular = titular;
		this.saldo = saldo;
	}

	public Conta() {

	}

	public Integer getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(Integer numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public void sacar(Double valor) {
		if (valor < this.saldo) {		
			setSaldo(this.saldo - valor);
		}		
	}
	public String depositar (Double valor) {
		this.saldo += valor;
		return "Deposito realizado com sucesso!";
	}
	
	@Override
	public String toString() {
		return "Conta numeroDaConta = " + numeroDaConta + ", titular = " + titular + ", saldo = " + String.format("%.2f", this.saldo);
	}

}
