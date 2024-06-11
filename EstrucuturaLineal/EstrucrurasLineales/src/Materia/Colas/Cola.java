package Materia.Colas;

import java.util.NoSuchElementException;

import Materia.Models.Node;

public class Cola {
    private Node first;
    private Node last;
    private int tamanio;

    public Cola() {
        this.first = null;
        this.last = null;
        this.tamanio = 0;
    }

    // Metodo para agregar un Node a la cola

    public void addNode(int value) {
        Node nuevoNode = new Node(value);
        if (isEmpty()) {
            first = nuevoNode;
            last = nuevoNode;
            tamanio++;

        } else {
            last.next = nuevoNode;
            last = nuevoNode;
            tamanio++;

        }

    }

    // metodo eliminar
    public int remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("La cola esta vacia");
        }
        int value = first.value;
        first = first.next;
        tamanio--;
        if (first == null) {
            last = null;

        }
        return value;

    }
    // metodo para ver

    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("La cola esta vacia");
        }
        return first.value;

    }
    // metodo para verfificar si hay datos

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        if (isEmpty()) {
            throw new NoSuchElementException("La cola esta vacia");
        }
        return tamanio;

    }

}
