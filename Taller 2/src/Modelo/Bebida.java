package Modelo;

public class Bebida extends ProductoMenu
{

	//****************************
	//Atributos
		
	private String nombre;
	private int precio;
	private int id;
	private int calorias;
		
	//****************************
	//Constructor
	
	public Bebida(String nombre, int precioBase, int id, int calorias) 
	{
		super(nombre, precioBase, id, calorias);
	}

	public String getNombre() 
	{
		return nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public int getId() {
		return id;
	}

	public int getCalorias() {
		return calorias;
	}
	
	public String generarTextoFactura()
	{
		return ("\t" + this.getNombre() + "\t\t\t" + this.getPrecio() + "\t" + this.getCalorias() + "cal\n");
	}
	
		
	//****************************
	//
}
