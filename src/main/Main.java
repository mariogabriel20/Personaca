package main;

public class Main {

    public static void main(String[] args) {
        Persona p1 = new Persona("Miguelsaco",40,"Heroes de la Concepcion",110);
        Persona p2 = new Persona("Nicolaco",12,"Recabarren",1100);
        System.out.println("Nombre: "+p1.getNombre()+"\nEdad: "+p1.getEdad()+"\nDireccion: "+p1.dir.getNombre()+"\nNumero: "+p1.dir.getnumero());
        System.out.println("Nombre: "+p2.getNombre()+"\nEdad: "+p2.getEdad()+"\nDireccion: "+p2.dir.getNombre()+"\nNumero: "+p2.dir.getnumero());
    }
    
}
