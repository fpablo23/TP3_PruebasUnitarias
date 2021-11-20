package Modelo;

public class LineaVenta {
    private Producto producto;
    private Color color;
    private Talle talle;
    private int cantidad;

    public LineaVenta() {
    }

    public LineaVenta(Producto producto, Color color, Talle talle, int cantidad) {
        this.producto = producto;
        this.color = color;
        this.talle = talle;
        this.cantidad = cantidad;
    }


    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Talle getTalle() {
        return talle;
    }

    public void setTalle(Talle talle) {
        this.talle = talle;
    }


    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}

