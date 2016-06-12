/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3.jordi.miguel;

/**
 *
 * @author jordi
 */
public class Torre {

    public String nombre;    
    boolean visitado;
    public int ID;

    public Torre() {
    }

    
    public Torre(String nombre) {
        this.nombre = nombre;        
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;

    }

    @Override
    public String toString() {
        return nombre;
    }

}
