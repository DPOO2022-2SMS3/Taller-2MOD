package Modelo;

public class ProductoMenu implements Producto
{
	// Atributos
	
	private String nombre;
	private int precioBase;
	private int id;
	
	// Constructor
	
	public ProductoMenu(String nombre, int precioBase, int id) 
	{
		this.nombre = nombre;
		this.precioBase = precioBase;
		this.setId(id);
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
		return (this.getNombre() + "\n\t" + this.getPrecio());
	}
}
