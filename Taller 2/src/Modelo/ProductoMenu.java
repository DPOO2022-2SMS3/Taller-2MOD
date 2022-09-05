package Modelo;

public class ProductoMenu implements Producto
{
	// Atributos
	
	private String nombre;
	private int precioBase;
	private int id;
	private int calorias;
	
	// Constructor
	
	public ProductoMenu(String nombre, int precioBase, int id, int calorias) 
	{
		this.nombre = nombre;
		this.precioBase = precioBase;
		this.setId(id);
		this.calorias = calorias;
	}
	
	// Consultores y Modificadores
	
	public String getNombre() {
		return nombre;
	}
	public int getPrecio() {
		return precioBase;
	}
	
	public int getId() {
		return id;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String generarTextoFactura()
	{
		return ("\t" + this.getNombre() + "\t\t\t" + this.getPrecio() + "\t" + this.getCalorias() + "cal");
	}

	public int getCalorias() {
		return calorias;
	}

	public void setCalorias(int calorias) {
		this.calorias = calorias;
	}
	
	
}
