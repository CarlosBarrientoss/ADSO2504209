/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesoadatos;

/**
 *
 * @author SENA
 */
public class ImplementacionMariaDB implements AccesoADatos {
        @Override
    public void insertar() {
        System.out.println("Insertando desde maria");}

    @Override
    public void listar() {
        System.out.println("Listar desde maria");    }

    @Override
    public void actualizar() {
        System.out.println("Actualizando desde maria");    }

    @Override
    public void eliminar() {
        System.out.println("Eliminando desde maria");    }
    
}