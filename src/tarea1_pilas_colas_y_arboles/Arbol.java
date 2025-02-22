/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea1_pilas_colas_y_arboles;

import java.util.Scanner;

/**
 *
 * @author MAR10
 */
import java.util.Scanner;

public class Arbol {

    Nodo raiz;

    // Constructor del árbol
    public Arbol() {
        raiz = null;
    }

    // Método para insertar un nodo
    public void insert(int i) {
       Nodo nodo = new Nodo(i);

        if (raiz == null) {
            raiz = nodo;  // Si el árbol está vacío, el nodo es la raíz
        } else {
            Nodo aux = raiz;
            Scanner read = new Scanner(System.in);

            // Pedir al usuario si insertar a la izquierda o derecha
            while (true) {
                System.out.println("¿Desea insertar el dato " + i + " a la izquierda o derecha? (Desde el nodo con valor " + aux.key + ")");
                String lado = read.nextLine().trim().toLowerCase();

                while (!lado.equals("izquierda") && !lado.equals("derecha")) {
                    System.out.println("Opción no válida. Por favor ingrese 'izquierda' o 'derecha'.");
                    lado = read.nextLine().trim().toLowerCase();
                }

                if (lado.equals("izquierda")) {
                    // Insertar a la izquierda si el nodo no tiene hijo izquierdo
                    if (aux.left == null) {
                        aux.left = nodo;
                        nodo.father = aux;
                        break;
                    } else {
                        // Si ya tiene un hijo a la izquierda, ir a ese hijo y preguntar de nuevo
                        aux = aux.left;
                    }
                } else {
                    // Insertar a la derecha si el nodo no tiene hijo derecho
                    if (aux.right == null) {
                        aux.right = nodo;
                        nodo.father = aux;
                        break;
                    } else {
                        // Si ya tiene un hijo a la derecha, ir a ese hijo y preguntar de nuevo
                        aux = aux.right;
                    }
                }
            }
        }
    }

    // Mostrar el árbol completo
    public void showTree() {
        System.out.println("----Árbol Completo----");
        toTraverse(raiz);
    }

    // Recorrido en orden (in-order traversal)
     public void toTraverse(Nodo n) {
        if (n != null) {
            // Mostrar el nodo antes de sus hijos (recorrido Preorden)
            System.out.println("Indice: " + n.key);
            // Recorrer el subárbol izquierdo
            toTraverse(n.left);
            // Recorrer el subárbol derecho
            toTraverse(n.right);
        }
    }

    // Clase Nodo
    private class Nodo {
        Nodo left;
        Nodo right;
        Nodo father;
        int key;

        public Nodo(int index) {
            key = index;
            left = null;
            right = null;
            father = null;
        }
    }

}
