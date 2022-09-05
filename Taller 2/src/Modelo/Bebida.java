package Modelo;

public class Bebida 
{

	//****************************
	//Atributos
		
	private String nombre;
	private int precio;
	private int id;
	private int calorias;
		
	//****************************
	//Constructor
	
	public Bebida(String nombre, int precio, int id, int calorias) 
	{
		this.nombre = nombre;
		this.precio = precio;
		this.id = id;
		this.calorias =  calorias;
	}

	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}
	
		
	//****************************
	//
}
