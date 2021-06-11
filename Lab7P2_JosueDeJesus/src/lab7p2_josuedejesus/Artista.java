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
public class Artista {
    private String nombre;
    private String genero;
    private String disquera;
    private String alias;
    private String tipo;
    private ArrayList<Album> albumes = new ArrayList();

    public Artista() {
    }

    public Artista(String nombre, String genero, String disquera, String alias, String tipo) {
        this.nombre = nombre;
        this.genero = genero;
        this.disquera = disquera;
        this.alias = alias;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDisquera() {
        return disquera;
    }

    public void setDisquera(String disquera) {
        this.disquera = disquera;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Album> getAlbumes() {
        return albumes;
    }

    public void setAlbumes(ArrayList<Album> albumes) {
        this.albumes = albumes;
    }

    @Override
    public String toString() {
        return "Artista{" + "nombre=" + nombre + ", genero=" + genero + ", disquera=" + disquera + ", alias=" + alias + ", tipo=" + tipo + ", albumes=" + albumes + '}';
    }
    
    
}
