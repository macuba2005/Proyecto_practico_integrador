package test;
import PPI.veterinaria;
public class TestVeterinaria {
	public static void main(String []args) {
		
		veterinaria usuario = new veterinaria();
		
		System.out.println("Nombre:" + usuario.getnombre());
		System.out.println("Direccion: " + usuario.getdireccion());
		System.out.println("Numero: " + usuario.getnumero());
	}
}
