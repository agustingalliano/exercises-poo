package ejercicio_poo2;

public class Raices {
	
	private double a;
	private double b;
	private double c;
	
	public Raices(int pC,int sC,int tC) {
		a=pC;
		b=sC;
		c=tC;
	}
	
	private double getDiscriminante() {
		double discriminante= Math.pow(b,2)-(4*a*c);
		return discriminante;
	}
	
	
	private void obtenerRaices() {
		System.out.println("Solucion X1");
		System.out.println((-b+(Math.sqrt(getDiscriminante())))/(2*a));
		System.out.println("Solucion X2");
		System.out.println(((-b-(Math.sqrt(getDiscriminante())))/(2*a)));
	}
	
	private void obtenerRaiz() {
		System.out.println("Solucion Unica");
		System.out.println((-b)/(2*a));//Como el discriminante vaa ser 0 lo omitimos
	}
	
	
	private boolean tieneRaices() {
		if(getDiscriminante()>0) {
			return true;
		}else {
			return false;
		}
	}
	
	private boolean tieneRaiz() {
		return getDiscriminante()==0;
	}
	
	public void calcular() {
		if(tieneRaices()) {
			System.out.println("Las raices son: ");
			obtenerRaices();
		}else if(tieneRaiz()){
			System.out.println("Las raiz es: ");
			obtenerRaiz();
		}else {
			System.out.println("No tiene raices en los reales");
		}
	}
}
