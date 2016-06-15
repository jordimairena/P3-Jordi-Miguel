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
public class lista_torres {

    static Nodo_lista_torres head;
    private int size = 0;

    public lista_torres() {
        head = new Nodo_lista_torres();
    }

    public void insert(Torre value, int pos) {
        Nodo_lista_torres newNodo_lista_lugares = new Nodo_lista_torres(value);
        Nodo_lista_torres newHead = head;
        int cont = 0;
        if (pos == 0) {
            newNodo_lista_lugares.setNext(head);
            this.setHead(newNodo_lista_lugares);
        }
        while (newHead.getNext() != null) {
            newHead = newHead.getNext();
            cont++;
            if (cont == pos) {
                break;
            }
        }
        Nodo_lista_torres n = newHead.getNext();
        newHead.setNext(newNodo_lista_lugares);
        newNodo_lista_lugares.setNext(n);
    }

    public void setHead(Nodo_lista_torres head) {
        this.head = head;
    }

    public int find(int num) {
        return 0;
    }

    public Torre get(int pos) {
        Nodo_lista_torres temp = head;
        Torre valor = temp.getValue();
        for (int i = 0; i <= pos; i++) {
            temp = temp.getNext();
            valor = temp.getValue();

        }
        return valor;
    }
//    public static Torre get(int posicion) {
//        Nodo_lista_torres temp = head;
//
//        for (int i = 0; i < posicion; i++) {
//            if (temp.hasNext()) {
//                temp = temp.getNext();
//            } else {
//                break;
//            }
//        }
//
//        return temp.getValue();
//    }

    public void delete(int pos) {
        System.out.println(pos);
        if (pos == 0) {
            Nodo_lista_torres temp = head;
            head = temp.getNext();
            System.out.println(head.getValue());
            System.out.println(temp.getValue());
            Torre data = temp.getValue();

            temp.setValue(null);
            temp.setNext(null);

        } else {

            Nodo_lista_torres temp = head;
            for (int i = 1; i < pos - 1; i++) {
                temp = temp.getNext();
            }
            System.out.println(temp.getValue());
            Nodo_lista_torres temp2 = temp.getNext();
            temp.setNext(temp2.getNext());
            Torre data2 = temp2.getValue();
            temp2.setValue(null);
            temp2.setNext(null);
            System.out.println(data2);
        }
    }

    public Torre first() {
        return head.getValue();
    }

    public void Print_Lista() {
        Nodo_lista_torres temp = head;
        int cont = 0;
        while (temp != null) {
            if (cont == 0) {
                System.out.print("[H]");
            }
            if (temp.getNext() != null) {
                System.out.print("[" + temp.getValue().nombre + "] - ");
                cont++;
            } else {
                System.out.print("[" + temp.getValue().nombre + "]");
                cont++;
            }
            temp = temp.next;
        }
        System.out.println("");
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
