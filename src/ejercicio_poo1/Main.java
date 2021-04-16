package ejercicio_poo1;

import java.util.Scanner;

public class Main {
	//En este ejercicio evaluaremos cual libro tiene mas paginas
	
	private static int Codigo;
	private static String Titulo;
	private static String Autor;
	private static int CantPag;
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Libro [] libros= new Libro[2];
		
		System.out.println("Ingrese dos libros para determinar cual de ellos tiene mas paginas");
		
		for(int i=0;i<libros.length;i++) {
			System.out.println("Ingrese codigo de un libro");
			Codigo=entrada.nextInt();
			entrada.nextLine();//Limpiamos el scanner con nextline despues de cada nextInt para que consuma el "\n" (que no toma el nextInt) y se saltee.
			System.out.println("Ingrese el titulo del mismo");
			Titulo=entrada.nextLine();
			System.out.println("Ingrese el autor");
			Autor=entrada.nextLine();
			System.out.println("Ingrese la cantidad de paginas");
			CantPag=entrada.nextInt();
			entrada.nextLine();
			libros[i]=new Libro(Codigo,Titulo,Autor,CantPag);
		}
		
		for(Libro l:libros) {
			System.out.println(l.toString());
		}
		
		if(libros[0].getNroPagina()>libros[1].getNroPagina()) {
			System.out.println("El libro de "+libros[0].getAutor()+ " tiene mas pagina que el libro de "+libros[1].getAutor()
			+" con "+libros[0].getNroPagina()+" paginas sobre "+libros[1].getNroPagina());
		}else if(libros[1].getNroPagina()>libros[0].getNroPagina()){
			System.out.println("El libro de "+libros[1].getAutor()+ " tiene mas pagina que el libro de "+libros[1].getAutor()
			+" con "+libros[1].getNroPagina()+" paginas sobre "+libros[0].getNroPagina());
		}else {
			System.out.println("Ambos libros tienen la misma cantidad de paginas con "+libros[1].getNroPagina()+" cada uno.");
		}
	
		System.out.println("Gracias por utilizar el programa");
	}

}
