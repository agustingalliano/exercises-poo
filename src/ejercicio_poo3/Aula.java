package ejercicio_poo3;

class Aula {
	
	private Profesor profesor;
	private Alumno [] alumnos;
	private String materia;
	
	private final int MAX_ALUMNOS=20;
	
	public Aula(){
		profesor= new Profesor();
		alumnos= new Alumno[MAX_ALUMNOS];
		materia=Constantes.MATERIAS[MetodosSueltos.generarNumeroAleatorio(0,2)];
		creaAlumnos();
		
	}
	
	
	private void creaAlumnos() {
		for(int i=0;i<alumnos.length;i++) {
			alumnos[i]=new Alumno();
		}
	}
	
	public boolean darClase() {
		if(!profesor.isAsistencia()) {
			System.out.println("El profesor no asiste,no se puede dar clases");
			return false;
		}else if(!profesor.getMateria().equals(materia)){
			System.out.println("La materia del profesor y el aula no es la misma");
			return false;
		}else if(!asistenciaAlumnos()) {
			System.out.println("La asistencia de alumnos no es suficiente, deben haber mas de la mitad");
			return false;
		}
		else {
			System.out.println("Se puede dar clases de la materia "+materia+" a cargo del docente "+profesor.getNombre());
			return true;
		}
	}
	
	
	private boolean asistenciaAlumnos() {
		int cuentaAsistencias=0;
		for(int i=0;i<alumnos.length;i++) {
			if(alumnos[i].isAsistencia()) {
				cuentaAsistencias++;
			}
		}
		
		System.out.println("Hay "+cuentaAsistencias+" de "+MAX_ALUMNOS+" alumnos que asistieron");
		
		return cuentaAsistencias>=(MAX_ALUMNOS/2);
	}
	
	
	public String getMateria() {
		return materia;
	}


	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	
	public void notas() {
		int chicosAprob=0;
		int chicasAprob=0;
		
		System.out.println("Informacion de alumnos con nota aprobada, hayan asistido hoy o no");
		for(int i=0;i<alumnos.length;i++) {
			if(alumnos[i].getCalificacion()>=5) {
				if(alumnos[i].getGenero().equals("hombre")) {
					chicosAprob++;
				}else {
					chicasAprob++;
				}
				System.out.println(alumnos[i].getDescripcion());
			}
		}
		
		System.out.println("Hay "+chicosAprob+" chicos y "+chicasAprob+" chicas aprobados/as.");
	}
	
}
