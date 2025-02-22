/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea1_pilas_colas_y_arboles;

import java.util.Scanner;

/**
 *
 * @author MAR10
 */
public class Tarea1_Pilas_Colas_y_Arboles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PilaLista pila = new PilaLista();
        ColaLista cola = new ColaLista();
        Arbol arbol = new Arbol();
        Scanner read = new Scanner(System.in);
        int option = -1; // Inicializamos fuera del rango esperado para asegurar que el bucle se ejecute.

        // Bucle do-while que se repite solo si el valor de option es 1, 2 o 3.
        do {
            System.out.println("Seleccione una opcion: ");
            System.out.println("1. Usar una Pila");
            System.out.println("2. Usar una Cola");
            System.out.println("3. Usar un Arbol Binario");
            System.out.println("Presione cualquier número fuera de 1, 2 o 3 para salir.");

            // Verifica si la entrada es un número
            while (!read.hasNextInt()) {
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
                read.next();  // Limpiar la entrada incorrecta
            }

            option = read.nextInt(); // Guardamos la opción ingresada
            read.nextLine(); // Limpiar el buffer

            // Evaluamos la opción con un switch dentro del bucle
            switch (option) {
                case 1:
                    System.out.println("----EJERCICIO DE PILA----");
                    System.out.println("INSERTANDO DATOS");
                    pila.push(15);
                    pila.push(20);
                    pila.push(60);
                    pila.push(800);
                    pila.push(900);
                    pila.push(750);
                    System.out.println("ELIMINANDO DATOS");
                    pila.pop(20);
                    pila.pop(900);
                    System.out.println("BUSCANDO DATO");
                    pila.search(800);
                    System.out.println("MOSTRANDO DATOS");
                    pila.show();
                    System.out.println("VACIANDO PILA");
                    pila.clear();
                    break;

                case 2:
                    System.out.println("----EJERCICIO DE COLA----");
                    System.out.println("INSERTANDO DATOS");
                    cola.add(35);
                    cola.add(90);
                    cola.add(453);
                    cola.add(100);
                    cola.add(74);
                    cola.add(941);
                    cola.add(200);
                    System.out.println("ELIMINANDO DATOS");
                    cola.remove(100);
                    cola.remove(35);
                    System.out.println("BUSCANDO DATOS");
                    cola.seek(941);
                    System.out.println("MOSTRANDO DATOS");
                    cola.show();
                    System.out.println("VACIANDO COLA");
                    cola.drain();
                    break;

                case 3:
                    read.nextLine();
                    boolean continuar = true;
                    System.out.println("---EJERCICIO ARBOL BINARIO---");
                    read.nextLine();  // Limpiar el buffer
                    while (continuar) {
                        System.out.println("Desea ingresar un dato en el arbol? (si/no): ");
                        String answer = read.nextLine().trim();

                        if (answer.equalsIgnoreCase("si")) {
                            System.out.println("Ingrese el dato a insertar: ");
                            int date = Integer.parseInt(read.nextLine().trim());  // Leer el número
                            arbol.insert(date);  // Insertamos el dato

                            System.out.println("Desea mostrar el arbol completo ahora? (si/no): ");
                            String mostrar = read.nextLine().trim();

                            if (mostrar.equalsIgnoreCase("si")) {
                                arbol.showTree();  // Mostramos el árbol
                            }
                        } else {
                            continuar = false;  // Termina el ciclo si no se desea ingresar más datos
                        }
                    }
                    break;

                default:
                    System.out.println("Opción no válida, intente nuevamente.");
                    break;
            }

        } while (option == 1 || option == 2 || option == 3); // El ciclo se repite si el número es 1, 2 o 3

        // Al salir del bucle, mostramos el mensaje de despedida.
        System.out.println("Hasta Pronto!!");
    }
}
