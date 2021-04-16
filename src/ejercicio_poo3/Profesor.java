package ejercicio_poo3;

class Profesor extends Persona{
	
	private String materia;
	
	public Profesor(){
		super();
		materia=Constantes.MATERIAS[MetodosSueltos.generarNumeroAleatorio(0,2)];
		super.setEdad(MetodosSueltos.generarNumeroAleatorio(25, 65));
		disponibilidad();
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	
	public void disponibilidad() {
		int porcentaje= MetodosSueltos.generarNumeroAleatorio(0, 100);
		if(porcentaje<20) {
			super.setAsistencia(false);
		}
		else {
			super.setAsistencia(true);
		}
	}

	
}
