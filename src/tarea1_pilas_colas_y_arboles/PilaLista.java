/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea1_pilas_colas_y_arboles;

/**
 *
 * @author MAR10
 */
public class PilaLista {
    Nodo top;
    
    //constructor de Pila
    
    public PilaLista() {
        top = null;
    }
    //validar si la pila esta vacia
    public boolean estaVacia(){
        return top == null;
    }
    
    //agregar un elemento a la pila
    public void push(int date){
        Nodo nodo = new Nodo(date);
        nodo.next = top;
        top = nodo;
        System.out.println(date);
    }
    
    //eliminar elemento de la pila
    public void pop(int date){
        if(top == null){
            System.out.println("Pila Vacia");
            return;
        }
        if(top.date == date){
            top = top.next;
            System.out.println(top.date);
        }
        Nodo actual = top;
        while(actual.next != null){
            if(actual.next.date == date){
                actual.next = actual.next.next;
                System.out.println(actual.next.date);
                return;
            }
            actual = actual.next;
        }
        System.out.println("Elemento no encontrado");
    }
    //buscar un elemento dentro de la pila
    public boolean search(int date){
        Nodo actual = top;
        while(actual!= null){
            if(actual.date == date){
                System.out.println(date);
                return true;
            }
            actual = actual.next;
        }
        System.out.println("Elemento no encontrado");
        return false;
    }
    
    //vaciar la pila
    public void clear(){
        top = null;
        System.out.println("Pila vaciada");
    }
    
    //mostrar todos los elementos de la pila
    public void show(){
        if(top == null){
            System.out.println("La pila esta vacia");
        }
        Nodo actual = top;
        System.out.println("----Elementos en la Pila-----");
        while(actual != null){
            System.out.println(actual.date);
            actual = actual.next;
        }
    }
}
