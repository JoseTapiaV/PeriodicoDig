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
public class Multimedia {
     private String nombre;
    private String formato;
    private double tamañoBytes;
    private String path;
   
    
    public void setNombre(String nombre){
         this.nombre=nombre; 
    }
    public void setFormato(String formato){
            this.formato=formato;
  
    }
    public void setTamañoBytes(double tamañoBytes){
        this.tamañoBytes=tamañoBytes;
    }
    public void setPath(String path){
        this.path=path;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getFormato(){
        return this.formato;
    }
    public double getTamañoBytes(){
        return this.tamañoBytes;
    }
    public String getPath(){
        return this.path;
    }
    
    
}
     