/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller2;

/**
 *
 * @author Ana
 */
public class Pelicula { /**AQUI SE CREA LA CLASE PELICULA CON SUS RESPECTIVBOS ATRIBUTOS: NOMBREPELICULA(STRING), DIRECTORPELICULA(STRING), ANIOLANZAMIENTO(INT), DURACION(DOUBLE) **/
    private String nombrePelicula; /**ATRIBUTOS **/
    private String directorPelicula;
    private int anioLanzamiento;
    private double duracion;
    
    public boolean esClasica() { /**ESTE METODO SIRVE PARA DECIR SI UNA PELICULA ES CLASICA O NO, ES CLASICA SI DA MAS DE 25  **/
        int anioActual=2026;
        return (anioActual -getAnioLanzamiento()) > 25; /**CONDICION. SI LA RESTA DA MAYOR A 25 ES CLASICA **/
    }
    
    public void mostrarInformacion() { /**ESTE METODO MUESTRA LA IN FORMACION DE LA PELICULA **/ 
        System.out.println("El nombre de la pelicula es: " + this.getNombrePelicula() + "El director de la pelicula es: " + this.getDirectorPelicula() + "La duracion de la pelicula en minutos es de: " + this.getDuracion() + "El año de lanzamiento es: " + this.getAnioLanzamiento() );
    }
    
    public boolean esLarga(){ /**ESTE METODO TE DICE SI LA PELICULA ES LARGA, ES LARGA SI DURA MAS DE 120 MIN **/
        return duracion > 120; /**CONDICION. SI LA PELICULA DURA MAS DE 120 MIN ES LARGA **/
    }

    /**
     * @return the nombrePelicula
     */
    public String getNombrePelicula() {
        return nombrePelicula;
    }

    /**
     * @param nombrePelicula the nombrePelicula to set
     */
    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    /**
     * @return the directorPelicula
     */
    public String getDirectorPelicula() {
        return directorPelicula;
    }

    /**
     * @param directorPelicula the directorPelicula to set
     */
    public void setDirectorPelicula(String directorPelicula) {
        this.directorPelicula = directorPelicula;
    }

    /**
     * @return the anioLanzamiento
     */
    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    /**
     * @param anioLanzamiento the anioLanzamiento to set
     */
    public void setAnioLanzamiento(int anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }

    /**
     * @return the duracion
     */
    public double getDuracion() {
        return duracion;
    }

    /**
     * @param duracion the duracion to set
     */
    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
    
}
