package Modelo;

import java.util.ArrayList;

public class Combo 
{
	private double descuento;
	private String nombreCombo;
	private int id;
	private ArrayList<ProductoMenu> productos;
	
	public Combo(String nombre, double descuento, int id, ArrayList<ProductoMenu> productos) 
	{
		this.nombreCombo = nombre;
		this.descuento = descuento;
		this.id = id;
		this.productos = productos;
	}
	
	
	public double getDescuento() {
		return descuento;
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	public String getNombreCombo() {
		return nombreCombo;
	}
	public void setNombreCombo(String nombreCombo) {
		this.nombreCombo = nombreCombo;
	}
	
	
//	public void combo(String nombre, double descuento) 
//	{
//
//	}
	public void agregarItemACombo(Producto itemCombo)
	{
		
	}
	public int getPrecio()
	{
		return 0;	
	}
	public String generarTextoFactura()
	{
		return "";
	}
	public String getNombre()
	{
		return "";
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
