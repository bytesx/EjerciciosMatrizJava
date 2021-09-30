import static java.lang.Math.*;

public class EjercicioMatrizJava {
    public static void main(String[] args) {
        //Edgar Vazquez - Java - Ejercicio con Matriz
        // Objetivos del Ejercicio
        // 1.- Crear Matriz 5 x5
        // 2.- Llenar Matriz con numeros Aleatorios
        // 3.- Mostrar promedio de la matriz
        // 4.- Mostrar numero mayor y cuanto se repite
        // 5.- Mostrar en consola todos los números primos.
        // 6.- Mostrar en consola todos los números pares.
        // 7.- Mostrar en consola la suma de las diagonales
        // 8.- Mostrar en consola la suma de la la última fila.
        // 9.- Mostrar en consola el mensaje "Cuadrado Mágico" si la matriz cataloga como un cuadrado mágico.

        //Declarando Variables
        int[][] asuMatriz = new int[5][5];
        int x, y, z; // Variables para Iteracion
        double sumaPromedio = 0;

        for (x = 0; x < asuMatriz.length; x++) {
            for (y = 0; y < asuMatriz.length; y++) {
                asuMatriz[x][y] = (int) (Math.random()*100);
                System.out.println(asuMatriz[x][y]);
                sumaPromedio = (sumaPromedio + asuMatriz[x] [y]) / 10;
            }
        }
        System.out.println("El promedio del arreglo es: " + String.format("%2f",sumaPromedio));
    }
}
