/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author adm
 */
public class PruebaExcepcion {

    public static void main(String args[]) throws SingleDigitException {

        Programita pro = new Programita();
        try {
            pro.CapturaDatos();
            if (pro.getNumer() < 10 || pro.getDenomi() < 10) {
                throw new SingleDigitException("Los números no pueden ser menores a 10");
            }
            pro.primeraOperación();
        } catch (NumberFormatException e) {
            System.out.println("El valor no es numerico " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("No es posible dividir por 0 " + e.getMessage());
        }
    }

    public static void desborde() {

        int v[] = new int[3];
        try {
            for (int i = 0; i < 5; i++) {

                v[i] = i;

            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Te has salido del límite del vector. " + e.getMessage());
        }
    }
    //excepción tratada

    public static void formatoNumero() {

        int numero;

        String cadena = " 1";

        try {

            numero = Integer.parseInt(cadena);

        } catch (NumberFormatException ex) {

            System.out.println("No es un número, es una cadena de texto." + ex.getMessage());

        }

    }

    public static void aritmetico() {

        int numero = 5, resultado;
        try {
            resultado = numero / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error al dividir por cero. " + e.getMessage());
        }
    }
}
