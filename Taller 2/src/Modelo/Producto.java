package Modelo;

public interface Producto 
{
	public default int getPrecio()
	{
		return 0;
	}
	
	public default String getNombre()
	{
		return "";
	}
	
	public default String generarTextoFactura()
	{
		return "";
	}

}
