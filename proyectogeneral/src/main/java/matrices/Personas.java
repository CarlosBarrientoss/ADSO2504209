
package matrices;

import java.util.Scanner;


public class Personas implements IMatriz {
    private String nombre;
    private int edad;
    private Personas[][] matrizPersonas;
    
    public Personas(){
        matrizPersonas = new Personas[2][2];
    }

    public Personas(String nombre, int edad) {
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

    public Personas[][] getMatrizPersonas() {
        return matrizPersonas;
    }

    public void setMatrizPersonas(Personas[][] matrizPersonas) {
        this.matrizPersonas = matrizPersonas;
    }


    @Override
    public void llenarmatriz(Scanner consola) {
           //llena rmatriz
       
       for (int i=0; i <matrizPersonas.length; i++){
           for (int j=0; j<matrizPersonas[i].length;j++){
               System.out.print("ingrese su nombre= ");
               String nombre= consola.nextLine();
               System.out.print("ingresa tu edad "+ nombre + "=");
               int edad= Integer.parseInt(consola.nextLine());
               matrizPersonas[i][j] = new Personas(nombre, edad);
               
           }
       }
    }

    @Override
    public void mostrarmatriz() {
                //mostrando los valores de la matriz
        for (int i = 0; i < matrizPersonas.length; i++) {
            for (int j = 0; j < matrizPersonas[i].length; j++) {
                System.out.print("nombre: "+ matrizPersonas[i][j].getNombre()+ " ");
                System.out.println("edad: "+ matrizPersonas[i][j].getEdad()+ " ");
//                System.out.println(matrizEnteros[i][j]);
            }
            System.out.println();
        }
        
    }

   
   
 
}
