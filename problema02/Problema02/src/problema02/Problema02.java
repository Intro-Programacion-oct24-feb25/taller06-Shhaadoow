/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Usuario iTC
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String propietario;
        double valorVehiculo;
        int tipo;
        String ntipo = "";
        double operacion = 0;
        
        System.out.print("Ingrese el nombre del propietario del vehiculo:");
        propietario = entrada.nextLine ();
        System.out.print("Ingrese el valor del vehículo:");
        valorVehiculo = entrada.nextDouble ();
        System.out.print("Ingrese el tipo de vehículo:");
        tipo = entrada.nextInt ();
        
        switch (tipo) {
            case 1:
                ntipo = "Su vehículo es uno liviano particular";
                operacion = (valorVehiculo*1)/100 + 2;
                break;
                
            case 2:
                ntipo = "Su vehículo es uno liviano particular";
                operacion = (valorVehiculo*2)/100 + 2.5;
                break;
                
            case 3:
                ntipo = "Su vehículo es uno liviano particular";
                operacion = (valorVehiculo*4)/100 + 1.5;
                break;
                
            case 4:
                ntipo = "Su vehículo es uno liviano particular";
                operacion = (valorVehiculo*5)/100 + 2.2;
                break;
        }
        
        System.out.printf("Peaje "+" buena vía\n\tPropietario:%s\n"
                + "Tipo:%s\n\tValor: $%.1f\n\tPeaje: $%.2fs\n\t", propietario, 
                ntipo, valorVehiculo, operacion);        
    }
    
}
