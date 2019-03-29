/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 *
 * @author LENOVO
 */
public class Noticia {
    private String titulo;
    private String autor;
    private String contenido;
    private String multimedia;
    
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public void setAutor(String autor){
        this.autor=autor;
        
    }
    public void setContenido(String contenido){
        this.contenido=contenido;
    }
    public void setMultimedia(String multimedia){
        this.multimedia=multimedia;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public String getAutor(){
        return this.autor=autor;
    }
    public String getContenido(){
        return this.contenido=contenido;
    
    }
    public String getMultimedia(){
        return this.multimedia=multimedia;
}
}