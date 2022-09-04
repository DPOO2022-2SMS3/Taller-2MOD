package Modelo;

import java.util.ArrayList;

public class Combo implements Producto
{
	private int descuento;
	private String nombreCombo;
	private int id;
	private ArrayList<ProductoMenu> productos;
	
	public Combo(String nombre, int descuento, int id, ArrayList<ProductoMenu> itemsCombo) 
	{
		this.nombreCombo = nombre;
		this.descuento = descuento;
		this.id = id;
		this.productos = itemsCombo;
	}
	
	
	public double getDescuento() {
		return descuento;
	}
	
	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}

	public void setNombreCombo(String nombreCombo) {
		this.nombreCombo = nombreCombo;
	}
	
	
//	public void combo(String nombre, double descuento) 
//	{
//
//	}
	public void agregarItemACombo(ProductoMenu itemCombo)
	{
		productos.add(itemCombo);
	}
	
	public int getPrecio()
	{
		int total = 0;
		for (int i = this.productos.size() - 1; i >= 0; i--)
		{
			ProductoMenu unProducto = productos.get(i);
			total = total + unProducto.getPrecio();
		}
		total = (total * this.descuento / 100) + total;
		return total;
	}
	public String generarTextoFactura()
	{
		return (this.getNombre() + "\n\t" + this.getPrecio());
	}
	
	public String getNombre()
	{
		return nombreCombo;
	}
	
	public ArrayList<ProductoMenu> getProductos() {
		return productos;
	}
	
	public void setProductos(ArrayList<ProductoMenu> productos) {
		this.productos = productos;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}
	
}
