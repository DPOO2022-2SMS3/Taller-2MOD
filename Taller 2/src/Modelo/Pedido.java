package Modelo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Pedido {
	
	// Atributos
    private int numeroPedidos;
    private int idPedido;
    private String nombreCliente;
    private String direccionCliente;
    private ArrayList<Producto> productos;
    
    // Constructor
    public Pedido(String nombreCliente, String direccionCliente, int contadorPedidos) 
    {
    	Random rand = new Random();
    	this.nombreCliente = nombreCliente;
		this.direccionCliente = direccionCliente;
		this.idPedido = rand.nextInt(99999);
		this.numeroPedidos = contadorPedidos;
		this.productos = new ArrayList<>();
    }
    public void agregarProducto(Producto nuevoItem)
    {
    	
    	productos.add(nuevoItem);
    }
    
    // Consultores y Modificadores

    public int getIdPedido() 
    {
        return idPedido;
    }

    private int getPrecioNetoPedido() 
    {
    	int neto = 0;
    	for (int i = this.productos.size() - 1; i >= 0; i--)
		{
			Producto unProducto = productos.get(i);
			neto = neto + unProducto.getPrecio();
		}
    	return neto;
    }
    
    private int getPrecioIVAPedido() 
    {
        int neto = this.getPrecioNetoPedido();
        int precioIVA = neto * 19 / 100;

        return precioIVA;
    }
    
    private int getPrecioTotalPedido() 
    {
        int precioTotal = this.getPrecioNetoPedido() +  this.getPrecioIVAPedido();

        return precioTotal;
    }
    
    private int getCaloriasTotales() 
    {
    	int neto = 0;
    	for (int i = this.productos.size() - 1; i >= 0; i--)
		{
			Producto unProducto = productos.get(i);
			neto = neto + unProducto.getCalorias();
		}
    	return neto;
    }
    
    protected String generarTextoFactura() 
    {
    	String textoProductos = "";
    	for (int i = this.productos.size() - 1; i >= 0; i--)
		{
			Producto unProducto = productos.get(i);
			textoProductos = textoProductos + unProducto.generarTextoFactura() + "\n";
		}
    	
        String TextoFactura = "HAMBURGUESAS MACASE\n\nCliente: " + this.nombreCliente + 
        					  "\nDirección cliente: " +  this.direccionCliente +
        					  "\nID Pedido: " + this.idPedido +
        					  "\nNumero Pedido: " + this.numeroPedidos +
        					  "\n\n PRODUCTOS\n" + textoProductos +
        					  "\n\nCalorias Totales: " + this.getCaloriasTotales() + 
        					  "\n\nValor Neto: " + this.getPrecioNetoPedido() + 
        					  "\nValor IVA (19%): " + this.getPrecioIVAPedido() + 
        					  "\nTOTAL: " + this.getPrecioTotalPedido();
        
        

        return TextoFactura;
    }
    
    public void guardarFactura() throws IOException
    {
        String ruta = "Taller 2/Data/Facturas/" + this.idPedido + ".txt";
        String contenido = this.generarTextoFactura();
        File file = new File(ruta);
            // Si el archivo no existe es creado
        if (!file.exists()) 
        {
           file.createNewFile();
        }
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(contenido);
        bw.close();
    }

}

