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

public class Restaurante 
{
	private Pedido pedido;
	
	public Restaurante() 
	{
	}
	
	public void iniciarPedido(String nombreCliente, String direccionCliente) 
    {

    }

    public void agregarProducto(Producto nuevoItem) {
		pedido.agregarProducto(nuevoItem);
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

    public ArrayList<Ingrediente> getIngredientes()
    {
		return null;
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

    private void cargarIngredientes(String archivoIngredientes)
    {
    	BufferedReader br = new BufferedReader(new FileReader(archivoIngredientes));
    	String linea = br.readLine();
    	
    	for (linea != null)
    	{
    		
    	}
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
