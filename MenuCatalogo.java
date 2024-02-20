import java.util.Scanner;

public class MenuCatalogo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario que ingrese su nombre
        System.out.println("¡Bienvenido al Catálogo de Películas y Series!");
        System.out.print("Por favor, ingresa tu nombre o usuario: ");
        String nombreUsuario = sc.nextLine();
        System.out.println("Hola, " + nombreUsuario + "!");

        // Llamar a la función que muestra el menú principal
        mostrarMenuPrincipal(sc);

        // Cerramos el Scanner después de usarlo
        sc.close();
        System.out.println("Se terminó el programa");
    }

    /**
     * Muestra el menú principal y maneja las opciones seleccionadas por el usuario.
     * @param sc Scanner utilizado para leer la entrada del usuario.
     */
    public static void mostrarMenuPrincipal(Scanner sc) {
        int response = 0;

        // Loop principal del menú
        do {
            // Mostrar opciones del menú principal
            System.out.println("Selecciona el número de la opción deseada");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("0. Salir");

            // Leer la opción seleccionada por el usuario
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 0:
                    System.out.println("Gracias por visitarnos");
                    break;
                case 1:
                    System.out.println("Movies");
                    // Mostrar submenú de géneros de películas
                    mostrarSubMenuMovies(sc);
                    break;
                case 2:
                    System.out.println("Series");
                    // Mostrar submenú de opciones de series
                    mostrarSubMenuSeries(sc);
                    break;
                default:
                    System.out.println("Selecciona una opción válida");
            }

        } while (response != 0);
    }

    /**
     * Muestra el submenú de géneros de películas y maneja las opciones seleccionadas por el usuario.
     * @param sc Scanner utilizado para leer la entrada del usuario.
     */
    public static void mostrarSubMenuMovies(Scanner sc) {
        int response = 0;

        // Loop del submenú de películas
        do {
            // Mostrar opciones del submenú de películas
            System.out.println("Selecciona el número del género de películas:");
            System.out.println("1. Drama");
            System.out.println("2. Terror");
            System.out.println("3. Ciencia ficción");
            System.out.println("0. Volver al menú principal");

            // Leer la opción seleccionada por el usuario
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 0:
                    System.out.println("Volviendo al menú principal...");
                    break;
                case 1:
                    System.out.println("Drama");
                    break;
                case 2:
                    System.out.println("Terror");
                    break;
                case 3:
                    System.out.println("Ciencia ficción");
                    break;
                default:
                    System.out.println("Selecciona una opción válida");
            }

        } while (response != 0);
    }

    /**
     * Muestra el submenú de opciones de series y maneja las opciones seleccionadas por el usuario.
     * @param sc Scanner utilizado para leer la entrada del usuario.
     */
    public static void mostrarSubMenuSeries(Scanner sc) {
        int response = 0;

        // Loop del submenú de series
        do {
            // Mostrar opciones del submenú de series
            System.out.println("Selecciona el número de la opción deseada para Series:");
            System.out.println("1. Series más populares");
            System.out.println("2. Todas las series");
            System.out.println("0. Volver al menú principal");

            // Leer la opción seleccionada por el usuario
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 0:
                    System.out.println("Volviendo al menú principal...");
                    break;
                case 1:
                    System.out.println("Series más populares");
                    break;
                case 2:
                    System.out.println("Todas las series");
                    break;
                default:
                    System.out.println("Selecciona una opción válida");
            }

        } while (response != 0);
    }
}
