/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Codigo;

/**
 *
 * @author user01
 */
public class Agregacion {

    public static void main(String[] args) {

        //Creamos al objeto propietario 
        CPropietario propietario = new CPropietario("Carmelo", "Camacho");
        
        //Creamos un objeto edificio
        CEdificio edificio = new CEdificio(22, "Valle de chalco");

        //Le agregaremos al propietario el edificio 
        propietario.adicionarPropiedad(edificio);
        
        propietario.mostrarDatosPropiedad();
        
        //Si se elimina al propietario el edificio va a aseguir existiendo. 
        System.out.println("\n" + "Ulilizamos solo el objeto edificio: ");
        System.out.println(edificio.muestraDatos());
        
    }
    
}
