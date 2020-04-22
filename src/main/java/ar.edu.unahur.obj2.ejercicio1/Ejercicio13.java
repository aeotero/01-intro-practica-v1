package ar.edu.unahur.obj2.ejercicio1;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args){
        double[] tempXHora = new double[24];
        double auxTempMin = 100, auxTempMax = -100,sumador ;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 24; i++){
            System.out.println("ingrese la temperatura");
            tempXHora[i]=scanner.nextDouble();
            if (tempXHora[i] > auxTempMax){
                auxTempMax = tempXHora[i];
            }
            if (tempXHora[i] < auxTempMin) {
                auxTempMin = tempXHora[i];
            }
        }

        for (int i = 0; i < 24; i++){
            System.out.print(i);

            for(int j=0; j<tempXHora[i]; j++){
                System.out.print("*");
            }

            if (tempXHora[i] == auxTempMax){
                System.out.println(tempXHora[i] + " --> MAX");
            }
            else if (tempXHora[i] == auxTempMin){
                System.out.println(tempXHora[i] + " --> MIN");
            }
            else {
                System.out.println(tempXHora[i]);
            }
// FALTA PROMEDIO
        }
    }
}
