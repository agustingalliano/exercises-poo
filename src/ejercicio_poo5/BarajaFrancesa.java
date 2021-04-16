package ejercicio_poo5;

public class BarajaFrancesa extends Mazo<PalobarajaFrancesa> {

	public BarajaFrancesa() {
		super();
		super.setNumCartas(52);
		super.setCartasPorPalo(13);
		
		Crearmazo();
	}
	
	
	

	@SuppressWarnings("unchecked")
	public void Crearmazo() {
		
		
		Carta<PalobarajaFrancesa>[] cartas =  new Carta [super.getNumCartas()];
		PalobarajaFrancesa[]palos=PalobarajaFrancesa.values();
		for(int i=0;i<palos.length;i++) {
			for(int j=0;j<super.getCartasPorPalo();j++) {
				cartas[(i*(super.getCartasPorPalo()))+j]=new Carta<PalobarajaFrancesa> (j+1,palos[i]);
			}
			
		}
		
		super.setCartas(cartas);
		
	}
	
	
	public boolean cartaRoja (Carta<PalobarajaFrancesa> c) {
		return c.getPalo() == PalobarajaFrancesa.CORAZONES || c.getPalo() == PalobarajaFrancesa.DIAMANTE;
	}

	
	public boolean cartaNegra (Carta<PalobarajaFrancesa> c) {
		return c.getPalo() == PalobarajaFrancesa.PICAS || c.getPalo() == PalobarajaFrancesa.TREBOLES;
	}
}
