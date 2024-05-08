package juanca.arreglosjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ejercicio 3
Un programa que tenga una lista de nombres y el programa le pide la usuario su identificación (posición), en caso de estar por fuera del rango del array dará error.
*/

public class Ejercicio3 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String names[] = {"John Piet", "Alfonso Navarro", "Mauricio Zapatero", "N'egma Khosan", "Baal"};
        System.out.print("Ingrese el ID del empleado: ");
        int n = Integer.parseInt(input.readLine());
        if (n >= 0 && n < names.length) {
            System.out.println("Empleado seleccionado: "+names[n]);
        } else {
            System.out.println("ID no se encuentra en la lista");
        }
    }
}
