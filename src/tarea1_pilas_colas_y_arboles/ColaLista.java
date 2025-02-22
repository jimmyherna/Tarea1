/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea1_pilas_colas_y_arboles;

/**
 *
 * @author MAR10
 */
public class ColaLista {
    Nodo begin, end;
    
    //constructor 
    public ColaLista(){
        begin = null;
        end = null;
    }
    
    //validar si la cola esta vacia
    public boolean estaVacia(){
        return begin == null;
    }
    
    //agregar elemento a la cola
    public void add(int date){
        Nodo nodo = new Nodo(date);
        if(end != null){
            end.next = nodo;
        }
        if(begin == null){
            begin = nodo;
        }
        end = nodo;
        System.out.println(date);
    }
    
    //eliminar elemento de la cola
    public void remove(int date){
        if(begin == null){
            System.out.println("Cola vacia");
            return;
        }
        
        if(begin.date == date){
            System.out.println(begin.date);
            begin = begin.next;
            if (begin == null){
                end = null;
            }
            return;
        }
        Nodo actual = begin;
        while(actual != null && actual.next != null){
            if(actual.next.date == date){
                System.out.println(actual.next.date);
                actual.next = actual.next.next;
                if(actual.next == null){
                    end = actual;
                }
                return;
            }
            actual = actual.next;
        }
        System.out.println("Elemento no encontrado en la cola");
    }
    
    //buscar elemento en la cola
    public boolean seek(int date){
        Nodo actual = begin;
        while(actual != null){
            if(actual.date == date){
                System.out.println(date);
                return true;
            }
            actual = actual.next;
        }
        System.out.println("Elemento no encontrado en la cola");
        return false;
    }
    
    //vaciar la cola
    public void drain(){
        begin = null;
        end = null;
        System.out.println("Cola vaciada");
    }
    
    //mostrando todos los datos de la cola
    public void show(){
        if(begin == null){
            System.out.println("Cola vacia");
        }
        Nodo actual = begin;
        System.out.println("---Elementos en la cola---- ");
        while(actual != null){
            System.out.println(actual.date);
            actual = actual.next;
        }
    }
}
