import Modelo.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;


public class VentaTest {

    @Test
    public void agregarProductoAUnaVentaSinProductos(){
        //Configuracion o Datos
        Venta venta = new Venta();
        Producto producto = new Producto();

        //Ejecucion
        venta.agregarProducto(producto);

        //Comprobacion
        Assert.assertEquals(1,venta.cantidadlDeProductos());

        //Limpieza


    }
    @Test
    public void agregarClienteVenta(){
        Cliente cliente = new Cliente("Consumidor Final");
        Venta venta = new Venta(cliente);
        Assert.assertEquals(cliente, venta.getCliente());
    }

    @Test
    public void calcularTotalDeUnaVenta(){

        //Configuracion o Datos
        Venta venta = new Venta();
        Producto p1 = new Producto(111,"Remera",2000);
        Producto p2 = new Producto(222,"Pantalon",3000);
        venta.agregarProducto(p1);
        venta.agregarProducto(p2);
        double totalEsperado=2000+3000;

        //Ejecucion
        venta.calcularTotal();

        //Comprobacion
        Assert.assertEquals(totalEsperado,venta.getTotalVenta(),0.1);
    }

    @Test
    public void calcularVueltoDeUnaVenta(){
        //Configuracion o Datos
        Venta venta = new Venta();
        Producto p1 = new Producto(111,"Remera",2000);
        Producto p2 = new Producto(222,"Pantalon",3000);
        venta.agregarProducto(p1);
        venta.agregarProducto(p2);
        Pago pago =new Pago(10000);
        venta.setPago(pago);
        double vueltoEsperado= 10000-5000;

        //Ejecucion
        venta.calcularVuelto();

        //Comprobacion
        Assert.assertEquals(vueltoEsperado,venta.getVuelto(),0.1);

    }

    @Test
    public void agregarStockProducto() {
        //Configuracion o Datos
        Producto p1 = new Producto(111,"Remera",2000);
        Stock s1 = new Stock(Talle.S,Color.Rojo,10);

        //Ejecucion
        p1.agregarStock(s1);

        //Comprobacion
        Assert.assertEquals(s1,p1.getStocks().get(0));

    }

    @Test
    public void restarStockDeUnProducto(){
        //Comprobacion o Datos
        Producto p1 = new Producto(111,"Remera",2000);
        Stock s1 = new Stock(Talle.S,Color.Rojo,10);
        p1.agregarStock(s1);

        //Ejecucion
        p1.restarStockProducto(Color.Rojo,Talle.S,7);

        //Comprobacion
        Assert.assertEquals(3,p1.getStocks().get(0).getCantidad());

    }

    @Test
    public void mostrarTallesDeUnColorDeProducto(){
        //Comprobacion o Datos
        Producto p1 = new Producto(111,"Remera",2000);
        Stock s1 = new Stock(Talle.S,Color.Rojo,10);
        Stock s2 = new Stock(Talle.M,Color.Rojo,10);
        Stock s3 = new Stock(Talle.L,Color.Negro,10);
        p1.agregarStock(s1);
        p1.agregarStock(s2);
        p1.agregarStock(s3);
        ArrayList<Talle> tallesEsperados = new ArrayList(Arrays.asList(Talle.S,Talle.M));
        ArrayList<Talle> tallesObtenidos = new ArrayList<>();

        //Ejecucion
        tallesObtenidos = p1.buscarTallesDisponibles(Color.Rojo);

        //Comprobacion
        Assert.assertEquals(tallesEsperados, tallesObtenidos);

    }
}
