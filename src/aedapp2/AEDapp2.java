package aedapp2;

import facturas.Factura;
import personas.Empleado;

public class AEDapp2 {

    public static void main(String[] args) {
        
        Factura f1 = new Factura("0001230000", "en tu culo", 45, 2.45);
        Empleado em1 = new Empleado();
        
        System.out.println(f1.toString());
        
    }

}
