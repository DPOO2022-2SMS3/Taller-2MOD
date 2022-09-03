package Modelo;

public class ProductoMenu implements Producto
{
	private String nombre;
	private int precioBase;
	private int id;
	
	public ProductoMenu(String nombre, int precioBase, int id) 
	{
		this.nombre = nombre;
		this.precioBase = precioBase;
		this.setId(id);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precioBase;
	}
	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}
	
	
	public String generarTextoFactura()
	{
		return "";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

}
