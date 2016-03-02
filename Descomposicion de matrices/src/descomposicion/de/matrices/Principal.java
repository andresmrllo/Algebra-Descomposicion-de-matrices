/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package descomposicion.de.matrices;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Minor Umaña, Monica Ureña , Jose Ramirez
 */

public class Principal {
    
        public static void promptEnterKey(){        
        try {            
            System.out.println("Presione \"ENTER\" para continuar...");
            int read = System.in.read(new byte[2]);
            limpiarConsola();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private static void limpiarConsola(){
        for(int clear = 0; clear < 50; clear++)
        {
           System.out.println("\b") ;
        }
    }
    
    public static void menu()
    {
        
        System.out.println("\tDigite la opción que desea realizar");
        System.out.println("\t\t1)Crear suma de matrices");
        System.out.println("\t\t2)Salir\n");
        
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        cualMetodo(num);
    }
    
    public static void cualMetodo(int seleccion)
    {
        Matriz ma;
        int[][] transpuesta ;
        
        switch(seleccion) 
        {
            case 1:
                ma = new Matriz();
                ma.cargar();
                transpuesta = ma.crearTranspuesta();
                System.out.println("Matriz creada");
                ma.imprimir(ma.matriz);
                System.out.println("Su matriz es igual a la suma de:\n");
                ma.crearMatrizSimetrica(transpuesta);
                System.out.println("\n+\n");
                ma.crearMatrizAntiSimetrica(transpuesta);
                System.out.println("\n----------------------------\n");
                menu();
                break;
            case 2:
                promptEnterKey();
                System.out.println("--> CERRANDO SISTEMA \n\n\t¡Hasta pronto!\n");
                System.exit(0);
                break;
        default: 
            System.out.println("Error: Ha digitado una opción no válida.");
            promptEnterKey();
            menu();
            break;
        }
    }
    
    public static void main(String[] args) 
    {
        System.out.println("Bienvenido");
        menu();
    } 
 }
    
