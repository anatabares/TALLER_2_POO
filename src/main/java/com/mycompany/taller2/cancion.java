/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller2;

/**
 *
 * @author Ana
 */
public class cancion { /**SE CREA LA CLASE CON SUS RESPECTIVOS ATRIBUTOS PRIVADOS : NOMBRE(STRING), ARTISTA(STRING), DURACION(DOUBLE) **/
    private String nombre; /**ATRUBUTOS **/
    private String artista;
    private double duracion;
    
    public void mostrarInformacion() { /**SE CREA EL METODO MOSTRARINFORMACION() EL CUAL MUESTRA EL NOMBRE DE LA CANCION,EL ARTISTA Y LA DURACION DE LA CANCION  **/
    System.out.println("La cancion es: " + this.getNombre() + "El artista es: " + this.getArtista() + "La cancion dura: " + this.getDuracion());
    }
    public void reproducir() { /**SE CREA EL METODO RE´PRODUCIR() EL CUAL MUESTRA EL NOMBRE DE LA CANCION  **/
    System.out.println("Se es reproduciendo: " + this.getNombre() );}

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the artista
     */
    public String getArtista() {
        return artista;
    }

    /**
     * @param artista the artista to set
     */
    public void setArtista(String artista) {
        this.artista = artista;
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
