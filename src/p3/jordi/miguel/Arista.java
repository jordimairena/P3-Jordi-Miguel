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
public class Arista {
    public Torre origen;
    public Torre destino;
    int peso;
    String tipo;
    double capacidad;

    public Arista(Torre origen, Torre destino, int peso, String tipo, double capacidad) {
        this.origen = origen;
        this.destino = destino;
        this.peso = peso;
        this.tipo = tipo;
        this.capacidad = capacidad;
    }

    public Torre getOrigen() {
        return origen;
    }

    public void setOrigen(Torre origen) {
        this.origen = origen;
    }

    public Torre getDestino() {
        return destino;
    }

    public void setDestino(Torre destino) {
        this.destino = destino;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Arista{" + "origen=" + origen + ", destino=" + destino + ", peso=" + peso + ", tipo=" + tipo + ", capacidad=" + capacidad + '}';
    }
    
}
