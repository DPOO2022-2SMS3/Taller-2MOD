package Consola;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import Modelo.Restaurante;

public class Aplicacion {
	
	private Restaurante restaurante = new Restaurante();
	
	
	public void ejecutarAplicacion() throws FileNotFoundException, IOException 
	{
		System.out.println("Nuestra Carta");
		Boolean pedido = false;

		boolean continuar = true;
		while (continuar)
		{
			
			System.out.println("\n1. Mostrar el menú");
			System.out.println("2. Iniciar un nuevo pedido");
			System.out.println("3. Agregar un elemento a un pedido");
			System.out.println("4. Cerrar un pedido y guardar la factura");
			System.out.println("5. Consultar la información de un pedido dado su id");

			restaurante.cargarInformacionRestaurante();
			int opcion_seleccionada = Integer.parseInt(input("Por favor seleccione una opción\n"));
			if (opcion_seleccionada == 1)
			{
				mostrarMenu();
			}
				
			else if (opcion_seleccionada == 2) 
			{
				String nombreCliente = input("Ingrese el nombre del cliente\n");
				String direccionCliente = input("Ingrese su direccion\n");
				restaurante.iniciarPedido(nombreCliente, direccionCliente);
				pedido = true;
				System.out.println("Pedido iniciado");
			}
			else if (opcion_seleccionada == 3 && pedido==true)
			{
				int idProducto = Integer.parseInt(input("Ingrese el código del producto que desea agregar\n"));
				if (idProducto > 100 && idProducto < 120)
				{
					int ajuste = Integer.parseInt(input("¿Modificar Producto?\n \t1. Sí\n\t2. No\n"));
					if (ajuste == 1)
					{
						boolean modificaciones = true;
						while (modificaciones)
						{
							int idIngrediente = Integer.parseInt(input("Ingrese el código del ingrediente que desea modificar\n"));
							int tipo = Integer.parseInt(input("1. Agregar Ingrediente\n2. Eliminar Ingrediente\n"));
							if (tipo == 1)
							{
								restaurante.ejecutarPrepararProductoAjustado(idProducto, tipo, idIngrediente);
							}
							else if (tipo == 2)
							{
								restaurante.ejecutarPrepararProductoAjustado(idProducto, tipo, idIngrediente);
							}
							int proseguirmod = Integer.parseInt(input("¿Continuar modificaciones?\n \t1. Sí\n\t2. No\n"));
							if (proseguirmod != 1)
							{
								modificaciones = false;
							}
						}
						restaurante.ejecutarAgregarProductoAjustado();
					}
					else if (ajuste == 2)
					{
						restaurante.ejecutarAgregarProducto(idProducto);
					}
					System.out.println("Producto agregado");
				}
			
				
				else if ((idProducto > 200 && idProducto < 216) || (idProducto > 300 && idProducto < 304) ||(idProducto > 400 && idProducto < 404))
				{
					restaurante.ejecutarAgregarProducto(idProducto);
					System.out.println("Producto agregado");
				}
				
				else
				{
					System.out.println("Producto inválido");
				}
			}
			
			else if (opcion_seleccionada == 3 && pedido==false) 
			{
				System.out.println("Por favor inicie un pedido");
			}
	
			else if (opcion_seleccionada == 4)
			{
				Boolean repetido = restaurante.cerrarYGuardarPedido();
				if (repetido == true)
				{
					System.out.println("Un pedido idéntico ya había sido ordenado");
				}
				else
				{
					System.out.println("Este pedido no ha sido ordenado antes");
				}
				System.out.println("Pedido Cerrado");
				 pedido = false;
			}
			else if (opcion_seleccionada == 5)
			{
				int idPedido = Integer.parseInt(input("Ingrese el ID del pedido que desea consultar\n"));
				String texto = restaurante.getPedidoxID(idPedido);
				System.out.println(texto);
			}
			
			else
			{
				System.out.println("Saliendo de la aplicación ...");
				continuar = false;
			}
		}
	}
	
			
	
	public void mostrarMenu() 
	{
		System.out.println("1. MENÚ\n");
		System.out.println("\t101 - corral: 14000");
		System.out.println("\t102 - corral queso: 16000");
		System.out.println("\t103 - corral pollo: 15000");
		System.out.println("\t104 - corralita: 13000");
		System.out.println("\t105 - todoterreno: 25000");
		System.out.println("\t106 - 1/2 libra: 25000");
		System.out.println("\t107 - especial: 24000");
		System.out.println("\t108 - casera: 23000");
		System.out.println("\t109 - mexicana: 22000");
		System.out.println("\t110 - criolla: 22000");
		System.out.println("\t111 - costeña: 20000");
		System.out.println("\t112 - hawaiana: 20000");
		System.out.println("\t113 - wrap de pollo: 15000");
		System.out.println("\t114 - wrap de lomo: 22000");
		System.out.println("\t115 - ensalada mexicana: 20900");
		System.out.println("\t116 - papas medianas: 5500");
		System.out.println("\t117 - papas grandes: 6900");
		System.out.println("\t118 - papas en casco medianas: 5500");
		System.out.println("\t119 - papas en casco grandes: 6900");
		System.out.println("\n2. INGREDIENTES");
		System.out.println("\t201 - lechuga: 1000");
		System.out.println("\t202 - tomate: 1000");
		System.out.println("\t203 - cebolla: 1000");
		System.out.println("\t204 - queso mozzarella: 2500");
		System.out.println("\t205 - huevo: 2500");
		System.out.println("\t206 - queso americano: 2500");
		System.out.println("\t207 - tocineta express: 2500");
		System.out.println("\t208 - papa callejera: 2000");
		System.out.println("\t209 - pepinillos: 2500");
		System.out.println("\t210 - cebolla grille: 2500");
		System.out.println("\t211 - suero costeño: 3000");
		System.out.println("\t212 - frijol refrito: 4500");
		System.out.println("\t213 - queso fundido: 4500");
		System.out.println("\t214 - tocineta picada: 6000");
		System.out.println("\t215 - piña: 2500");
		System.out.println("\n3. COMBOS");
		System.out.println("\t301 - combo corral (corral, papas medianas, gaseosa): 22050");
		System.out.println("\t302 - combo corral queso (corral queso, papas medianas, gaseosa): 23850");
		System.out.println("\t303 - combo todoterreno (todoterreno, papas grandes, gaseosa): 34317");
		System.out.println("\n4. BEBIDAS");
		System.out.println("\t401 - agua cristal sin gas: 5000");
		System.out.println("\t402 - agua cristal con gas: 5000");
		System.out.println("\t403 - gaseosa: 5000");
	}
	
	public String input(String mensaje)
	{
		try
		{
			System.out.print(mensaje);
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

	
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		Aplicacion consola = new Aplicacion();
		consola.ejecutarAplicacion();
	}

}
