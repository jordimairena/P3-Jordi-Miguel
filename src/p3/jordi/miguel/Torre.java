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
    public String tipo_repetidor;
    boolean visitado;
    public int ID;
    lista aristas = new lista();

    public Torre() {
    }

    public Torre(String nombre) {
        this.nombre = nombre;
    }

    public Torre(String nombre, String tipo_repetidor) {
        this.nombre = nombre;
        this.tipo_repetidor = tipo_repetidor;
    }

    public String getTipo_repetidor() {
        return tipo_repetidor;
    }

    public void setTipo_repetidor(String tipo_repetidor) {
        this.tipo_repetidor = tipo_repetidor;
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

    public lista getAristas() {
        return aristas;
    }

    public void setAristas(lista aristas) {
        this.aristas = aristas;
    }

    void agregar_a(Arista a) {
        for (int i = 0; i < aristas.size(); i++) {
            if (a.toString().equals(((Arista) aristas.get(i)).toString())) {
                return;
            }
        }
        aristas.push_back(a);
    }

    @Override
    public String toString() {
        return nombre;
    }

}
