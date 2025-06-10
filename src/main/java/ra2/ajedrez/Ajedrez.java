/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ra2.ajedrez;

import java.util.Scanner;

/**
 *
 * @author DAVID SANCHEZ
 */
public class Ajedrez {
   
    public static void iniciarTablero(String[][] tablero){
        //Piezas: T (Torre), C (Caballo), 
            //A (Alfil), K (King – rey), Q (Queen – reina), P (Peón). 
        System.out.println("Iniciamos partida!");
        //Añadir piezas blancos []
        tablero[7][0] = "(T)";
        tablero[7][7] = "(T)";
        tablero[7][1] = "(C)";
        tablero[7][6] = "(C)";
        tablero[7][2] = "(A)";
        tablero[7][5] = "(A)";
        tablero[7][4] = "(K)";
        tablero[7][3] = "(Q)";
        //Añadimos peones blancos
        for(int i = 6; i < 7; i++){
            for(int j = 0; j < tablero[i].length; j++){
                tablero[i][j] = "(P)";
            }
        }
        //Añadir piezas negras ()
        tablero[0][0] = "[T]";
        tablero[0][7] = "[T]";
        tablero[0][1] = "[C]";
        tablero[0][6] = "[C]";
        tablero[0][2] = "[A]";
        tablero[0][5] = "[A]";
        tablero[0][3] = "[K]";
        tablero[0][4] = "[Q]";
        //Añadimos peones negros
        for(int i = 1; i < 2; i++){
            for(int j = 0; j < tablero[i].length; j++){
                tablero[i][j] = "[P]";
            }
        }        
        //Añadir casillas vacías " . "
            //Fila de la 2 a la 5
            //Columna de la 0 a la 7
        for(int i = 2; i < 6; i++){
            for(int j = 0; j < tablero[i].length; j++){
                tablero[i][j] = " . ";
            }
        }

    }
    
    public static void mostrarTablero(String[][] tablero){
        for(String[] fila:tablero){
            System.out.println();
            for(String celda:fila){
                System.out.print(celda + " ");
            }
        }
    }    
    
    public static void verificarTablero(String[][] tablero){
        for(String[] fila:tablero){
            for(String celda:fila){
                if(celda.contains("[")){
                    System.out.println("Son negras");
                }else if(celda.contains("(")){
                    System.out.println("Son blancas");
                }
            }
        }
    }
    
    public static String seleccionarPieza(String [][] tablero, 
            String piezaActiva, Scanner scan){
        System.out.println("FILA y COLUMNA PIEZA: ");
        final int [] FILA = {0,1,2,3,4,5,6,7};
        final int [] COLUMNA = {0,1,2,3,4,5,6,7};
        piezaActiva = FILA + " " + COLUMNA;
        String piezaSelect = scan.nextLine();
//        switch(piezaActiva){
//            case FILA: 
//        }
        return piezaActiva;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [][] tablero = new String [8][8];        
        String piezaActiva = null;
        
        iniciarTablero(tablero);
        mostrarTablero(tablero);
        
        scan.close();
    }
    
}
