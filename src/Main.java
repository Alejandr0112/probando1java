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
