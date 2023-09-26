package personas;

public class EmpleadoAsalariado extends Empleado {

    private double salarioSemanal;

    public EmpleadoAsalariado(double salarioSemanal, String nombre, String apellido, String seguridadSocial) {
        super(nombre, apellido, seguridadSocial);
        this.salarioSemanal = salarioSemanal;
    }

    @Override
    public double ObtenerImportePagable() {
        return salarioSemanal;
    }
    
    

}
