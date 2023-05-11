package PPI;

public class veterinaria {
	String nombre;
	String direccion;
	public int numero;
	
	public veterinaria() {
		nombre = "Diego";
		direccion = "calle 91 carrera 41a";
		numero = 12345;
	}
	
	public void setnombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getnombre() {
		return nombre;
	}
	
	public void setdireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getdireccion() {
		return direccion;
	}
	
	public int getnumero(){
		return numero;
	}
	
}
