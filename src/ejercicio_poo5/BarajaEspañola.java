package ejercicio_poo5;

public class BarajaEspa�ola extends  Mazo <PaloBarajaEspa�ola>{
	private boolean incluye_8_9;
	
	public BarajaEspa�ola(boolean incluye_8_9) {
		
		super();
		this.incluye_8_9=incluye_8_9;
		
		if(incluye_8_9) {
			super.setNumCartas(48);
			super.setCartasPorPalo(12);
		}else {
			super.setNumCartas(40);
			super.setCartasPorPalo(10);
		}
		
		Crearmazo();
		
	}
	
	
	
	@SuppressWarnings("unchecked")
	@Override
	public void Crearmazo() {
		
		Carta<PaloBarajaEspa�ola>[] cartas =  new Carta [super.getNumCartas()];
		
		PaloBarajaEspa�ola[]palos=PaloBarajaEspa�ola.values();
		for(int i=0;i<palos.length;i++) {
			for(int j=0;j<super.getCartasPorPalo();j++) {
				if(incluye_8_9) {
					cartas[(i*(super.getCartasPorPalo()))+j]=new Carta <PaloBarajaEspa�ola>(j+1,palos[i]);
				}
				else {
					if(j>=7) {
						cartas[(i*(super.getCartasPorPalo()))+(j)]=new Carta<PaloBarajaEspa�ola> (j+3,palos[i]);
					}
					else{
						cartas[(i*(super.getCartasPorPalo()))+j]=new Carta<PaloBarajaEspa�ola> (j+1,palos[i]);
					}
				}
			}
		}
		
		super.setCartas(cartas);
		
	}
	
	
}
