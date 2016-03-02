/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package descomposicion.de.matrices;

import java.util.Scanner;

/**
 *
 * @author Minor Umaña, Monica Ureña , Jose Ramirez
 */

public class Matriz {
    private Scanner teclado;
    public int[][] matriz;
    public int orden ;
    
    public void cargar() {
        teclado=new Scanner(System.in);
        System.out.print("Cuantas filas y columnas tiene la matriz:");
        orden =teclado.nextInt();
        matriz=new int[orden][orden];
        for (int i=0; i< matriz.length;i++) {
            for (int c = 0; c < matriz[i].length; c++) {
                System.out.print("Ingrese componente"+"["+i+"]"+"["+c+"] :");
                matriz[i][c] = teclado.nextInt();
            }
        }
    }
    
    public void imprimir(int[][] matriz) {
        for (int[] matriz1 : matriz) {
            for (int c = 0; c < matriz1.length; c++) {
                System.out.print(matriz1[c] + " ");
            }
            System.out.println();
        }
    }

    public int[][] crearTranspuesta(){
        int trans[][] = new int[orden][orden];
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                trans[j][i]= matriz[i][j];
                
            }
        }
                
        return trans;
    }
     public void crearMatrizSimetrica(int trans[][]){
        int[][] simetrica = new int[orden][orden];
        System.out.println("matriz simetrica");
        for(int i=0; i<matriz.length;i++){
            for(int j=0; j<matriz[i].length||j<trans[i].length;j++){
                int posicion =(matriz[i][j]+trans[i][j]);
                simetrica[i][j]= posicion/2;
                }
            
        }
        imprimir(simetrica);
    }
     
     
     public void crearMatrizAntiSimetrica(int trans[][]){
        
        int[][] antisimetrica = new int[orden][orden];
        
        System.out.println("matriz Anti-simetrica: ");
        
        for(int i=0; i < matriz.length; i++){
            
            for(int j=0; j < matriz[i].length || j < trans[i].length; j++){
                int posicion =(matriz[i][j] - trans[i][j]);
                antisimetrica[i][j]= posicion/2;
                }
        }
        
        imprimir(antisimetrica);
    }
}
