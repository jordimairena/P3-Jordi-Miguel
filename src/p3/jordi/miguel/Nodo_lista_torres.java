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
public class Nodo_lista_torres {

    Torre value = new Torre();
    Nodo_lista_torres next;

    public Nodo_lista_torres(Torre value) {
        this.value = value;
    }

    public Nodo_lista_torres() {

    }

    public Torre getValue() {
        return value;
    }

    public void setValue(Torre value) {
        this.value = value;
    }

    public Nodo_lista_torres getNext() {
        return next;
    }

    public void setNext(Nodo_lista_torres next) {
        this.next = next;
    }
    public boolean hasNext() {
        if (next != null) {
            return true;
        }
        return false;
    }
}
