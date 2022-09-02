package Modelo;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Modelo.Ingrediente;
import Modelo.Pedido;

public class Restaurante 
{
	
	private Ingrediente ingredientes;
	private Pedido pedido;
	
	public Restaurante() 
	{
	}
	
	
	
	public void iniciarPedido(String nombreCliente, String direccionCliente) 
    {
		Pedido pedidoAct = new Pedido(nombreCliente, direccionCliente);
		
    }

    public void cerrarYGuardarPedido() 
    {

    }

    public Pedido getPedidoEnCurso() 
    {
        return null;
    }

    public ArrayList<Producto> getMenuBase()
    {
		return null;

    }

    /**
     * Busca un ingrediente en la lista de ingredientes por el nombre
     * 
     * Si no encuentra el ingrediente retorna null
     * 
     * @param nombreIngrediente
     * @param ingredientes
     * @param precio 
     */
    

    public static Ingrediente getIngredientes(ArrayList<Ingrediente> ingredientes, String nombreIngrediente)
    {
    	Ingrediente elIngrediente = null;
    	
    	for (int i = ingredientes.size(); i>= 0 && elIngrediente == null; i--)
    	{
	    	 Ingrediente unIngrediente = ingredientes.get(i);
	    	 if (unIngrediente.getNombre() == nombreIngrediente)
	    	 {
	    		 elIngrediente = unIngrediente;
    	     }
    	 
    	}
    	 return elIngrediente;
	}
    
    public static ProductoMenu getProductos(ArrayList<ProductoMenu> productos, String nombreProducto)
    {
    	ProductoMenu elProducto = null;
    	
    	for (int i = productos.size(); i>= 0 && elProducto == null; i--)
    	{
	    	 ProductoMenu unProducto = productos.get(i);
	    	 if (unProducto.getNombre() == nombreProducto)
	    	 {
	    		 elProducto = unProducto;
    	     }
    	 
    	}
    	 return elProducto;
	}
    
    public static Combo getCombos(ArrayList<Combo> combos, String nombreCombo)
    {
    	Combo elCombo = null;
    	
    	for (int i = combos.size(); i>= 0 && elCombo == null; i--)
    	{
	    	 Combo unCombo = combos.get(i);
	    	 if (unCombo.getNombre() == nombreCombo)
	    	 {
	    		 elCombo = unCombo;
    	     }
    	 
    	}
    	 return elCombo;
	}



	public void cargarInformacionRestaurante() throws FileNotFoundException, IOException 
    {
    	String archivoMenu = "menu.txt";
    	String archivoIngredientes = "ingredientes.txt";
    	String archivoCombos = "combos.txt";
    	
		ArrayList<Ingrediente> ingredientesList = cargarIngredientes(archivoIngredientes);    	
    	ArrayList<ProductoMenu> productosList = cargarMenu(archivoMenu);
		ArrayList<Combo> combosList = cargarCombos(archivoCombos, productosList);
		
    }

    private ArrayList<Ingrediente> cargarIngredientes(String archivoIngredientes) throws IOException
    {
    	BufferedReader br = new BufferedReader(new FileReader(archivoIngredientes));
    	String linea = br.readLine();
    	ArrayList<Ingrediente> ingredientes = new ArrayList<>();
    	int id = 200;
    	
    	while (linea != null)
    	{
    		String[] partes = linea.split(";");
    		String nombreIngrediente = partes[0]; 
    		int precio = Integer.parseInt(partes[1]);
    		
    		Ingrediente ElIngrediente = getIngredientes(ingredientes, nombreIngrediente);
    		
    		if (ElIngrediente == null)
    		{
    			id = id + 1;
    			ElIngrediente = new Ingrediente(nombreIngrediente, precio, id);
    			ingredientes.add(ElIngrediente);
    		}
    		
    		linea = br.readLine();
    	}
    	
    	br.close();
		return ingredientes;
    	
    }
    

    private ArrayList<ProductoMenu> cargarMenu(String archivoMenu) throws FileNotFoundException, IOException
    {
    	BufferedReader br = new BufferedReader(new FileReader(archivoMenu));
    	String linea = br.readLine();
    	ArrayList<ProductoMenu> productos = new ArrayList<>();
    	int id = 100;
    	
    	while (linea != null)
    	{
    		String[] partes = linea.split(";");
    		String nombreProducto = partes[0]; 
    		int precio = Integer.parseInt(partes[1]);
    		
    		ProductoMenu ElProducto = getProductos(productos, nombreProducto);
    		
    		if (ElProducto == null)
    		{
    			id = id + 1;
    			ElProducto = new ProductoMenu(nombreProducto, precio, id);
    			productos.add(ElProducto);
    		}
    		
    		linea = br.readLine();
    	}
    	br.close();
		return productos;
    }

    private ArrayList<Combo> cargarCombos(String archivoCombos, ArrayList<ProductoMenu> productos) throws FileNotFoundException, IOException
    {
    	BufferedReader br = new BufferedReader(new FileReader(archivoCombos));
    	String linea = br.readLine();
    	ArrayList<Combo> combos = new ArrayList<>();
    	int id = 300;
    	
    	while (linea != null)
    	{
    		String[] partes = linea.split(";");
    		String nombreCombo = partes[0]; 
    		String descuento1 = partes[1];
    		descuento1 = descuento1.replace("%", "");
    		double descuento = Double.parseDouble(descuento1);
    		
    		Combo ElCombo = getCombos(combos, nombreCombo);
    		
    		if (ElCombo == null)
    		{
    			ArrayList<ProductoMenu> itemsCombo = new ArrayList<>();
        		String nombreHamburguesa = partes[2];
        		String nombrePapas = partes[3];
        		String nombreBebida = partes[4];
        		ProductoMenu hamburguesa = null;
        		ProductoMenu papas = null;
        		ProductoMenu bebida = null;
        		
        		
        		for (int i = productos.size() - 1; i >= 0 && (hamburguesa == null || papas == null || bebida == null); i--)
        		{
        			ProductoMenu unProducto = productos.get(i);
        			if (unProducto.getNombre().equals(nombreHamburguesa))
        			{
        				hamburguesa = unProducto;
        			}
        			else if (unProducto.getNombre().equals(nombrePapas))
        	    	{
        	    		papas = unProducto;
        	   		}
        			else if (unProducto.getNombre().equals(nombreBebida))
        	    	{
        	    		bebida = unProducto;
        	   		}
        		} 
        		
        		itemsCombo.add(hamburguesa);
        		itemsCombo.add(papas);
        		itemsCombo.add(bebida);
        		
    			
    			id = id + 1;
    			ElCombo = new Combo(nombreCombo, descuento, id, itemsCombo);
    			combos.add(ElCombo);
    		}
    		
    		linea = br.readLine();
    	}
    	br.close();
		return combos;
    }
	

}
