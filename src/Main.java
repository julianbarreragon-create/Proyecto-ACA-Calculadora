import com.proyecto.modelo.Calculadora;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        System.out.println("====================================");
        System.out.println("       CALCULADORA ACA - JAVA");
        System.out.println("====================================");

        while (continuar) {

            mostrarMenu();

            try {

                int opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {

                    case 1:
                        realizarSuma(scanner);
                        break;

                    case 2:
                        realizarResta(scanner);
                        break;

                    case 3:
                        realizarMultiplicacion(scanner);
                        break;

                    case 4:
                        realizarDivision(scanner);
                        break;

                    case 5:
                        continuar = false;
                        System.out.println(
                                "\nGracias por utilizar la calculadora."
                        );
                        break;

                    default:
                        System.out.println(
                                "\nOpcion invalida. Seleccione una opcion del 1 al 5."
                        );
                }

            } catch (NumberFormatException e) {

                System.out.println(
                        "\nError: debe ingresar un numero valido."
                );
            }

            System.out.println();
        }

        scanner.close();
    }

    public static void mostrarMenu() {

        System.out.println("========== MENU ==========");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opcion: ");
    }

    public static double pedirNumero(
            Scanner scanner,
            String mensaje) {

        while (true) {

            try {

                System.out.print(mensaje);

                return Double.parseDouble(
                        scanner.nextLine()
                );

            } catch (NumberFormatException e) {

                System.out.println(
                        "Error: ingrese un numero valido."
                );
            }
        }
    }

    public static void realizarSuma(Scanner scanner) {

        System.out.println("\n===== SUMA =====");

        double numero1 = pedirNumero(
                scanner,
                "Ingrese el primer numero: "
        );

        double numero2 = pedirNumero(
                scanner,
                "Ingrese el segundo numero: "
        );

        Calculadora calculadora =
                new Calculadora(numero1, numero2);

        System.out.println(
                "Resultado: " + calculadora.sumar()
        );

        calculadora.mostrarValores();
    }

    public static void realizarResta(Scanner scanner) {

        System.out.println("\n===== RESTA =====");

        double numero1 = pedirNumero(
                scanner,
                "Ingrese el primer numero: "
        );

        double numero2 = pedirNumero(
                scanner,
                "Ingrese el segundo numero: "
        );

        Calculadora calculadora =
                new Calculadora(numero1, numero2);

        System.out.println(
                "Resultado: " + calculadora.restar()
        );
    }

    public static void realizarMultiplicacion(
            Scanner scanner) {

        System.out.println("\n===== MULTIPLICACION =====");

        double numero1 = pedirNumero(
                scanner,
                "Ingrese el primer numero: "
        );

        double numero2 = pedirNumero(
                scanner,
                "Ingrese el segundo numero: "
        );

        Calculadora calculadora =
                new Calculadora(numero1, numero2);

        System.out.println(
                "Resultado: " + calculadora.multiplicar()
        );
    }

    public static void realizarDivision(Scanner scanner) {

        System.out.println("\n===== DIVISION =====");

        double numero1 = pedirNumero(
                scanner,
                "Ingrese el primer numero: "
        );

        double numero2 = pedirNumero(
                scanner,
                "Ingrese el segundo numero: "
        );

        Calculadora calculadora =
                new Calculadora(numero1, numero2);

        try {

            System.out.println(
                    "Resultado: " + calculadora.dividir()
            );

        } catch (ArithmeticException e) {

            System.out.println(
                    "Error: " + e.getMessage()
            );
        }
    }
}