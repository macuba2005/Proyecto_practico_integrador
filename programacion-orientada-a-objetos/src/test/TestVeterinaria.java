package test;
import PPI.veterinaria;
public class TestVeterinaria {
	public static void main(String []args) {
		
		veterinaria usuario = new veterinaria();
		
		System.out.println("Nombre:" + usuario.getnombre());
		System.out.println("Direccion: " + usuario.getdireccion());
		System.out.println("Numero: " + usuario.getnumero());
		
		veterinaria usuario2 = new veterinaria();
		
		usuario2.setnombre("Paola");
		usuario2.setdireccion("calle 87 #32-87");
		usuario2.numero = 32265;
		
		System.out.println("Nombre:" + usuario2.getnombre());
		System.out.println("Direccion: " + usuario2.getdireccion());
		System.out.println("Numero: " + usuario2.getnumero());
	}
}
