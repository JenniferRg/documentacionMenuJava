

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int response = 0;
        Scanner sc = new Scanner(System.in); // Movido fuera del bucle

        do {
            System.out.println("Selecciona el número de la opción deseada");
            System.out.println("1. movies");
            System.out.println("2. Series");
            System.out.println("0. Salir");

            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 0:
                    System.out.println("Gracias por visitarnos");
                    break;
                case 1:
                    System.out.println("Movies");
                    break;
                case 2:
                    System.out.println("Series");
                    break;
                default:
                    System.out.println("Selecciona una opción válida");
            }

        } while (response != 0);

        // Cerramos el Scanner después de usarlo
        sc.close();
        System.out.println("se terminó el programa");
    }
}
