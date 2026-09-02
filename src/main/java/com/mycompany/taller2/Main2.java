/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller2;

/*
 *
 * @author Ana
 */
public class Main2 {
    
   public static void main(String[] args) {
       
       
        Pelicula p1 = new Pelicula();
        p1.setNombrePelicula("Titanic.");
        p1.setDirectorPelicula("James Cameron.");
        p1.setAnioLanzamiento(1997);
        p1.setDuracion(194);
        
        if(p1.esClasica()) {
            System.out.println("La pelicula es un clásico.");
        }
        else {
            System.out.println("La pelicula no es un clasico.");
        }
        
        if (p1.esLarga()){
            System.out.println("Es una pelicula larga: dura más de 120 minitos.");
        }
        else {
            System.out.println("No es larga ya que no dura 120 minutos.");
        }
        
        
        Pelicula p2 = new Pelicula();
        p2.setNombrePelicula("Intensamente 2.");
        p2.setDirectorPelicula("Kelsey Mann.");
        p2.setAnioLanzamiento(2024);
        p2.setDuracion(96);
        
        if(p2.esClasica()) {
            System.out.println("La pelicula es un clásico.");
        }
        else {
            System.out.println("La pelicula no es un clasico.");
        }
        
        if (p2.esLarga()) {
            System.out.println("Es una pelicula larga: dura más de 120 minitos.");
        }
        else {
            System.out.println("No es larga ya que no dura 120 minutos.");
        }
    
    }
    
}
