package juanca.arreglosjava;

/*
Ejercicio 2
Un programa que sume los valores del 1 al 5 y del 6 al 10 en dos arrays respectivamente para almacenar el resultado en otro array
*/

public class Ejercicio2 {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5}, arr2[] = {6, 7, 8, 9, 10}, resArr[] = new int[5];
        for (int i=0;i<5;i++) {
            resArr[i] = arr1[i] + arr2[i];
            System.out.println(resArr[i]);
        }
        
    }
}
