package Modelo;

import java.util.ArrayList;

public class Venta {

    private ArrayList<Producto> productos = new ArrayList<>();
    private Cliente cliente;
    private double totalVenta;
    private double vuelto;
    private Pago pago;
    private ArrayList<LineaVenta> lineasVenta = new ArrayList<>();

    public Venta() {
    }

    public Venta(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getTotalVenta() {
        return totalVenta;
    }

    public double getVuelto() {
        return vuelto;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public ArrayList<LineaVenta> getLineasVenta() {
        return lineasVenta;
    }

    public void setLineasVenta(ArrayList<LineaVenta> lineasVenta) {
        this.lineasVenta = lineasVenta;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }


    public int cantidadlDeProductos() {
        return productos.size();
    }

    public double calcularTotal(){
        totalVenta = 0;
        for (Producto p : productos) {
            totalVenta = totalVenta + p.getPrecio();
        }
        return totalVenta;
    }

    public double calcularVuelto() {
        vuelto = pago.getImporte() - calcularTotal();
        return vuelto;
    }

    public void crearLineaVenta(Producto producto, Color color, Talle talle, int cantidad){
        lineasVenta.add(new LineaVenta(producto, color, talle, cantidad));
    }



}
