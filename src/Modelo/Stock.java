package Modelo;

public class Stock {
    private Talle talle;
    private Color color;
    private int cantidad;

    public Stock() {
    }

    public Stock(Talle talle, Color color, int cantidad) {
        this.talle = talle;
        this.color = color;
        this.cantidad = cantidad;
    }


    public Talle getTalle() {
        return talle;
    }

    public void setTalle(Talle talle) {
        this.talle = talle;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}