package Modelo;

import java.io.File;

public class Pedido {

    private int numeroPedidos;

    private int idPedido;

    private String nombreCliente;

    private String direccionCliente;

    public Pedido(String nombreCliente, String direccionCliente) 
    {

    }

    public int getIdPedido() 
    {
        return idPedido;
    }

    public void agregarProducto(Producto nuevoItem)
    {

    }

    private int getPrecioNetoPedido() 
    {
        int precioNeto=0;

        return precioNeto;
    }
    private int getPrecioTotalPedido() 
    {
        int precioTotal=0;

        return precioTotal;
    }
    private int getPrecioIVAPedido() 
    {
        int precioIVA=0;

        return precioIVA;
    }
    private String generarTextoFactura() 
    {
        String TextoFactura = null;

        return TextoFactura;
    }

    public File guardarFactura(File archivo) 
    {
        return archivo;

        
    }

}

