/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Composicion;

/**
 *
 * @author user01
 */
public class Conposicion {
    public static void main(String[] args) {

        //Creamos el objeto escuela el cual será el objeto contenedor
        CEscuela escuelaUno = new CEscuela("Rafael Ramirez Castañeda");
        
        //En este punto estoy algo confundido ya que la composición se trata de crear un objeto 
        //apartir o con otros objetos, y lo que estamos haciendo en esta linia es agregar los objetos 
        //luego de haber creado el objeto escuela, ¿Es acaso que en este ejemplo es asi y en ejemplos más avanzados 
        // necesitas primero hacer esto para luego poder ejecutar métodos?
        escuelaUno.colocarAulas();
        
        System.out.println(escuelaUno.toString());
        
    }
    
}
