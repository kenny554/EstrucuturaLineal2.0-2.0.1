package Materia.Colas;

import java.util.NoSuchElementException;

import Materia.Models.NodoGenerico;

public class ColaGenerica<T> {
    private NodoGenerico<T> first;
    private NodoGenerico<T> last;
    private int tamanio;

    public ColaGenerica() {
        this.first = null;
        this.last = null;
        this.tamanio = 0;
    }

    public void allNode(T data) {
        NodoGenerico<T> nuevoNodo = new NodoGenerico<T>(data);
        if (isEmpty()) {
            first = nuevoNodo;
            last = nuevoNodo;
            tamanio++;

        } else {
            last.next = nuevoNodo;
            last = nuevoNodo;
            tamanio++;
        }
    }

    public T remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("La cola esta vacia");

        }
        T value = first.data;
        first = first.next;
        tamanio--;

        if (first == null) {
            last = null;

        }
        return value;

    }

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("La cola esta vacia");

        }
        return first.data;

    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return tamanio;
    }

}
