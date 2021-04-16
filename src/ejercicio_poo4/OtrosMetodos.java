package ejercicio_poo4;

public class OtrosMetodos {
	
	
	public static final String nombres [] = {"Fernando","Pepe","Micaela","Norma"};
	
	
	
	public static int generarNumeroAleatorio(int minimo,int maximo) {
		int num= (int) Math.floor((Math.random()*(((maximo)-minimo)+1))+minimo);
		return num;
	}
	
	public static double generarNumeroRealAleatorio(int minimo,int maximo) {
		double num= (Math.random()*(((maximo-minimo)+minimo)));
		if(num<minimo) {
			num++;
		}
		return num;
	}


}
