package ar.edu.unahur.obj2.ejercicio1;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args){

        int[] arreglo = {2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36,38,40};
        int comparador ;
        int[] auxiliar = new int[20];
        int contador = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("ingrese un valor a comparar");
        comparador = scan.nextInt();

        for (int i=0; i<20 ; i++ ) {
            if(comparador < arreglo[i]){
                auxiliar[contador]=arreglo[i];
                contador++;
            }
        }

        for (int i = 0 ; i< contador ; i++){
            System.out.println(auxiliar[i]);
        }


    }
}
