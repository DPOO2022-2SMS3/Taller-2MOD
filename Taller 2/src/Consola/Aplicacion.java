package Consola;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

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
				mostrarMenu();
			if (opcion_seleccionada == 2) {
				String nombreCliente = input("Porfavor ingrese el nombre del cliente");
				String direccionCliente = input("Porfavor ingrese su direccion");
				restaurante.iniciarPedido(nombreCliente, direccionCliente);
			}
			if (opcion_seleccionada == 3) {
				{
				
					
				}
				
			}
				
				
			{
				System.out.println("Saliendo de la aplicación ...");
				continuar = false;
			}
			if (restaurante == null)
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
	public String input(String mensaje)
	{
		try
		{
			System.out.print(mensaje + ": ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		}
		catch (IOException e)
		{
			System.out.println("Error leyendo de la consola");
			e.printStackTrace();
		}
		return null;
	}

	
	public static void main(String[] args)
	{
		Aplicacion consola = new Aplicacion();
		consola.ejecutarAplicacion();
	}
	

}
