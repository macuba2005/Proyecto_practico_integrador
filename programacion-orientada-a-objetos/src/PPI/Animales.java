package PPI;
public class Animales {
	String Nombre;
	String Genero;
	String Raza;
	
	public Animales() {
		Nombre = "Spike";
		Genero = "Masculino";
		Raza = "Pastor Aleman";
	}
	
	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}
	
	public String getNombre(){
		return Nombre;
	}
	
	public void setGenero(String Genero) {
		this.Genero = Genero;
	}
	
	public String getGenero(){
		return Genero;
	}
	
	public void setRaza(String Raza) {
		this.Raza = Raza;
	}
	
	public String getRaza(){
		return Raza;
	}
	
}
