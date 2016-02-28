import java.util.Scanner;

public class Matriz {
    private Scanner teclado;
    private int[][] matriz;
    
    public void cargar() {
        teclado=new Scanner(System.in);
        System.out.print("Cuantas filas tiene la matriz:");
        int filas=teclado.nextInt();
        System.out.print("Cuantas columnas tiene la matriz:");
        int columnas=teclado.nextInt();
        matriz=new int[filas][columnas];
        for(int f=0;f<matriz.length;f++) {
            for(int c=0;c<matriz[f].length;c++) {
                System.out.print("Ingrese componente:");
                matriz[f][c]=teclado.nextInt();
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
        
    public static void main(String[] ar) {
        Matriz5 ma=new Matriz5();
        ma.cargar();
        ma.imprimir();
       // ma.imprimirUltimaFila();
        ma.crearTranspuesta(ma.matriz);
    } 
    
   
}
