package ar.edu.unahur.obj2.ejercicio1;

import java.util.*;

public class Ejercicio11 {
    public static void main(String[] args){

        int[] arreglo = new int[10];

       for (int t=0 ; t < 10  ; t++){
            Scanner scan = new Scanner(System.in);
            System.out.println("intoduce 10 numeros");
            arreglo[t] = scan.nextInt();
        }
       for (int j = 9 ; j>0 ; j--){
            System.out.println(arreglo[j]);
        }

    }
}
