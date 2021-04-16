package ejercicio_poo6;

final class Almacen {
	private Bebida [][] estanteria;
	
	public Almacen(int i,int j) {
		estanteria = new Bebida[i][j]; 
	}
	
	public Almacen() {
		estanteria = new Bebida[5][5]; 
	}
	
	public void agregarBebida(Bebida b) {
		
		boolean encontrado = false;
		
		for(int i=0;i<estanteria.length;i++) {
			for(int j=0;j<estanteria[0].length;j++) {
				if(estanteria[i][j]==null) {
					estanteria[i][j]=b;
					encontrado=true;
					break;
				}
			}
			if(encontrado) {
				System.out.println("Bebida añadida");
				break;
			}
		}
		
		if(!encontrado) {
			System.out.println("No se ha podido añadir la bebida");
		}
	}
	
	
	public void eliminarBebida(int id) {
		
		boolean encontrado = false;
		
		for(int i=0;i<estanteria.length;i++) {
			for(int j=0;j<estanteria[0].length;j++) {
				if(estanteria[i][j]!=null && estanteria[i][j].getId()==id) {
					estanteria[i][j]=null;
					encontrado=true;
					break;
				}
			}
			if(encontrado) {
				System.out.println("Bebida eliminada");
				break;
			}
		}
		
		if(!encontrado) {
			System.out.println("La bebida no se encuentra");
		}
	}
	
	public void mostrarBebidas() {	
		for(int i=0;i<estanteria.length;i++) {
			for(int j=0;j<estanteria[0].length;j++) {
				if(estanteria[i][j]!=null) {
					System.out.println("fila: "+i+",columna: "+j+" "+estanteria[i][j].toString());
				}
			}
		}
		
	}
	
	
	public double calcularPrecioBebidas() {
		double precioTotal=0;
		for(int i=0;i<estanteria.length;i++) {
			for(int j=0;j<estanteria[0].length;j++) {
				if(estanteria[i][j]!=null) {
				precioTotal+=estanteria[i][j].getPrecio();
				}
			}
		}
		return precioTotal;
	}
	
	public double calcularPrecioBebidasMarca(String marca) {
		double precioTotal=0;
		for(int i=0;i<estanteria.length;i++) {
			for(int j=0;j<estanteria[0].length;j++) {
				if(estanteria[i][j]!=null && estanteria[i][j].getMarca().equalsIgnoreCase(marca)) {
				precioTotal+=estanteria[i][j].getPrecio();
				}
			}
		}
		return precioTotal;
	}
	
	
	public double calcularPrecioBebidasEstante(int fila) {
		double precioTotal=0;
		if(fila>=0 && fila<estanteria.length) {
			for(int j=0;j<estanteria[0].length;j++) {
					if(estanteria[fila][j]!=null) {
					precioTotal+=estanteria[fila][j].getPrecio();
				}
			}
		}else {
			System.out.println("La fila debe estar entre 0 y "+(estanteria.length-1));
		}
		
		return precioTotal;
	}
	
	
	
}
