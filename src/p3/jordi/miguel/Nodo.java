/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3.jordi.miguel;

/**
 *
 * @author Memo
 */
public class Nodo {

    Relacion_Torres relacion = null;
    Nodo next;

    public Nodo(Relacion_Torres relacion){
        this.relacion=relacion;
    }
    
    public Nodo(){
        
    }
            

    public Relacion_Torres getValue() {
        return relacion;
    }

    public void setValue(Relacion_Torres relacion) {
        this.relacion = relacion;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
    public boolean hasNext() {
        if (next != null) {
            return true;
        }
        return false;
    }
}
