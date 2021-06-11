/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_josuedejesus;

import java.util.ArrayList;

/**
 *
 * @author josue
 */
public class Album {
    private String nombre;
    private String publicacion;
    private String genero;
    private String formato;
    private String alias;
    ArrayList<Cancion> canciones = new ArrayList();

    public Album() {
    }

    public Album(String nombre, String publicacion, String genero, String formato, String alias) {
        this.nombre = nombre;
        this.publicacion = publicacion;
        this.genero = genero;
        this.formato = formato;
        this.alias = alias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(String publicacion) {
        this.publicacion = publicacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return "Album{" + "nombre=" + nombre + ", publicacion=" + publicacion + ", genero=" + genero + ", formato=" + formato + ", alias=" + alias + ", canciones=" + canciones + '}';
    }
    
    
}
