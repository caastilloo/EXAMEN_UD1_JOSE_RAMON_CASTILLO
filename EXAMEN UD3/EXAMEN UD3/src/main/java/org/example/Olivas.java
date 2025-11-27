package org.example;

import java.util.Arrays;
import java.util.IllegalFormatCodePointException;
import java.util.Random;
import java.util.Scanner;

public class Olivas {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("*** BIENVENIDO AL OLIVOMETRO ***");

        System.out.println("Introduce el tamaño de tu bancal ...");

        System.out.println("Ancho:");
        int ancho = teclado.nextInt();

        System.out.println("Alto:");
        int alto = teclado.nextInt();

        int matriz [][] = new int[alto][ancho];

        System.out.println("Introduce (por hileras) los kg por árbol de tu bancal:");

        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = aleatorio.nextInt(50-1+1)+1;
                suma+= matriz[i][j];
            }
        }

        System.out.println("================================");

        System.out.println("MAPA tu bancal actual:");

        for (int num[] : matriz){
            System.out.println(Arrays.toString(num));

        }

        System.out.println("================================");

        System.out.println("Total KG generados: " + suma + " kg");
        double litrosTotales = suma/8;
        System.out.println("Litros totales obtenidos: " + litrosTotales + "L");

        int hileraL = 0;
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {


            }

        }

        System.out.println("Litros por hilera...");

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                hileraL += matriz[i][j];

            }

            System.out.println("- Hilera " + i+1 + ": " + hileraL + "L");
            hileraL=0;
        }

        System.out.println("Olivos más productivos...");

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] > 35 ){

                    System.out.println("- En la posición (" + j + ", " + i + ") con " + matriz[i][j] + " kg.");

                }
            }
        }

        System.out.println("================================");

        System.out.println("MAPA para replatar:");


        String matriz_vacia [][] = new String[alto][ancho];

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                matriz_vacia[i][j]= "O";

                if (matriz[i][j]<5){
                    matriz_vacia[i][j] = "X";
                }
            }
        }

        for (String busc[]: matriz_vacia){
            System.out.println(Arrays.toString(busc));
        }

        System.out.println("================================");
        System.out.println("MAPA estimación después de replantar:");

        for (int i = 0; i < matriz_vacia.length; i++) {

            for (int j = 0; j < matriz_vacia[i].length; j++) {

                if (matriz_vacia[i][j].equals("X")){
                    matriz[i][j] = aleatorio.nextInt(35-15+1)+1;
                }

            }
        }

        for (int filas[] : matriz){
            System.out.println(Arrays.toString(filas));
        }








    }
//        for (int i = 0; i < matriz.length; i++) {
//
//            String kg [] = teclado.next().split(" ");
//
//            for (int j = 0; j < arr; j++) {
//
//                matriz[i][j] = kg[i];
//
//
//
//            }
//        }





    }
