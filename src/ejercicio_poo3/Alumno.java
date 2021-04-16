package ejercicio_poo3;

class Alumno extends Persona{
	
	private int calificacion;
	
	public Alumno(){
		super();
		calificacion=MetodosSueltos.generarNumeroAleatorio(0, 10);
		setEdad(MetodosSueltos.generarNumeroAleatorio(12, 15));
		disponibilidad();
	}

	
	public void disponibilidad() {
		int porcentaje= MetodosSueltos.generarNumeroAleatorio(0, 100);
		if(porcentaje<50) {
			setAsistencia(false);
		}
		else {
			setAsistencia(true);
		}
	}


	public int getCalificacion() {
		return calificacion;
	}


	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	public String getDescripcion() {
		if(super.isAsistencia()) {
			return "Nombre: "+super.getNombre()+", genero: "+super.getGenero()+", nota: "+calificacion+", asistio en la fecha";
		}else {
			return "Nombre: "+super.getNombre()+", genero: "+super.getGenero()+", nota: "+calificacion+", no asistio en la fecha";
		}
	}
	
}
