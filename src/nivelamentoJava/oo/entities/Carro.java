package nivelamentoJava.oo.entities;

public class Carro {

	Integer velocidade;
	private String modelo;

	public Carro(Integer velocidade, String modelo) {
		this.velocidade = velocidade;
		this.modelo = modelo;
	}

	public Carro() {

	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void acelerar() {

	}

	public void frear() {

	}

	public void ascenderFarol() {

	}

	public String toString() {
		return "modelo: " + this.modelo + " velocidade: " + this.velocidade;

	}

}
