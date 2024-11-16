/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner entrada = new Scanner(System.in);
        String nombre;
        int tipoEmpleado;
        double sueldo ;
        double incrementosueldo= 0;
        double sueldodescuento;
        System.out.println("Ingrese el nombre del empleado");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el sueldo del empleado");
        sueldo = entrada.nextDouble();
        System.out.println("Ingrese que tipo de empleado es");
        tipoEmpleado = entrada.nextInt();
        if (tipoEmpleado == 1){
            incrementosueldo = sueldo * 0.5;
        }else{
            if (tipoEmpleado == 2 ){
                incrementosueldo = sueldo * 0.7;
            }else{
                if (tipoEmpleado == 3 ) {
                    incrementosueldo = sueldo *0.9;
                }else{
                    if(tipoEmpleado == 4){
                        incrementosueldo = sueldo *0.12;
                    }else{
                        if (tipoEmpleado >=5)
                            incrementosueldo = sueldo *0.12;
                    }
                }
            }
        }
        sueldodescuento = sueldo + incrementosueldo;
        System.out.printf("Nombres: %s\nSueldo inicial: $%.2f\n"
                + "Incremento de sueldo: $%.2f\n"
                + "Sueldo total: $%.2f\n",
                nombre, 
                sueldo, 
                incrementosueldo, 
                sueldodescuento);

        

    }
    
}

    
