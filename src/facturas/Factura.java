package facturas;

import interfaces.Pagable;

public class Factura implements Pagable {

    private String codigo;
    private String descripcion;
    private int cantidad;
    private double precioPorProducto;

    public Factura(String codigo, String descripcion, int cantidad, double precioPorProducto) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioPorProducto = precioPorProducto;
    }

    @Override
    public double ObtenerImportePagable() {
        return this.cantidad * this.precioPorProducto;
    }

    @Override
    public String toString() {
        return "-->Cantidad:" + cantidad + "\n-->Precio por producto: " + precioPorProducto
                + "\n-->Importe: " + ObtenerImportePagable();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioPorProducto() {
        return precioPorProducto;
    }

    public void setPrecioPorProducto(double precioPorProducto) {
        this.precioPorProducto = precioPorProducto;
    }
}
