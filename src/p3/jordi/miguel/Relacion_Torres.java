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
public class Relacion_Torres {
    int distancia,capacidad;
    Torre punto1, punto2;

    public Relacion_Torres(int distancia, int capacidad, Torre punto1, Torre punto2) {
        this.distancia = distancia;
        this.capacidad = capacidad;
        this.punto1 = punto1;
        this.punto2 = punto2;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Torre getPunto1() {
        return punto1;
    }

    public void setPunto1(Torre punto1) {
        this.punto1 = punto1;
    }

    public Torre getPunto2() {
        return punto2;
    }

    public void setPunto2(Torre punto2) {
        this.punto2 = punto2;
    }
    public String toString() {
        return "Dist: "+distancia+", Capac: "+ capacidad;
    }
}
