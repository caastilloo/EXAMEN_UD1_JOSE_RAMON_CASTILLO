package org.example;

import com.sun.source.doctree.EscapeTree;

import java.util.Scanner;

public class Leysin {

    static void main() { //Da comienzo a nuestro programa

        Scanner teclado = new Scanner(System.in); //Asignamos un nuevo scanner llamado teclado, para que nos lea lo que escribimos

        boolean repetir = false; //Boolean nos sirve para poder hacer un buclo o repetir algo
        int edad = 0; //Asignamos como variable la edad y le ponemos el valor 0, que posteriormente se modificara por lo que escribamos

        do { //Esta condición la utilizamos para hacer lo que esta dentro de el do hasta que el repetir sea igual a true
            try { //Hara el intento de introducir la edad y si no hay ninguna excepcion ni error da paso a lo siguiente
                System.out.println("Introduce la edad del comprador:"); //Imprimimos una frase que nos indica que introduzcamos la edad
                edad = teclado.nextInt(); //Asignamos a la edad el numero que nuestro scanner lea (el numero que escribamos)
                repetir = false; //Indica que repetir es falso y no volvera a pedirnos la edad del comprador

            }catch (Exception er){ //Cogerá las excepciones que se generen al intentar el try e imprimira el formato introducido no es correcto
                System.out.println("El formato introducido no es correcto"); //Imprime el formato introducido no es correcto
                repetir =true; //Indica que repetir es verdadero y volvera a pedirnos la edad del comprador

            }
            teclado.nextLine(); //Lo utilizamos para que no entre en bucle y nos imprima todo el rato el bloque
        }while (repetir==true); //Repetira todo el do hasta que repetir sea igual a true

        if (edad>=21){ //Si la edad es mayor que 21 entonces imprimira Todo tipo de alcohol
            System.out.println("TODO TIPO DE ALCOHOL"); //Imprime la frase TODO TIPO DE alcohol
        } else if (edad>=18) { //Y si es mayor o igual que 18 imprimirá solo fermentadas ...
            System.out.println("SÓLO FEMRENTADAS (cervezas y vinos)"); //Imprime la frase solo fementadas (cervezas y vinos)
        }else{ //Si no ocurre nada de esto imprimira consumo no permitido
            System.out.println("CONSUMO NO PERMITIDO"); //Imprimira CONSUMO NO PERMITIDO
        }


    }
}
