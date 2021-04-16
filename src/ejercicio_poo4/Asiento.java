package ejercicio_poo4;

public class Asiento {
	
	private char letra;
	private int fila;
	private Espectador espectador;
	
	
	public Asiento(int fila,char letra) {
		this.letra = letra;
		this.fila = fila;
		this.espectador = null;
	}
	
	
	public char getLetra() {
		return letra;
	}
	public void setLetra(char letra) {
		this.letra = letra;
	}
	public Espectador getEspectador() {
		return espectador;
	}


	public void setEspectador(Espectador espectador) {
		this.espectador = espectador;
	}


	public int getFila() {
		return fila;
	}
	public void setFila(int numero) {
		this.fila = numero;
	}
	
	public boolean ocupado() {
		return espectador!=null;
	}
	
	
	public String getDescripcion() {
		if(espectador!=null) {
			return "Asiento {letras "+letra+" fila: "+fila+", espectador "+espectador.getDescripcion()+",dinero despues de pagar: "+espectador.getDineroSientro()+"}";
		}else {
			return "Asiento {letras "+letra+" fila: "+fila+", espectador "+espectador+"}";
		}
	}
}
