package ejercicio_poo5;

import ejercicio_poo4.OtrosMetodos;

public abstract class Mazo <S>{
	
	private Carta <S> misCartas[];	
	private int posSiguienteCarta;
	private int numCartas;
	private int CartasPorPalo;
	
	
	public Mazo() {
		posSiguienteCarta = 0;
	}

	public int getPosSiguienteCarta() {
		return posSiguienteCarta;
	}

	public void setPosSiguienteCarta(int posSiguienteCarta) {
		this.posSiguienteCarta = posSiguienteCarta;
	}

	public int getNumCartas() {
		return numCartas;
	}

	public void setNumCartas(int numCartas) {
		this.numCartas = numCartas;
	}

	public int getCartasPorPalo() {
		return CartasPorPalo;
	}

	public void setCartasPorPalo(int cartasPorPalo) {
		CartasPorPalo = cartasPorPalo;
	}
	
	public abstract void Crearmazo();
	
	public Carta<S>[] getCartas() {
		return misCartas;
	}

	public void setCartas(Carta<S>[] cartas) {
		misCartas = cartas;		
	}

	public void barajar() {
		posSiguienteCarta=0;
		int posAleatoria=0;
		Carta <S> aux;
		
		for(int i=0;i<misCartas.length;i++) {
			posAleatoria = OtrosMetodos.generarNumeroAleatorio(0, numCartas-1);
			aux = misCartas[i];
			misCartas[i]=misCartas[posAleatoria];
			misCartas[posAleatoria] =aux;
		}
	}
	
	
	public Carta<S> siguienteCarta() {
		Carta<S> c=null;
		if(posSiguienteCarta==numCartas) {
			System.out.println("Ya no hay mas cartas, barajea de nuevo");
		}else {
			c = misCartas[posSiguienteCarta];
			posSiguienteCarta++;
		}
		return c;
	}
	
	
	@SuppressWarnings("unchecked")
	public Carta<S>[] darCartas(int cantSolicitada) {
		if(cartasDisponibles()>=cantSolicitada) {
			
			Carta<S>[] darCartas = new Carta[cantSolicitada];
			for(int i=0;i<darCartas.length;i++) {
				darCartas[i]=siguienteCarta();
			}
			return darCartas;
		}
		else if(cantSolicitada>numCartas){
			System.out.println("No se pueden dar mas cartas de las que hay");
		}
		else {
			System.out.println("No hay "+cantSolicitada+" cartas para dar");
		}
		return null;
	}
	
	
	
	
	public int cartasDisponibles() {
		return numCartas-posSiguienteCarta;
	}
	
	
	
	public void cartasMonton() {
		if(cartasDisponibles()==numCartas) {
			System.out.println("No ha salido niguna carta");
		}
		else {
			System.out.println("Cartas que ya salieron: ");
			for(int i=0;i<posSiguienteCarta;i++) {
				System.out.println(misCartas[i]);
			}
		}
	}
	
	
	
	public void mostrarBaraja() {
		if(cartasDisponibles()==0) {
			System.out.println("No hay cartas en el mazo");
		}
		else {
			System.out.println("Cartas en el mazo: ");
			for(int i=posSiguienteCarta;i<misCartas.length;i++) {
				System.out.println(misCartas[i]);
			}
		}
	}
	
}
