package Modelo;

import java.util.ArrayList;

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
	private ProductoMenu productoBase; 
	
	private ArrayList<Ingrediente> ingredientesEliminados;
	
	private ArrayList<Ingrediente> ingredientesAgregados;
		
	// ************************************************************************
	// Constructores
	// ************************************************************************
	
	/*
	 * Crea el producto ajustado en base al menu base que se le entregó por paramentros
	 */
	public ProductoAjustado(ProductoMenu productoBase)
	{
		this.productoBase = productoBase;
		this.ingredientesAgregados = new ArrayList<>();
		this.ingredientesEliminados = new ArrayList<>();
	}

	
	// ************************************************************************
	// Métodos para consultar los atributos
	// ************************************************************************
	
	public String getNombre() 
	{
		return productoBase.getNombre();
	}


	public int getPrecio() 
	{
		int total = productoBase.getPrecio();
		for (int i = this.ingredientesAgregados.size() - 1; i >= 0; i--)
		{
			Ingrediente unIngrediente = ingredientesAgregados.get(i);
			total = total + unIngrediente.getCostoAdicional();
		}
		return total;
	}


	public String generarTextoFactura() 
	{
		String texto = "\t";
		texto = texto + productoBase.getNombre() + "\t\t\t" + productoBase.getPrecio() + "\n";
		for (int i = this.ingredientesAgregados.size() - 1; i >= 0; i--)
		{
			Ingrediente unIngrediente = ingredientesAgregados.get(i);
			texto = texto + "\t\t+ " + unIngrediente.getNombre() + "\t" + unIngrediente.getCostoAdicional()+ "\n";
		}
		for (int i = this.ingredientesEliminados.size() - 1; i >= 0; i--)
		{
			Ingrediente unIngrediente = ingredientesEliminados.get(i);
			texto = texto + "\t\t- " + unIngrediente.getNombre() + "\n";
		}
		return texto;
	}
	
	public ArrayList<Ingrediente> getIngredientesEliminados() {
		return ingredientesEliminados;
	}


	public void setIngredientesEliminados(ArrayList<Ingrediente> ingredientesEliminados) {
		this.ingredientesEliminados = ingredientesEliminados;
	}


	public ArrayList<Ingrediente> getIngredientesAgregados() {
		return ingredientesAgregados;
	}


	public void setIngredientesAgregados(ArrayList<Ingrediente> ingredientesAgregados) {
		this.ingredientesAgregados = ingredientesAgregados;
	}


	@Override
	public int getId() 
	{
		return productoBase.getId();
	}

}
