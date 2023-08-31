/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesoadatos;

/**
 *
 * @author SENA
 */
public class ImplrementacionOracle implements AccesoADatos {
        @Override
    public void insertar() {
        System.out.println("Insertando desde oracle");}

    @Override
    public void listar() {
        System.out.println("Listar desde oracle");    }

    @Override
    public void actualizar() {
        System.out.println("Actualizando desde oracle");    }

    @Override
    public void eliminar() {
        System.out.println("Eliminando desde oracle");    }
    
}