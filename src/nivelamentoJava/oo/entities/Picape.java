package nivelamentoJava.oo.entities;

public class Picape extends Carro{
	
	private Double carga;

	public Picape(Double velocidade, String modelo, Double carga) {
		super(velocidade, modelo);
		this.carga = carga;
	}

	public Double getCarga() {
		return carga;
	}

	public void setCarga(Double carga) {
		this.carga = carga;
	}
	
	
	

}
