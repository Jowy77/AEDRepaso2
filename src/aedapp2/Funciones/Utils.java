
package aedapp2.Funciones;

import facturas.Factura;
import java.util.Scanner;

public class Utils {
    
    public Factura creaFactura(){
        Scanner scanner = new Scanner(System.in);
        
        
        String descripcionProducto;
        String codigo3digitos;
        double precioProducto;
        
        System.out.println("Introduce un codigo de 3 digitos: ");
        codigo3digitos = scanner.nextLine();
        
        System.out.println("Introduce la descripcion del objeto");
        descripcionProducto = scanner.nextLine();
        
        System.out.println("Introduce el precio del producto");
        precioProducto = scanner.nextDouble();
        
        return null;
    }
    
}
