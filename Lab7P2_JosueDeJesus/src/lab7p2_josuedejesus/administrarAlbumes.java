/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_josuedejesus;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author josue
 */
public class administrarAlbumes {
    private ArrayList<Album> listaAlbumes = new ArrayList();
    private File archivo = null;

    public administrarAlbumes(String path) {
        archivo = new File(path);
    }

    public ArrayList<Album> getListaAlbumes() {
        return listaAlbumes;
    }

    public void setListaAlbumes(ArrayList<Album> listaAlbumes) {
        this.listaAlbumes = listaAlbumes;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listaAlbumes=" + listaAlbumes;
    }

    //extra mutador
    public void listaAlbumes(Album a) {
        this.listaAlbumes.add(a);
    }

    public void cargarArchivo() {
        try {            
            listaAlbumes = new ArrayList();
            Album temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Album) objeto.readObject()) != null) {
                        listaAlbumes.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Album a : listaAlbumes) {
                bw.writeObject(a);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
