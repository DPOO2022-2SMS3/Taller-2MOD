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

    public ArrayList<Ingrediente> getIngredientes()
    {
		return null;
    }

    public void cargarInformacionRestaurante() 
    {
    	String archivoMenu = "menu.txt";
    }

    private void cargarIngredientes(File archivoIngredientes)
    {
    	
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
    	List<String> combo = new ArrayList<>();
    	Map<String, String> combos = new HashMap<String, String>();
    	BufferedReader br = new BufferedReader(new FileReader(archivoCombos));
    	String linea = br.readLine();
    	linea = br.readLine();
    	while (linea != null)
    	{	
    		combo.add(linea);
    		String[] partes = linea.split(";");
    		String nombreCombo = partes[0];
    		combos.put(nombreCombo, linea);
    	}
    	
    	
    }

	

}
