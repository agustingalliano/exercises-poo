package ejercicio_poo6;

class BebidaAzucarada extends Bebida {
	
	private double porcentajeAzucar;
	private boolean promocion;
	public BebidaAzucarada(double cantidad, double precio, String marca, double porcentajeAzucar, boolean promocion) {
		super(cantidad, precio, marca);
		this.porcentajeAzucar = porcentajeAzucar;
		this.promocion = promocion;
	}
	
	
	public double getPorcentajeAzucar() {
		return porcentajeAzucar;
	}
	
	
	public void setPorcentajeAzucar(double porcentajeAzucar) {
		this.porcentajeAzucar = porcentajeAzucar;
	}
	
	
	public boolean isPromocion() {
		return promocion;
	}
	
	
	public void setPromocion(boolean promocion) {
		this.promocion = promocion;
	}
	
	
	public double getPrecio() {
		if(isPromocion()) {
			return (super.getPrecio()-((super.getPrecio()*10)/100));
		}else {
			return super.getPrecio(); 
		}
	}
	
	
	
	
	public String toString() {
		return super.toString() + ", porcentajeAzucar=" + porcentajeAzucar + ", promocion=" + promocion;
	}
	
	
	
}
