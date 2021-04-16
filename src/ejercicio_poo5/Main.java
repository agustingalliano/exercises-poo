package ejercicio_poo5;

public class Main {
	
	public static void main(String[] args) {
		
		BarajaEspañola b = new BarajaEspañola(false);
		
		b.mostrarBaraja();
		
		
		System.out.println("Hay "+b.cartasDisponibles()+" cartas disponibles");
		
		b.siguienteCarta();
		
		b.darCartas(5);
		
		System.out.println("Hay "+b.cartasDisponibles()+" cartas disponibles");
		
		System.out.println("Cartas sacadas de momento");
		
		b.cartasMonton();
		
		
		b.barajar();
		
		
		@SuppressWarnings("rawtypes")
		Carta[]c=b.darCartas(5);
		
		System.out.println("5 cartas despues de barajar");
		
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
		
		System.out.println("Gracias por utilizar el programa");
		
	}
}
