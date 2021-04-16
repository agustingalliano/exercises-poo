package ejercicio_poo4;

public class Main {

	public static void main(String[] args) {
		
		Pelicula pelicula = new Pelicula("Shrek2",90,16,"Agustin Galliano");
		
		Cine cine = new Cine(8,9,5.5,pelicula);
		
		Espectador e;
		
		int numEspectadores=100;
		int fila;
		char letra;
		
		for(int i =0;i<numEspectadores;i++) {
			
			if(!cine.haySitio()) {
				break;
			}
			
			e = new Espectador(OtrosMetodos.nombres[OtrosMetodos.generarNumeroAleatorio(0, 3)],
			                                        OtrosMetodos.generarNumeroAleatorio(10,30),
													OtrosMetodos.generarNumeroRealAleatorio(1, 10));
			
			
			do {
				fila = OtrosMetodos.generarNumeroAleatorio(1, cine.getFilas());
				letra = (char) OtrosMetodos.generarNumeroAleatorio('A','A'+cine.getColumnas()-1);
			}while(!cine.haySitioButaca(fila, letra));
			
		
			if(cine.sePuedeSentar(fila, letra, e)) {
				cine.sentar(fila, letra, e);
				e.setDineroSiEntro(cine.getPrecio());
			}
			
		}
		
		System.out.println("A continuacion describiremos la funcion de una pelicula en el cine");
		System.out.println(pelicula.toString());
		cine.mostrar();
		
		System.out.println("FIN");
	}

}
