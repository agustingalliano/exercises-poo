package ejercicio_poo5;

public class Carta <T>{
	
	private int numero;
	private T palo;
	
	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	public T getPalo() {
		return palo;
	}



	public void setPalo(T palo) {
		this.palo = palo;
	}



	public Carta(int numero, T palo) {
		this.numero = numero;
		this.palo = palo;
	}



	public String toString() {
		
		String estado;
		String nombreFigura="";
		
		if(palo.getClass().getSimpleName().equals("PaloBarajaEspañola")) {
			
			switch(numero) {
				case 1:
					nombreFigura="As";
					break;
				case 10:
					nombreFigura="Sota";
					break;
				case 11:
					nombreFigura="Caballo";
					break;
				case 12:
					nombreFigura="Rey";
					break;
				default:
					nombreFigura=numero+"";
			}
	
			
		}else if(palo.getClass().getSimpleName().equals("PalobarajaFrancesa")) {
			
			switch(numero) {
			case 1:
				nombreFigura="As";
				break;
			case 11:
				nombreFigura="Jack";
				break;
			case 12:
				nombreFigura="Reina";
				break;
			case 13:
				nombreFigura="Rey";
				break;
			default:
				nombreFigura=numero+"";
			}
		}
		
		estado = "Carta ["+nombreFigura+" de " + palo + "]";
		return estado;
	}
	
	
	
	
	
}