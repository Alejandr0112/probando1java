import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int numero2 = scanner.nextInt();

        System.out.print("Ingrese el tercer numero: ");
        int numero3 = scanner.nextInt();

        NumeroMayor numeroMayor = new NumeroMayor(numero1, numero2, numero3);
        int mayor = numeroMayor.obtenerMayor();

        System.out.println("El mayor de los tres numeros es: " + mayor);

        scanner.close();
    }
}

class NumeroMayor {
    private int numero1;
    private int numero2;
    private int numero3;

    public NumeroMayor(int numero1, int numero2, int numero3) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;
    }

    public int obtenerMayor() {
        int mayor = numero1;

        if (numero2 > mayor) {
            mayor = numero2;
        }

        if (numero3 > mayor) {
            mayor = numero3;
        }

        return mayor;
    }
}

import java.util.Scanner;

public class MenuEjercicios {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 4) {
            System.out.println("Menu de Ejercicios");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    ejercicio1();
                    break;
                case 2:
                    ejercicio2();
                    break;
                case 3:
                    ejercicio3();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida, intente de nuevo.");
            }
        }

        scanner.close();
    }

    public static void ejercicio1() {
        System.out.println("Ejecutando Ejercicio 1...");
        // Logica del Ejercicio 1
    }

    public static void ejercicio2() {
        System.out.println("Ejecutando Ejercicio 2...");
        // Logica del Ejercicio 2
    }

    public static void ejercicio3() {
        System.out.println("Ejecutando Ejercicio 3...");
        // Logica del Ejercicio 3
    }
}

