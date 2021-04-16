package ejercicio_poo6;

class AguaMineral extends Bebida {
	
	private String manantial;

	public AguaMineral(double cantidad, double precio, String marca, String manantial) {
		super(cantidad, precio, marca);
		this.manantial = manantial;
	}

	public String getManantial() {
		return manantial;
	}

	public void setManantial(String manantial) {
		this.manantial = manantial;
	}

	
	public String toString() {
		return super.toString() + ", manantial=" + manantial;
	}
	
	
}
