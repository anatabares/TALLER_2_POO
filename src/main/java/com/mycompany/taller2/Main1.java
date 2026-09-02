/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller2;

/**
 *
 * @author Ana
 */
public class Main1 {
    
    public static void main(String[] args) { /** Aqui se estan creando dos canciones llamando la clase cancion(), se crea con sus respectivos atributos.**/
        
        cancion c1 = new cancion();
        c1.setNombre("Lady.");
        c1.setArtista("Orquesta la palabra");
        c1.setDuracion(6.53);
        
        
        cancion c2 = new cancion();
        c2.setNombre("Soledad.");
        c2.setArtista("La-33");
        c2.setDuracion(4.44);
       
    
    }
    
}
