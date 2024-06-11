package Materia.Pilas;

import java.util.EmptyStackException;

import Materia.Models.Node;

public class Pila {
    private Node top;

    public Pila() {
        top = null;
    }

    // Push agregar elemento a la fila
    public void push(int value) {
        Node nuevoNode = new Node(value);
        nuevoNode.next = top;
        top = nuevoNode;

    }

    // pop
    public int pop() {
        if (top == null) {
            System.out.println("La fila esta vacia");
            throw new EmptyStackException();
        } else {
            int value = top.value;
            top = top.next;
            return value;
        }
    }

    // metodo peek
    public int peek() {
        if (top == null) {
            System.out.println("La fila esta vacia");
            throw new EmptyStackException();
        }
        return top.value;

    }

    // metodo empytu

    public boolean isEmpty() {
        return top == null;

    }

}
