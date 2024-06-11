package Materia;

import java.util.Stack;

public class Ejercicio_02_sorting {

    public static Stack<Integer> ordenarStack(Stack<Integer> stack) {
        Stack<Integer> pilas1 = new Stack<>(); // Stack temporal para almacenar elementos ordenados

        while (!stack.isEmpty()) {
            int temp = stack.pop(); // Sacamos el elemento superior del stack original

            // Movemos los elementos mayores que temp de pilas1 a stack
            while (!pilas1.isEmpty() && pilas1.peek() > temp) {
                stack.push(pilas1.pop());
            }

            // Ponemos temp en pilas1
            pilas1.push(temp);
        }

        return pilas1; // El stack ordenado
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        // Llamamos a la función para ordenar el stack
        Stack<Integer> stackOrdenado = ordenarStack(stack);

        // Imprimimos el stack ordenado
        System.out.println("Pila Ordenada:");
        while (!stackOrdenado.isEmpty()) {
            System.out.println(stackOrdenado.pop());
        }
    }
}