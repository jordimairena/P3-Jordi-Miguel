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
public class Floyd {

    static int[][] adyacent;
    static int size = Principal.size ;

    public Floyd() {
    }

    public Floyd(int size , int[][] adyacent) {
        this.size = size;
        this.adyacent = adyacent;
    }

    public static int[][] getAdyacent() {
        return adyacent;
    }

    public static void setAdyacent(int[][] adyacent) {
        Floyd.adyacent = adyacent;
    }

    public static int getSize() {
        return size;
    }

    public static void setSize(int size) {
        Floyd.size = size;
    }
    
    public static int[][] FloydAlgo(int[][] M){
        for(int k = 0; k < size; k++){
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if(M[i][k] + M[k][j] < M[i][j]){
                        M[i][j] = M[i][k] + M[k][j];
                        adyacent[i][j] = k;
                    }
                }
            }
        }
        return M;
    }
    
    public static void printMatrix(int[][] Matrix){
        System.out.print("\n\t");
        for (int j = 0; j < size; j++) {
            System.out.print(j + "\t");
        }
        System.out.println();
        for (int j = 0; j < 35; j++) {
            System.out.print("-");
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print(i + "|\t");
            for (int j = 0; j < size; j++) {
                System.out.print(Matrix[i][j]);
                System.out.print("\t");                
            }
            System.out.println("\n");
        }
        System.out.println("\n");
    }
    
}
