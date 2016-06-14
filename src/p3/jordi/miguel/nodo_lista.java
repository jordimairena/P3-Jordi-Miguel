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
public class nodo_lista {

    public Object info;
    public nodo_lista next = null;

    public nodo_lista() {
    }

    public nodo_lista(Object info, nodo_lista next) {
        this.info = info;
        this.next = next;
    }

    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public nodo_lista getNext() {
        return next;
    }

    public void setNext(nodo_lista next) {
        this.next = next;
    }

    public boolean hasNext() {
        if (next != null) {
            return true;
        }
        return false;
    }
}
