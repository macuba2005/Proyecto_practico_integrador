package test;
import PPI.Personas;

public class Testpersona {
  public static void main(String[] args) {

    Personas Persona1 = new Personas();

    System.out.println("Nombre de la persona: " + Persona1.getNombre());
    System.out.println("Apellido: " + Persona1.getApellido());
    System.out.println("Edad: " + Persona1.getEdad());
    System.out.println("Cedula: " + Persona1.getCedula());
    System.out.println("______________________");
    
    Personas Persona2 = new Personas();
    
    Persona2.setNombre("Juan");
    Persona2.setApellido("Perez");
    Persona2.Edad = 12;
    Persona2.Cedula = 1987564321;
    
    
    System.out.println("Nombre de la persona: " + Persona2.getNombre());
    System.out.println("Apellido: " + Persona2.getApellido());
    System.out.println("Edad: " + Persona2.getEdad());
    System.out.println("Cedula: " + Persona2.getCedula());
    System.out.println("______________________");
    
  }
}