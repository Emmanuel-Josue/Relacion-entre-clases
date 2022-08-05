/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Codigo;

/**
 *
 * @author user01
 */
public class CPropietario {
    
    private String nombre;
    private String apellidoMaterno;
    private CEdificio propiedadEdificio;
    //Para cumplir la relación de agregación es necesario no instanciar un objeto de tipo CEdificio adentro de esta clase 
    public CPropietario(String nombre, String apellidoMaterno)
    {
        this.nombre = nombre;
        this.apellidoMaterno = apellidoMaterno;
    }
    
    
    //Gracias a este método estamos creando la relación de agregación
    //de alguna manera creo que estamos agregando el objeto CEdificio al objeto propietario 
    public void adicionarPropiedad(CEdificio propiedad)
    {
        if(propiedad != null)
        {
            this.propiedadEdificio = propiedad;
        }
        else
        {
            System.out.println("La referencia en el parametro es nula");
        }
    }
    
    public void mostrarDatosPropiedad()
    {
        if(propiedadEdificio != null)
        {
            System.out.println("El propietario es: " + nombre + " " + this.apellidoMaterno);
            System.out.println(propiedadEdificio.muestraDatos());
            
        }
        else
        {
            System.out.println("Aún  no se tienen datos en propiedad ");
        }
    }
    
}
