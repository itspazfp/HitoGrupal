
public class Coche {
	
	private String tipo;
	private String marca;
	private String modelo;
	private String placa;
	protected int velocidad;
	protected int marcha;
	private Seguro seguro;
	
	
	public Coche(String tipo, String marca, String modelo, String placa, int velocidad, int marcha, Seguro seguro) {
		super();
		this.tipo = tipo;
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.velocidad = velocidad;
		this.marcha = marcha;
		this.seguro = seguro;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public int getVelocidad() {
		return velocidad;
	}


	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}


	public int getMarcha() {
		return marcha;
	}


	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}
	
	
	public Seguro getSeguro() {
		return seguro;
	}


	public void setSeguro(Seguro seguro) {
		this.seguro = seguro;
	}
	
	


	//Acelerar
	public void acelerar(int a) {

	    velocidad = velocidad + a;
	}
	
	//Frenar
	public void frenar(int f) {

	    velocidad = velocidad - f;

	}
	
	//Cambiar de marcha
	protected void cambiaMarcha(int marcha) {
	    this.marcha = marcha;

	}

	@Override
	public String toString() {
	    return "El tipo de vehiculo " + tipo + " de la marca " 
	+ marca + " modelo " + modelo + " va ha  " + velocidad +"km/h en"
	 + marcha + " marcha" +  ", Seguro: (" + seguro.info() + ")";
	    
	}
	
	
	
	
	
	
}