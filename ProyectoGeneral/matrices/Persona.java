package matrices;

import java.util.Scanner;

public class Persona implements IMatriz {
    
    private String nombre;
    private int edad;
    private Persona[] [] matrizPersona;

    public Persona(){
        matrizPersona = new Persona[3][3];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona[][] getMatrizPersona() {
        return matrizPersona;
    }

    public void setMatrizPersona(Persona[][] matrizPersona) {
        this.matrizPersona = matrizPersona;
    }

    @Override
    public void llenarMatriz(Scanner consola) {
   
        for (int i = 0; i < matrizPersona.length; i++){
            for (int j = 0; j < matrizPersona.length; j++){
       System.out.println("ingrese el nombre");
       String nombre = consola.nextLine();
       System.out.println("Ingrese la edad de la persona en la posición [" + i + "][" + j + "]: ");
       int edad = Integer.parseInt(consola.nextLine());

       Persona persona = new Persona();
       persona.setNombre(nombre);
       persona.setEdad(edad);

       matrizPersona[i][j] = persona;
    }}
    }

    @Override
public void mostrarMatriz() {

    for (int i = 0; i < matrizPersona.length; i++) {
        for (int j = 0; j < matrizPersona[i].length; j++) {
            Persona persona = matrizPersona[i][j];
            System.out.println("[" + i + "-" + j + "] Nombre: " + persona.getNombre() + ", Edad: " + persona.getEdad());
        }
    }
}

            
            }
        
    

