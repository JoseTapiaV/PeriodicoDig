/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.pruebas;
import ec.edu.ups.clases.EstructuraPeriodico;
import ec.edu.ups.clases.Multimedia;
import ec.edu.ups.clases.Noticia;
import ec.edu.ups.clases.RedSocial;
import ec.edu.ups.clases.Seccion;
/**
 *
 * @author Estudiante
 */
public class Prueba 
{
    public static void main(String []args)
    {
        RedSocial facebook=new RedSocial();
        Seccion sociales=new Seccion();
        Multimedia videos=new Multimedia();
        EstructuraPeriodico portada=new EstructuraPeriodico();
        Noticia  notice=new Noticia();
        System.out.println("");
        facebook.setCodigo(1);
        facebook.setNombre("Facebook");
        facebook.setUrl("www.facebook.com");
        int cod=facebook.getCodigo();
        String nom=facebook.getNombre();
        String url=facebook.getUrl();
        System.out.println("Codigo: "+cod);
        System.out.println("Nombre: "+nom);
        System.out.println("URL: "+url);
        System.out.println("");
        sociales.setNombre("Noticia Social");
        String Nom=sociales.getNombre();
        System.out.println("Noticia es: "+Nom);
        System.out.println("");
        videos.setNombre("Nombre del video");
        videos.setFormato("Formato del video");
        videos.setTamañoBytes(720);
        videos.setPath("Youtube");
        String  n=videos.getNombre();
        System.out.println("Este alchivo es: "+n);
        String form=videos.getFormato();
        System.out.println("Formato: "+form);
        double tb=videos.getTamañoBytes();
        String pth=videos.getPath();
        System.out.println("Ubicacion: " +pth);
        System.out.println("");
        portada.setNombrePeriodico("El Mercurio");
        portada.setUbicacion("Cuenca Azuay");
        portada.setFecha(28);
        String np=portada.getNombrePeriodico();
        System.out.println("Nombre Periodico: "+np);
        String ub=portada.getUbicacion();
        System.out.println("Ubicacion: "+ub);
        int fch=portada.getFecha();
        System.out.println("Fecha: "+fch);
        System.out.println("");
        notice.setAutor("José Tapia");
        notice.setTitulo("Secuestros");
        notice.setContenido("Contenido de la noticia.");
        notice.setMultimedia("Fotos,Videos,Audio");
        String  au=notice.getAutor();
        System.out.println("El autor de esta noticia es: " +au);
        String  titu=notice.getContenido();
        System.out.println("Noticia: "+titu);
        String  gal=notice.getMultimedia();
        System.out.println("Mutimedia: "+gal);
        
        
        
        
    }
}
   