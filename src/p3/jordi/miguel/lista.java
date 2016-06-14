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
public class lista {

    public nodo_lista head = null;

    public lista() {
    }

    public lista(nodo_lista head) {
        this.head = head;

    }

    public nodo_lista getHead() {
        return head;
    }

    public void setHead(nodo_lista head) {
        this.head = head;
    }

    public void insert(int pos, Object info) {
        nodo_lista temp = head;
        if (size() <= pos) {
            for (int i = 0; i < pos; i++) {
                if (temp.hasNext()) {
                    temp = temp.getNext();
                } else {
                    System.out.println("Array Index Out Of Bound");
                }
            }
            nodo_lista siguiente = temp.getNext();
            temp.setNext(new nodo_lista(info, null));
            temp = temp.getNext();
            temp.setNext(siguiente);
        }
    }

    public int size() {
        int cont = 0;
        nodo_lista temp = head;
        if (head != null) {
            cont++;
            while (temp.hasNext()) {
                if (temp.hasNext()) {
                    temp = temp.getNext();
                    cont++;
                }
            }
            return cont;
        } else {
            return 0;
        }
    }

    public Object get(int posicion) {
        nodo_lista temp = head;

        for (int i = 0; i < posicion; i++) {
            if (temp.hasNext()) {
                temp = temp.getNext();
            } else {
                break;
            }
        }

        return temp.getInfo();
    }

    public void delete(int posicion) {
        nodo_lista temp = head;
        for (int i = 1; i < posicion; i++) {
            temp = temp.getNext();
        }
        if (temp.hasNext()) {
            nodo_lista temp2 = temp.getNext();
            temp.setNext(temp2.getNext());
        } else {
            head = null;
        }
    }

    public int find(Object info) {
        nodo_lista temp = head;
        int cont = 0;
        boolean esta = false;
        boolean salir = false;
        while (!salir) {
            if ((temp.getInfo()) == info) {
                salir = true;
                esta = true;
            } else {
                temp = temp.getNext();
                cont++;
            }
        }

        if (esta) {
            return cont - 1;
        } else {
            return -1;
        }
    }
    public void push_back(Object info) {
        nodo_lista temp = head;
        if (head != null) {
            while (temp.hasNext()) {
                temp = temp.getNext();
            }
            temp.setNext(new nodo_lista(info, null));
        } else {
            head = new nodo_lista(info, null);
        }
    }
}
