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
public class grafo {
     lista nodos = new lista();

    public grafo() {
    }
    public grafo(lista nodos){
        this.nodos =nodos;
    }

    public lista getNodos() {
        return nodos;
    }

    public void setNodos(lista nodos) {
        this.nodos = nodos;
    }

        
    public void addVertice(Torre origen){
        for (int i = 0; i < nodos.size(); i++) {
            if (((Torre)nodos.get(i)).toString().equals(origen.toString())) {
                System.out.println("nodo no se inserto al grafo");
            }
        }
       nodos.push_back(origen);
    }
    
    public lista getAdjacentes(Torre nodo){
        lista aristas = new lista();
        lista adjacents = new lista();
        for (int i = 0; i < nodos.size(); i++) {
            if (((Torre)nodos.get(i)).getNombre().contentEquals(nodo.getNombre())) {
                aristas = ((Torre)nodos.get(i)).aristas;
            }
        }
        for (int i = 0; i < aristas.size(); i++) {
            adjacents.push_back(((Arista)aristas.get(i)).getDestino());
        }
        return adjacents;
    }
    
    public int getPeso (Torre origen,Torre destino){
        lista aristas = new lista();
        for (int i = 0; i < nodos.size(); i++) {
            if (((Torre)nodos.get(i)).getNombre().contentEquals(origen.getNombre())) {
                aristas = ((Torre)nodos.get(i)).aristas;
            }
        }
        for (int i = 0; i < aristas.size(); i++) {
            if (((Torre)aristas.get(i)) == destino) {
                return ((Arista)aristas.get(i)).getPeso();
            }
        }
        
        return -1;
    }
    public double getCapacidad (Torre origen,Torre destino){
        lista aristas = new lista();
        for (int i = 0; i < nodos.size(); i++) {
            if (((Torre)nodos.get(i)).getNombre().contentEquals(origen.getNombre())) {
                aristas = ((Torre)nodos.get(i)).aristas;
            }
        }
        for (int i = 0; i < aristas.size(); i++) {
            if (((Torre)aristas.get(i)) == destino) {
                return ((Arista)aristas.get(i)).getCapacidad();
            }
        }
        
        return -1;
    }
    public boolean isAdjacente(Torre origen, Torre destino){
        for (int i = 0; i < origen.aristas.size(); i++) {
            if(((Arista)origen.aristas.get(i)).getDestino() == destino){
                return true;
            }
        }
        return false;
    }
    
}


