package ejercicio_poo3;

public abstract class Persona {
	private String nombre;
	private int edad;
	private String genero;
	private boolean asistencia;
	
	//Constantes
	private final String [] NOMBRE_CHICOS = {"Pepe","Fernando","Alberto","Nacho","Agustin"};
	private final String [] NOMBRE_CHICAS = {"Alicia","Laura","Fernanda","Elena","Maria"};
	private final int CHICO=0;
	private final int CHICA=1;
	
	
	public Persona() {
		
		int determinar_genero=MetodosSueltos.generarNumeroAleatorio(CHICO, CHICA);
		
		if(determinar_genero==CHICO) {
			nombre=NOMBRE_CHICOS[MetodosSueltos.generarNumeroAleatorio(0,NOMBRE_CHICOS.length-1)];
			genero="hombre";
		}else {
			nombre=NOMBRE_CHICAS[MetodosSueltos.generarNumeroAleatorio(0,NOMBRE_CHICAS.length-1)];
			genero="mujer";
		}
		
	}

	public void setNombre(String nombre) {
		this.nombre=nombre;
	}

	public void setEdad(int edad) {
		this.edad=edad;
	}
	
	public void setGenero(String genero) {
		this.genero=genero;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public boolean isAsistencia() {
		return asistencia;
	}

	public void setAsistencia(boolean asistencia) {
		this.asistencia = asistencia;
	}
	
	
	public abstract void disponibilidad();
	
	
}
