package ar.edu.unahur.obj2.ejercicio1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ejercicio15 {
    public static void main(String[] args){
        //Son 3 array ,1 para el texto , otro para el alfabeto , y el tercero para el resultado.
        //Despues un for que recorra caracteres 1 por 1  del texto y valla preguntado en un for anidado
        // con el alfabeto y sumando en el tercer array una unidad numerica por posicion correspondiente
        //a la letra.
        // al final recorrer el tercer array mostrando los valores por letras.

        String textoAAnalizar = " ";
//        String[] abecedario = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z"};
        List<String> abecedario = Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z");
        String[] cantLetras = new String [27];
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el texto");
        textoAAnalizar = scanner.nextLine(); // ver el tema del scanner si toma el texto completo.


        // este metodo tiene que recibir un string y sacar otra coleccion con la cantidad de veces que aparece la letra
        public void contarLetras(String texto){

            salida = texto.map()
            List<Integer> even = numbers.stream()
                    .map(s -> Integer.valueOf(s))
                    .filter(number -> number % 2 == 0)
                    .collect(Collectors.toList());

        }

        public void visualizarRecuento() {

        }



    }


}
