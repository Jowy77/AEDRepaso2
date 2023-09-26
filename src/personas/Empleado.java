package personas;

import interfaces.Pagable;

public class Empleado implements Pagable {

    private String nombre;
    private String apellido;
    private String seguridadSocial; // formato XXX-XX-XXXX con X digitos de 0-9
    
    public Empleado(){
        
    }

    public Empleado(String nombre, String apellido, String seguridadSocial) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.seguridadSocial = seguridadSocial;
    }

    @Override
    public String toString() {
        return "[i] Empleado de servicios: " + nombre + " " + apellido
                + "\n --> Numero de la seguridad social: " + seguridadSocial;
    }

    @Override
    public double ObtenerImportePagable() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
