/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package descomposicion.de.matrices;

import java.util.Scanner;

/**
 *
 * @author Andresmrllo
 */
public class Matriz {
    private Scanner teclado;
    public int[][] matriz;
    
    public void cargar() {
        teclado=new Scanner(System.in);
        System.out.print("Cuantas filas y columnas tiene la matriz:");
        int orden =teclado.nextInt();
        matriz=new int[orden][orden];
        for (int[] matriz1 : matriz) {
            for (int c = 0; c < matriz1.length; c++) {
                System.out.print("Ingrese componente:");
                matriz1[c] = teclado.nextInt();
            }
        }
    }
    
    public void imprimir() {
        for(int f=0;f<matriz.length;f++) {
            for(int c=0;c<matriz[f].length;c++) {
                System.out.print(matriz[f][c]+" ");
                }
            System.out.println();
        }
    }
    
    /**
     *
     */
    public void imprimirUltimaFila() {
    	System.out.println("Ultima fila");
        for(int c=0;c<matriz[matriz.length-1].length;c++) {
             System.out.print(matriz[matriz.length-1][c]+" ");
        }
    }
    public int[][] crearTranspuesta(int trans[][]){
        System.out.println("Creando la matriz transpuesta");
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.print(trans[j][i] +" ");
                
            }
            System.out.println();
        }
        return trans;
    }
     public void crearMatrizSimetrica(int trans[][],int matrizR[][]){
        System.out.println("Creando matriz simetrica");
        for(int i=0; i<matriz.length;i++){
            for(int j=0; j<matriz[i].length||j<trans[i].length;j++){
                //System.out.print(simet[mat[i]+trans[i]][mat[j]+trans[j]] +" ");
                
               int[][] s;
                //s = matriz[i][j]+trans[i][j];
                }
        }
    }
}
