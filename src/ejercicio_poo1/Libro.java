package ejercicio_poo1;

public class Libro {
	
	private int ISBN;
	private String titulo;
	private String autor;
	private int NroPagina;
	
	
	//Constructor
	public Libro(){	
	}
	
	public Libro(int isbn,String titulo,String autor,int nroPagina) {
		ISBN=isbn;
		this.titulo=titulo;
		this.autor=autor;
		NroPagina=nroPagina;
	}
	
	
	//Metodos
	public void setISBN(int isbn) {
		ISBN=isbn;
	}
	
	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	
	public void setAutor(String autor) {
		this.autor=autor;
	}
	
	public void setNroPagina(int nroPagina ) {
		NroPagina=nroPagina;
	}
	
	
	public int getISBN() {
		return ISBN;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public int getNroPagina() {
		return NroPagina;
	}
	
	public String toString() {
		return "El libro "+titulo+" creado por el autor "+autor+" tiene "+NroPagina+ " pagians";
	}
	
	
}
