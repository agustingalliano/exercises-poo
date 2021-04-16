package ejercicio_poo6;

import java.util.Scanner;

public class Main {

	private static int opcion;
	private static double cantidad;
	private static double precio;
	private static String marca;
	private static String manantial;
	private static double porcentajeAzucar;
	private static Almacen almacen;
	private static int fila;
	private static int columna;
	
	public static void main(String[] args) {
		int recorrido;
		fila=2;
		columna=2;
		almacen = new Almacen (fila,columna);
		recorrido=fila+columna;
		Scanner entrada= new Scanner(System.in);
		Bebida bebida;
		
		for(int i=0;i<recorrido;i++) {
			
			System.out.println("Ingrese que tipo de bebida desea: 1 para agua mineral, 2 para gaseosa");
			opcion=entrada.nextInt();
			entrada.nextLine();
			System.out.println("Ingrese cantidad de la misma");
			cantidad=entrada.nextDouble();
			entrada.nextLine();
			System.out.println("Ingrese su precio");
			precio=entrada.nextDouble();
			entrada.nextLine();
			System.out.println("Ingrese su marca");
			marca=entrada.nextLine();
			if(opcion==1) {
				System.out.println("Ingrese su manantial");
				manantial=entrada.nextLine();
				bebida = new AguaMineral(cantidad,precio,marca,manantial);
				almacen.agregarBebida(bebida);
			}else {
				System.out.println("Ingrese porcentaje de azucar");
				porcentajeAzucar=entrada.nextDouble();
				entrada.nextLine();
				System.out.println("¿Posee promocion?");
				if(entrada.nextLine().equalsIgnoreCase("si")) {
					bebida= new BebidaAzucarada(cantidad,precio,marca,porcentajeAzucar,true);
				}else {
					bebida= new BebidaAzucarada(cantidad,precio,marca,porcentajeAzucar,false);
				}
				almacen.agregarBebida(bebida);
				
			}
		}
		System.out.println("Las bebidas ingresadas son: ");
		almacen.mostrarBebidas();
		System.out.println("El precio total de las mismas aplicando promocion para aquellas que tengan es: ");
		System.out.println(almacen.calcularPrecioBebidas());
		System.out.println("Ingrese una marca para saber cuanto cuesta el total de sus bebidas");
		marca=entrada.nextLine();
		System.out.println(almacen.calcularPrecioBebidasMarca(marca));
		System.out.println("Calcule el precio de una fila");
		fila = entrada.nextInt();
		System.out.println(almacen.calcularPrecioBebidasEstante(fila));
		System.out.println("Gracias por utilizar el programa");
	}

}
