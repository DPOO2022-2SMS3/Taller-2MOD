package Consola;

import Modelo.Restaurante;

public class Aplicacion {
	
	private Restaurante restaurante;
	
	public void ejecutarAplicacion()
	{
		System.out.println("Nuestra Carta \n");

		boolean continuar = true;
		while (continuar)
		{
			
			
				restaurante.cargarInformacionRestaurante();
				int opcion_seleccionada = Integer.parseInt(input("Por favor seleccione una opción"));
				if (opcion_seleccionada == 1)
					CargarMenu();
				
				{
					System.out.println("Saliendo de la aplicación ...");
					continuar = false;
				}
				else if (restaurante == null)
				{
					System.out.println("Para poder ejecutar esta opción primero debe cargar un archivo de atletas.");
				}
				else
				{
					System.out.println("Por favor seleccione una opción válida.");
				}
		}
			
			
		}
	public void mostrarMenu() 
	{
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args)
	{
		Aplicacion consola = new Aplicacion();
		consola.ejecutarAplicacion();
	}
	

}
