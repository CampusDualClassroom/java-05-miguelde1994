package com.campusdual.classroom;

public class Exercise05 {
    public static void main(String[] args) {
        //Desde el método main() se llamará al resto de métodos, pasándoles los argumentos necesarios para que realicen las comprobaciones pertinentes en cada caso.
        checkLessOrGreaterEqual(1,2);
        checkMultiply(8,2);
        checkPositiveNegative(5);
    }

    //TODO ↓
    // Si el valor es menor, tiene que devolver el siguiente mensaje: X es menor que Y
    // Si el valor es mayor o igual, tiene que devolver el siguiente mensaje: X es mayor o igual que Y
    public static void checkLessOrGreaterEqual(int n1, int n2) {
        //El método checkLessOrGreaterEqual() recibe dos números enteros por parámetro.
        // El método comprobará cuál de los dos es mayor, y según cada caso mostrará un mensaje por pantalla. solicite en el parámetro.

        if (n1 < n2) {
            System.out.println("X es menor que Y");
        }else{
            System.out.println("X es mayor o igual que Y");
        }
    }

    //TODO ↓
    // Si es múltiplo, tiene que devolver el siguiente mensaje: X es múltiplo de Y
    // Si no es múltiplo, tiene que devolver el siguiente mensaje: X no es múltiplo de Y
    public static void checkMultiply(int n1, int n2) {
        //El método checkMultiply() recibe dos números enteros por parámetro.
        // El método comprobará si el primero es múltiplo del segundo, y dependiendo de la respuesta, mostrará un mensaje por pantalla.
        if (n1%n2==0) {
            System.out.println("X es multiplo de Y");
        }else{
            System.out.println("X no es multiplo de Y");
        }
    }

    //TODO ↓
    // Si es negativo, tiene que devolver el siguiente mensaje: X es negativo.
    // Si es positivo o cero, tiene que devolver el siguiente mensaje: X es positivo.
    public static void checkPositiveNegative(int num) {
        //El método checkPositiveNegative() recibe un número entero por parámetro.
        // El método comprobará si el número recibido es negativo o no, y mostrará por pantalla un mensaje concreto según el caso.
        if (num<0) {
            System.out.println("X es negativo.");
        }else{
            System.out.println("X es positivo.");
        }

    }
}
