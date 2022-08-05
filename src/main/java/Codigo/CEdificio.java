/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Codigo;

public class CEdificio {
    
    private int numeroDePisos;
    private String direccion;
    
    public CEdificio(int numeroDePisos, String direccion)
    {
        this.numeroDePisos = numeroDePisos;
        this.direccion = direccion;
    }
    
    public String muestraDatos()
    {
        String cadena;
        cadena = "La direccion del edicicio es: " + direccion + "\n" + "El nuemro de pisos es de: " + numeroDePisos;
        return cadena;
    
    }
    
    
    
}
