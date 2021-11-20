package Modelo;

import java.util.ArrayList;

public class Producto {
    private int codigo;
    private String descripcion;
    private double precio;
    private ArrayList<Stock> stocks = new ArrayList<>();

    public Producto() {
    }

    public Producto(int codigo, String descripcion, double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<Stock> getStocks() {
        return stocks;
    }

    public void setStocks(ArrayList<Stock> stocks) {
        this.stocks = stocks;
    }

    public void agregarStock(Stock s){
        stocks.add(s);
    }

    public void restarStockProducto(Color color, Talle talle, int cantidad) {
        for(Stock s:stocks){
            if (color==s.getColor() && talle==s.getTalle()){
                s.setCantidad(s.getCantidad() - cantidad);
            }
        }
    }

    public ArrayList<Talle> buscarTallesDisponibles (Color color){
        ArrayList<Talle> listaTalles = new ArrayList<>();

        for (Stock s : stocks){
            if(color == s.getColor()){
                Talle talle = s.getTalle();
                listaTalles.add(talle);
            }
        }

        return listaTalles;
    }

}
