/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3;

/**
 *
 * @author utp
 */
public class Libros extends Documento{

    public boolean prestado;

    public Libros(String codigo, String titulo, String a_publicacion) {
        super(codigo, titulo, a_publicacion);
    }

    public boolean Libros() {
        return this.prestado = false;
    }

    public String getCodigo() {
        return codigo;
    }

    
    public String getA_publicacion() {
        return a_publicacion;
    }
        
    public String toString(){
        
        String mensaje = "Las caracteristicas del libro son: Codigo: "+
                codigo+ " titulo: "+titulo+ 
                "Año de publicacion: "  +a_publicacion+
                " ¿El libro se encunetra prestado?" +prestado               
                ;
        
        
        return mensaje;
    }
    
}
