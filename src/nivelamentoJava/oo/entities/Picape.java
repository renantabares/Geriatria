package nivelamentoJava.oo.entities;

public class Picape extends Carro {

	private Double carga;

	public Picape(Integer velocidade, String modelo, Double carga) {
		super(velocidade, modelo);
		this.carga = carga;
	}

	public Picape() {

	}

	public Double getCarga() {
		return carga;
	}

	public void setCarga(Double carga) {
		this.carga = carga;
	}

	public String toString() {
		return "Modelo: " + this.getModelo() + " velocidade: " + this.velocidade + " carga: " + String.format("%.3f", this.getCarga());
	}

}
