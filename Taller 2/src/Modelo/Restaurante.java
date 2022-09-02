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

public class Restaurante 
{
	
	private Ingrediente ingredientes;
	
	public Restaurante() 
	{
	}
	
	
	
	public void iniciarPedido(String nombreCliente, String direccionCliente) 
    {

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



	public void cargarInformacionRestaurante() 
    {
    	String archivoMenu = "menu.txt";
    	String archivoIngredientes = "ingredientes.txt";
    	String archivoCombos = "combos.txt";
    	
    	try {
			cargarMenu(archivoMenu);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	cargarIngredientes(archivoIngredientes);
    	try {
			cargarCombos(archivoCombos);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    			
    }

    private void cargarIngredientes(String archivoIngredientes) throws IOException
    {
    	BufferedReader br = new BufferedReader(new FileReader(archivoIngredientes));
    	String linea = br.readLine();
    	ArrayList<Ingrediente> ingredientes = new ArrayList<>();
    	
    	while (linea != null)
    	{
    		String[] partes = linea.split(";");
    		String nombreIngrediente = partes[0]; 
    		int precio = Integer.parseInt(partes[1]);
    		
    		Ingrediente ElIngrediente = getIngredientes(ingredientes, nombreIngrediente);
    		
    		if (ElIngrediente == null)
    		{
    			ElIngrediente = new Ingrediente(nombreIngrediente, precio);
    			ingredientes.add(ElIngrediente);
    		}
    		
    		linea = br.readLine();
    	}
    	
    	br.close();
    	
    }

    private void cargarMenu(String archivoMenu) throws FileNotFoundException, IOException
    {
    	
    	Map<String, Integer> menu = new HashMap<String, Integer>();
    	BufferedReader br = new BufferedReader(new FileReader(archivoMenu));
    	
    	String linea = br.readLine();
    	linea = br.readLine();
    	
    	while (linea != null)
    	{
    		String[] partes = linea.split(";");
    		String nombreMenu = partes[0];
    		int precioMenu = Integer.parseInt(partes[1]);
    		menu.put(nombreMenu, precioMenu);
    	}
    	
    	br.close();
    }

    private void cargarCombos(String archivoCombos) throws FileNotFoundException, IOException
    {
    	List<String> comidaCombo = new ArrayList<>();
    	Map<String, List<String>> combos = new HashMap<String, List<String>>();
    	BufferedReader br = new BufferedReader(new FileReader(archivoCombos));
    	String linea = br.readLine();
    	linea = br.readLine();
    	while (linea != null)
    	{	
    		String[] partes = linea.split(";");
    		comidaCombo;
    		String nombreCombo = partes[0];
    		combos.put(nombreCombo, linea);
    	}
    	
    	
    }

	

}
