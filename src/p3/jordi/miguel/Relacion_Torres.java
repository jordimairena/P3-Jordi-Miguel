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

    int distancia;
    double capacidad;
    String tipo;
    Torre punto1, punto2;

    public Relacion_Torres(int distancia, double capacidad, String tipo, Torre punto1, Torre punto2) {
        this.distancia = distancia;
        this.capacidad = capacidad;
        this.tipo = tipo;
        this.punto1 = punto1;
        this.punto2 = punto2;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    @Override
    public String toString() {
        if (tipo.equalsIgnoreCase("cobre")) {
            return "Dist: " + distancia + ", Tipo: " + tipo + ", Capac: " + capacidad + " MB/s";
        } else {
            return "Dist: " + distancia + ", Tipo: " + tipo + ", Capac: " + capacidad + " GB/s";
        }
    }
}
