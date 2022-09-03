package Modelo;

import java.io.File;
import java.util.Random;

public class Pedido {
	
	// Atributos
    private int numeroPedidos;
    private int idPedido;
    private String nombreCliente;
    private String direccionCliente;
    
    // Constructor
    public Pedido(String nombreCliente, String direccionCliente, int contadorPedidos) 
    {
    	Random rand = new Random();
    	this.nombreCliente = nombreCliente;
		this.direccionCliente = direccionCliente;
		this.idPedido = rand.nextInt(99999);
		this.numeroPedidos = contadorPedidos;
    }
    public void agregarProducto(Producto nuevoItem)
    {
    	

    }
    
    // Consultores y Modificadores

    public int getIdPedido() 
    {
        return idPedido;
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

