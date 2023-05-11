package PPI;

public class Personas {
	String Nombre;
	String Apellido;
	public int Edad;
	public int Cedula;
	
	public Personas() {
		Nombre = "Eduardo";
		Apellido = "Cuesta";
		Edad = 19;
		Cedula = 1234567894;
	}
	
	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}
	
	public String getNombre() {
		return Nombre;
	}
	
	public void setApellido(String Apellido) {
		this.Apellido = Apellido;
	}
	
	public String getApellido() {
		return Apellido;
	}
	
	public int getEdad() {
		return Edad; 
	}
	
	public int getCedula(){
		return Cedula;
	}
}
