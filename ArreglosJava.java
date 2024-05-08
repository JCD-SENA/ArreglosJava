package juanca.arreglosjava;

/*
Ejercicio 1
Un programa que tenga un arreglo bidimencional que contenga las fechas 2015-2023 y la población por año. Luego se itera por cada elemento haciendo uso del grupo for.
*/

public class ArreglosJava {
    public static void main(String[] args) {
        String datePop[][] = {
            {"2019", "2020", "2021", "2022", "2023"},
            {"7,764,951,032", "7,840,952,880", "7,909,295,151", "7,975,105,156", "8,045,311,447"}
        }; // Información sacada de https://www.macrotrends.net/global-metrics/countries/WLD/world/population
        for (int i=0;i<datePop[0].length;i++) {
            System.out.println("El año "+datePop[0][i]+" tenia una población de "+datePop[1][i]);
        }
    }
}
