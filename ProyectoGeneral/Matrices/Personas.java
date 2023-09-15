import java.util.Scanner;

public class Personas implements iMatriz {
    
    String nombre;
    int edad;
    Personas[][] matriPersonas;



    public Personas() {
        matriPersonas = new Personas[2][2];
    }

    public Personas(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
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

    public Personas[][] getMatriPersonas() {
        return matriPersonas;
    }

    public void setMatriPersonas(Personas[][] matriPersonas) {
        this.matriPersonas = matriPersonas;
    }

    @Override
    public void llenarMatriz(Scanner consola) {
        
        for (int i = 0; i < matriPersonas.length; i++) {
            for (int j = 0; j < matriPersonas[i].length; j++) {
                
                System.out.println(" Ingrese el nombre ");
                String nombre = consola.nextLine();
                
                System.out.println(" Ingrese su  edad " + nombre);
                int edad = Integer.parseInt(consola.nextLine()); 
                
                matriPersonas[i][j] = new Personas(nombre, edad);

             }
        }
    }

    @Override
    public void mostrarMatriz() {
        for (int i = 0; i < matriPersonas.length; i++) {
            for (int j = 0; j < matriPersonas[i].length; j++) {
                System.out.print("[" + i + "," + j +"] " + matriPersonas[i][j]);
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "Personas [nombre=" + nombre + ", edad=" + edad + "]";
    }






}
