/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composicion;

import java.util.Scanner;

/**
 *
 * @author user01
 */
public class CEscuela {
    
    private String  nombre;
    //Con la siguiente linea me surge la duda, ¿Con cualquier clase podemos generar un arreglo de objetos de el tipo de clase? 
    private CAulas[] aulas = new CAulas[3]; 
    private Scanner entrada = new Scanner(System.in);
    
    public CEscuela(String nombre)
    {
        this.nombre = nombre;
    }
    
    //Inicializaremos las tres aulas que tendra el objeto escuela.
    public void colocarAulas()
    {
        String nombre = "";
        int cantidad = 0;
        System.out.println("Metodo colocarAulas: " + aulas.length);
        for(int i = 0; i < aulas.length; i++)
        {
            System.out.println("Ingrese el nombre del aula ");
            nombre = entrada.next();
            System.out.println("Ingrese la cantidad de alumnos ");
            cantidad = entrada.nextInt();
            //En la siguiente linea se inicializa un objeto, este objeto forma parte de un 
            //arreglo y es por eso que lleva los parentesis, este solo indica el numero o la posicion 
            //del objeto en el que estamos posicionados. 
            aulas[i] = new CAulas(nombre, cantidad);                        
        }
    }
    
    public String toString()
    {
        String retorno;
        retorno = "Vienvenidos a la escuela " + this.nombre + "\n" +
                 "Esta escuela cuenta con tres aulas: " + "\n" + "Aula uno: " + this.aulas[0] + 
                 "\n" + "Aula Dos: " + this.aulas[1] + "\n" + "Aula tres: " + this.aulas[2];
        return retorno;
    }
   
    
    
    
}
