package ejercicio_poo4;

public class Espectador {
	private String nombre;
	private int edad;
	private double dineroDisp;
	private double dineroSientro;
	
	
	public Espectador(String nombre, int edad, double dineroDisp) {
		this.nombre = nombre;
		this.edad = edad;
		this.dineroDisp = dineroDisp;
	}
	
	public Espectador(String nombre,int edad) {
		this(nombre,edad,6);
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public double getDineroDisp() {
		return dineroDisp;
	}


	public void setDineroDisp(double dineroDisp) {
		this.dineroDisp = dineroDisp;
	}
	
	public String getDescripcion() {
		return "Nombre: "+nombre+",edad: "+edad+", dinero disponible: "+dineroDisp;
	}
	
	public double getDineroSientro() {
		return dineroSientro;
	}


	public void setDineroSiEntro(double precio) {
		this.dineroSientro = dineroDisp-precio;
	}
	
}
