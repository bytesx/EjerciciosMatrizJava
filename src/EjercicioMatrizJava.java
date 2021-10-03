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
        int a, b = 0, x, w, y, z; // Variables para Iteracion
        double sumaPromedio = 0;
        int numMayor = asuMatriz[0][0];
        boolean esPrimo = false;
        int numPrimo, sumUltimaFila =0;

        // Funcion para Asignar numeros Random y encontrar promedio de Matriz
        for (x = 0; x < asuMatriz.length; x++) {
            for (y = 0; y < asuMatriz.length; y++) {
                asuMatriz[x][y] = (int) (Math.random() * 100);
                System.out.println(asuMatriz[x][y]);
                sumaPromedio = (sumaPromedio + asuMatriz[x][y]) / 10;
            }
        }


        /// Funcion para Buscar numero mayor en Arreglo Bidimensional
            for (w = 0; w < asuMatriz.length; w++) {
                for (z = 0; z < asuMatriz.length; z++) {
                    if (asuMatriz[w][z] >= numMayor) {
                        numMayor = asuMatriz[w][z];
                        sumUltimaFila = (asuMatriz[4][4] + asuMatriz[4][4]);
                    }
                }
            }
        System.out.println("El numero mayor es: " + numMayor);
        System.out.println("El promedio del arreglo es: " + String.format("%2f", sumaPromedio));
        System.out.println("Los ultimos numeros de la fila son: " + asuMatriz[4][4]);
        System.out.println("La suma de los ultimos numero es: " + sumUltimaFila);

        for ( a = 0; a < asuMatriz.length; a++) {
            for (b = 0; b < asuMatriz.length; b++) {
                esPrimo = true;
                for ( numPrimo = 2; numPrimo < a; numPrimo++){
                    for ( numPrimo= 2; numPrimo < b; numPrimo++) {
                        if ( a % numPrimo == 0) {
                            if ( b % numPrimo == 0) {
                                esPrimo = false;
                            }
                        }
                    }
                }
                if(esPrimo)
                    System.out.println("Los numeros primos son: " + asuMatriz[a][b]);
            }
        }

    }
}
