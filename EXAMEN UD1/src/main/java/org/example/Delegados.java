package org.example;

import java.util.Scanner;

public class Delegados {

    static void main() {

        Scanner teclado = new Scanner(System.in); //Asignamos un nuevo scanner llamado teclado, para que nos lea lo que escribimos

        System.out.println("Introduce el nombre del candidato 1:"); //Imprimimos un texto que diga introduce el nombre del canddato 1
        String cand1 = teclado.nextLine(); //Guardamos en cand1 el nombre del primer candidato

        System.out.println("Introduce el nombre del candidato 2:"); //Imprimimos un texto que diga introduce el nombre del canddato 2
        String cand2 = teclado.nextLine(); //Guardamos en cand2 el nombre del primer candidato 2

        System.out.println("Votos para " + cand1 + ":"); //Imprimimos un texto que diga votos para y el nombre que le hayamos puesto a la variable cand1
        int votos1 = teclado.nextInt(); //Guardamos en la variable votos1 los votos que ha obtenido el candidato 1

        System.out.println("Votos para " + cand2 + ":"); //Imprimimos un texto que diga votos para y el nombre que le hayamos puesto a la variable cand2
        int votos2 = teclado.nextInt(); //Guardamos en la variable votos2 los votos que ha obtenido el candidato 2

        int votos_dispo = 25; //Guardamos en la variable votos_dispo el total de alumnos de una clase
        int suma_votos = votos1+votos2; //Guardamos en la variable suma_votos la suma de los votos que ha obtenido en candidato 1 y el candidato 2
        int votos_blancos = 25-suma_votos; //Guardamos en la variable votos_blancos 25 menos la suma total de los votos obtenidos entre los dos para obtener la informacion de la gente que no ha votadp

        System.out.println("RESULTADOS:"); //Imprimimos una frase que diga resultados

        if (suma_votos>25){ //Si la suma de los votos es mayor que 25
            System.out.println("Total de votos: " + suma_votos); //Imprimiremos el total de votos por una parte
            System.out.println("ERROR. No puede votar más personas (" + suma_votos + ") que estudiantes tiene la clase: 25"); //Y un mensaje de error diciendo que no puede haber mas de 25 votos totales
        } else if (votos1==votos2){ //Y si los votos1 son iguales a los votos del segundo candidato
            System.out.println("REPETIR VOTACIÓN"); //Imprimimos el mensaje de repetir la votacion ya que no puede haber un empate
        }

        if (suma_votos<25 && votos1>votos2) { //si la suma de los votos es menor que 25 y los votos del candidato 1 son mayores que el del 2
            System.out.println("Total de votos: " + suma_votos); //imprimimos la suma de los votos
            System.out.println("Votos en blanco: " + votos_blancos); //imprimimos la gente que no ha votado
            System.out.println("DELEGADO " + cand1); //imprimimos que el delegado es el candidato 1
        } else if (suma_votos<25 && votos1<votos2)//si no el delegado sera el segundo candidate
            System.out.println("Total de votos: " + suma_votos); //imprimimos la suma de los votos
            System.out.println("Votos en blanco: " + votos_blancos); //imprimimos la gente que no ha votado
            System.out.println("DELEGADO " + cand2); //imprimimpos que el delegado es el candidato 2
        } else if (votos1==votos2)
    }



    }



