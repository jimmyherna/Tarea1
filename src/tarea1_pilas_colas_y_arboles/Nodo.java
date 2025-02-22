/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea1_pilas_colas_y_arboles;

/**
 *
 * @author MAR10
 */
public class Nodo {
    int date;
    Nodo next;
    
    //constructor del nodo

    public Nodo(int date) {
        this.date = date;
        this.next = null;
    }
    
    //getters

    public int getDate() {
        return date;
    }

    public Nodo getNext() {
        return next;
    }
    
    
}
