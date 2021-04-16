package ejercicio_poo5;

public class CartaUno extends Carta<ColoresBarajaUno> {
	
	private EfectosBarajaUno efecto;
	
	
	public CartaUno(int numero, ColoresBarajaUno color) {
		super(numero, color);
		efecto=null;
	}
	
	public CartaUno(ColoresBarajaUno color,EfectosBarajaUno efecto) {
		super(-1,color);
		this.efecto = efecto;
	}

	public EfectosBarajaUno getEfecto() {
		return efecto;
	}

	
	public boolean isEspecial() {
		return this.efecto!=null;
	}

	@Override
	public String toString() {

		String estado="";
		
		if(this.isEspecial()) {
			switch(this.efecto) {
			case MASDOS:
				estado="+2 " +super.getPalo();
				break;
			case MASCUATRO:
				estado="+4" ;
				break;
			case SALTO:
				estado="SALTO " +super.getPalo();
				break;
			case REVERSO:
				estado="REVERSO " +super.getPalo();
				break;
			case CAMBIOCOLOR:
				estado="CAMBIA COLOR";
				break;
			}
			
		}else {
			estado= super.getNumero() +" "+ super.getPalo();
		}
		return estado;
		
	}
	
	
	
	
}
