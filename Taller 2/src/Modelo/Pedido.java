package Modelo;

import java.io.File;

public class Pedido {

    private int numeroPedidos;

    private int idPedido;

    private String nombreCliente;

    private String direccionCliente;

    public Pedido(String nombreCliente, String direccionCliente) 
    {
    	this.nombreCliente = nombreCliente;
		this.direccionCliente = direccionCliente;
		this.idPedido = 0;
		this.numeroPedidos = 0; 

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

	public Pedido Pedido(String nombreCliente2, String direccionCliente2) {
		// TODO Auto-generated method stub
		return null;
	}

}

