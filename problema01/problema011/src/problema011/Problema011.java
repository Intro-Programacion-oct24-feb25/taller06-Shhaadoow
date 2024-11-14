/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema011;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Problema011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int op;
        double valor1;
        double valor2;
        double resultado = 0;
        // 6.  Escribir "Ingrese el primer valor la operación"
        System.out.println("Ingrese el primer valor la operación");
        // 7.  Leer valor1
        valor1 = entrada.nextDouble();
        System.out.println("Ingrese el segundo valor la operación");
        valor2 = entrada.nextDouble();

        System.out.println("Selecciones la operación que desea realizar\n"
                + "Ingrese 1 para sumar\n"
                + "Ingrese 2 para restar\n"
                + "Ingrese 3 para multiplicar\nIngrese 4 para dividir\n"
                + "Ingrese 5 para potencia\nIngrese 6 para módulo\n");
        op = entrada.nextInt(); // 4

        if (valor1 > valor2 ) {
            switch (op) {

                case 1:
                    resultado = valor1 + valor2;
                    break;

                case 2:
                    resultado = valor1 - valor2;
                    break;

                case 3:
                    resultado = valor1 * valor2;
                    break;
                
                case 4:
                    resultado = valor1 / valor2;
                    break;
                
                case 5:
                    resultado = Math.pow(valor1, valor2);
                    break;
                
                case 6:
                    resultado = (valor1 % valor2);
                    break;
                default:
                    System.out.println("Operación incorrecta");
                    break;

            }

        } else {
            System.out.println("Valor fuera de rango");

        }

        // Escribir "El resultado de la operación es :" + resultado
        System.out.printf("El resultado de la operación es : %s\n", resultado);
    }
}
