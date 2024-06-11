package Materia.Pilas;

import java.util.EmptyStackException;

import Materia.Models.NodoGenerico;

public class PilaGenerica<T> {
    private NodoGenerico<T> top;

    public PilaGenerica() {
        top = null;

    }

    public void push(T data) {
        NodoGenerico<T> nuevNodoGenerico = new NodoGenerico<T>(data);
        nuevNodoGenerico.next = top;
        top = nuevNodoGenerico;
    }

    // isEmpty
    public boolean isEmpty() {
        return top == null;
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("La pila esta vacia");
            throw new EmptyStackException();

        }
        T data = top.data;
        top = top.next;
        return data;

    }
    // peek

    public T peek() {
        if (isEmpty()) {
            System.out.println("La pila esta vacia");
            throw new EmptyStackException();

        }
        return top.data;
    }

}
