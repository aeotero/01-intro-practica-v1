package ar.edu.unahur.obj2.ejercicio1;

import java.util.List;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args){

        String letra = "h"; //por que es muda =)
        int numCompañeros = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese cantidad de alumnos");
        numCompañeros = scanner.nextInt();
        String[] compañerosNombre = new String[numCompañeros];
        String[] compañerosApellido = new String[numCompañeros];

        for (int i = 0 ; i < numCompañeros ; i++ ){
            System.out.println("ingrese nombre");
            compañerosNombre[i] = scanner.next();
            compañerosNombre[i] = compañerosNombre[i].toUpperCase();
            System.out.println("ingrese apellido");
            compañerosApellido[i] = scanner.next();
            compañerosApellido[i] = compañerosApellido[i].toUpperCase();
        }

        while ( !(letra.equals("FIN"))){
            System.out.println("ingrese letra de nombre a buscar o FIN para salir");
            letra = scanner.next();
            letra = letra.toUpperCase();
            for (int j = 0 ; j < numCompañeros ; j++){
                if (letra.equals(compañerosNombre[j].substring(0,1))){
                    System.out.println(compañerosNombre[j] + " " + compañerosApellido[j]);
                }
            }
        }
    }
}
