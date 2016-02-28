/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package descomposicion.de.matrices;

/**
 *
 * @author Andresmrllo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Matriz ma=new Matriz();
        ma.cargar();
        ma.imprimir();
       // ma.imprimirUltimaFila();
        ma.crearTranspuesta(ma.matriz);
    } 
 }
    
