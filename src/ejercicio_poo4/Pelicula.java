package ejercicio_poo4;

public class Pelicula {
	private String tiutlo;
	private int duracion;
	private int edadMin;
	private String director;
	
	
	public Pelicula(String tiutlo, int duracion, int edadMin, String director) {
		this.tiutlo = tiutlo;
		this.duracion = duracion;
		this.edadMin = edadMin;
		this.director = director;
	}


	public String getTiutlo() {
		return tiutlo;
	}


	public void setTiutlo(String tiutlo) {
		this.tiutlo = tiutlo;
	}


	public int getDuracion() {
		return duracion;
	}


	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}


	public int getEdadMin() {
		return edadMin;
	}


	public void setEdadMin(int edadMin) {
		this.edadMin = edadMin;
	}


	public String getDirector() {
		return director;
	}


	public void setDirector(String director) {
		this.director = director;
	}
	
	
	public boolean tieneEdad(Espectador e) {
		return e.getEdad()>=edadMin ;
	}

	public String toString() {
		return "Pelicula [tiutlo=" + tiutlo + ", duracion=" + duracion + ", edadMin=" + edadMin + ", director="
				+ director + "]";
	}
	
	
}
