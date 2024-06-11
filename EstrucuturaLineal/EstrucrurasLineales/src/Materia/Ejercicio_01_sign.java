package Materia;

import java.util.Stack;

public class Ejercicio_01_sign {

    public static boolean validarSignos(String cadena) {
        Stack<Character> pila = new Stack<>();

        for (char c : cadena.toCharArray()) {
            // Si encontramos un carácter de apertura, lo agregamos a la pila
            if (c == '(' || c == '{' || c == '[') {
                pila.push(c);
            }
            // Si encontramos un carácter de cierre, verificamos si la pila está vacía o si
            // el último carácter en la pila no coincide
            else if (c == ')' || c == '}' || c == ']') {
                if (pila.isEmpty()) {
                    return false; // Si la pila está vacía, significa que no hay un carácter de apertura
                                  // correspondiente
                }
                char top = pila.pop(); // Obtenemos el último carácter de la pila
                // Comprobamos si el último carácter en la pila coincide con el carácter de
                // apertura correspondiente
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        // Verificamos si la pila está vacía al final, lo que indica que todos los
        // corchetes se cerraron correctamente en el orden adecuado
        return pila.isEmpty();
    }

    // Método principal (main) donde probamos la función
    public static void main(String[] args) {
        // Ejemplos
        String ejemplo1 = "([]){}";
        System.out.println(validarSignos(ejemplo1)); // Output: true

        String ejemplo2 = "({)}";
        System.out.println(validarSignos(ejemplo2)); // Output: false
    }
}