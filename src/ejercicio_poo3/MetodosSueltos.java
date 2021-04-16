package ejercicio_poo3;

class MetodosSueltos {

	public static int generarNumeroAleatorio(int minimo,int maximo) {
		int num= (int) Math.floor((Math.random()*(((maximo)-minimo)+1))+minimo);
		return num;
	}
	
	public static double generarNumeroRealAleatorio(int minimo,int maximo) {
		double num= (Math.random()*(((maximo-minimo)+minimo)));
		return num;
	}
	
}
