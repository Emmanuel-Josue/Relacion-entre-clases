/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composicion;

public class CAulas {
    
    private String nombreAula;
    private int cantidadAlumnos;
    
    public CAulas(String nombreAula, int cantidadAlumnos)
    {
        this.nombreAula = nombreAula;
        this.cantidadAlumnos = cantidadAlumnos;    
    }
    
    public String toString()
    {
        return "Aunla: " + this.nombreAula + ", Cantidad de alumnos: " + this.cantidadAlumnos;
    }
}
