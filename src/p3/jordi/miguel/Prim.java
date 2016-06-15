/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3.jordi.miguel;

/**
 *
 * @author Miguel A. Ardon E
 */
public class Prim {

    static int size;
    static int visited[] = new int[size];
    static int min = 999;
    static int u = 0;
    static int v = 0;
    static int total = 0;

    public Prim(int size) {
        this.size = size;
    }

    public Prim() {
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int[] getVisited() {
        return visited;
    }

    public void setVisited(int[] visited) {
        this.visited = visited;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getU() {
        return u;
    }

    public void setU(int u) {
        this.u = u;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public static void Prim(int[][] adyac) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (adyac[i][j] == 0) {
                    adyac[i][j] = 999;
                }
            }
        }
        visited[0] = 1;

        //empieza
        for (int i = 0; i < size-1; i++) {
            min = 999;
            for (int j = 0; j < size; j++) {
                if (visited[j] == 1) {
                    for (int k = 0; k < size; k++) {
                        if (visited[k] != 1) {
                            if (min > adyac[j][k]) {
                                min = adyac[j][k];
                                u = j;
                                v = k;
                            }
                        }
                    }
                }
            }
            visited[v] = 1;
            total += min;
            System.out.println("Encontrado:" + u + "->" + v + ":peso" + min);
        }

        System.out.println("Peso minimo es:" + total);
    }
}