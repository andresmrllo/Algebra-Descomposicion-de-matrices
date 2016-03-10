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
    public double[][] matriz;
    public int orden ;
    
    public void cargar() {
        teclado=new Scanner(System.in);
        System.out.print("Cuantas filas y columnas tiene la matriz:");
        orden =teclado.nextInt();
        matriz=new double[orden][orden];
        for (int i=0; i< matriz.length;i++) {
            for (int c = 0; c < matriz[i].length; c++) {
                System.out.print("Ingrese componente"+"["+i+"]"+"["+c+"] :");
                matriz[i][c] = teclado.nextInt();
            }
        }
    }
    
    public void imprimir(double[][] matriz) {
        for (double[] matriz1 : matriz) {
            for (int c = 0; c < matriz1.length; c++) {
                System.out.print(matriz1[c] + " ");
            }
            System.out.println();
        }
    }

    public double[][] crearTranspuesta(){
        double trans[][] = new double[orden][orden];
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                trans[j][i]= matriz[i][j];
                
            }
        }
                
        return trans;
    }
     public void crearMatrizSimetrica(double trans[][]){
        double[][] simetrica = new double[orden][orden];
        System.out.println("matriz simetrica");
        for(int i=0; i<matriz.length;i++){
            for(int j=0; j<matriz[i].length||j<trans[i].length;j++){
                double posicion =(matriz[i][j]+trans[i][j]);
                simetrica[i][j]= posicion/2;
                }
            
        }
        imprimir(simetrica);
    }
     
     
     public void crearMatrizAntiSimetrica(double trans[][]){
        
        double[][] antisimetrica = new double[orden][orden];
        
        System.out.println("matriz Anti-simetrica: ");
        
        for(int i=0; i < matriz.length; i++){
            
            for(int j=0; j < matriz[i].length || j < trans[i].length; j++){
                double posicion =(matriz[i][j] - trans[i][j]);
                antisimetrica[i][j]= posicion/2;
                }
        }
        
        imprimir(antisimetrica);
    }
}
