package Modelo;

/*
 * La clase ProductoAjustado representa un producto que se ajustó cuando se agregó 
 * a un pedido: un ProductoAjustado tiene un prducto base y una serie de ingredientes 
 * que se agregan o se eliminan a este producto
 */
public class ProductoAjustado implements Producto
{
	
	
	// ************************************************************************
	// Atributos
	// ************************************************************************

	
	/*
	 * Todavia no se hacer asociaciones. No se si de esta manera es la manera correacta
	 */
	private ProductoMenu ProductoMenu; 
	
	/*
	 * Supongo que es el nombre de los ingredientes
	 */
	private String nombre;
	
	/*
	 * Tambien voy a suponer que es el precio de los ingredientes
	 */
	private int precio;
	
	/*
	 * Esto si no tengo ni idea
	 */
	private String TextoFactura;
	
	//Falta asosiaciones agregados y eliminados hacia Ingredientes y base 1 hacia ProductoMenu
	
	// ************************************************************************
	// Constructores
	// ************************************************************************
	
	/*
	 * Crea el producto ajustado en base al menu base que se le entregó por paramentros
	 */
	public ProductoAjustado(ProductoMenu base)
	{
		this.ProductoMenu = base;
	}

	
	// ************************************************************************
	// Métodos para consultar los atributos
	// ************************************************************************
	
	public String getNombre() 
	{
		return nombre;
	}


	public int getPrecio() 
	{
		return precio;
	}


	public String generarTextoFactura() 
	{
		return TextoFactura;
	}
}
