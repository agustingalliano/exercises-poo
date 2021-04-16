package ejercicio_poo4;

public class Cine {
	
	private Asiento[][]asientos;
	private double precio;
	private Pelicula pelicula;
	
	public Cine(int filas,int columnas, double precio, Pelicula pelicula) {
		asientos = new Asiento[filas][columnas];
		this.precio=precio;
		this.pelicula=pelicula;
		rellenaAsientos();
	}
	
	private void rellenaAsientos() {
		int fila=asientos.length;
		int columna;
		for(int i=0;i<asientos.length;i++) {
			columna =0;
			for(int j=0;j<asientos[0].length;j++) {
				asientos[i][j]= new Asiento(fila,(char)('A'+columna));
				columna++;
			}
			fila--;
		}
	}
	
	
	public boolean haySitio() {
		boolean haySitio=false;
		for(int i=0;i<asientos.length && !haySitio;i++) {
			for(int j=0;j<asientos[0].length && !haySitio;j++) {
				if(!asientos[i][j].ocupado()) {
					haySitio=true;
				}
			}
		}
		return haySitio;
	}
	
	
	public boolean haySitioButaca(int fila, char letra) {
		return !getAsiento(fila,letra).ocupado();
	}
	
	
	public boolean tieneDinero(Espectador e) {
			return e.getDineroDisp()>=precio;
	}

	
	public boolean sePuedeSentar(int fila,char letra,Espectador e) {
		return (tieneDinero(e) && pelicula.tieneEdad(e) && haySitioButaca(fila,letra));
	}
	
	
	public void sentar(int fila,char letra,Espectador e) {
		asientos[asientos.length-fila][letra-'A'].setEspectador(e);
	}
	
	public Asiento getAsiento (int fila, char letra) {
		return asientos[asientos.length-fila][letra-'A'];
	}
	

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}
	
	public int getFilas() {
		return asientos.length;
	}
	
	public int getColumnas() {
		return asientos[0].length;
	}
	
	
	public void mostrar() {
		for(int i=0;i<asientos.length;i++) {
			for(int j=0;j<asientos[0].length;j++) {
				System.out.println(asientos[i][j].getDescripcion());
			}
			System.out.println("");
		}
	}
	
	
}
