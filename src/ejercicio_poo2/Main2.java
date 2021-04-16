package ejercicio_poo2;

import java.util.Scanner;

public class Main2 {

	private static int a;
	private static int b;
	private static int c;
	
	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		System.out.println("Ingrese tres coefcientes para una ecuacion cuadratica y conocer sus raices");
		System.out.println("Ingrese el coeficiente principal");
		a=entrada.nextInt();
		System.out.println("Ingrese el coeficiente lineal");
		b=entrada.nextInt();
		System.out.println("Ingrese el termino independiente");
		c=entrada.nextInt();
		
		
		Raices ecuacion = new Raices(a,b,c);
		ecuacion.calcular();
		
		System.out.println("Gracias por utilizar el programa");
	}

}
