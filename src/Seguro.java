
public class Seguro {
	private String nombre;
	private int nivel;
	private int precio;
	
	
	public Seguro(String nombre, int nivel, int precio) {
		super();
		this.nombre = nombre;
		this.nivel = nivel;
		this.precio = precio;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getNivel() {
		return nivel;
	}


	public void setNivel(int nivel) {
		this.nivel = nivel;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
	//Sobrescritura
	public String info(String nombre){
		return null;
	}
	
	
	public String info() {
		return "El dueño de del seguro es " +nombre+ ". El seguro esta a "
	     + nivel +" y tiene un precio de " + precio + "€";
	}

}
