package ejercicio_poo3;

public class Main {

	public static void main(String[] args) {
		Aula aula = new Aula();
		
		System.out.println("En este ejercicio, teniendo cuenta cantidad de asistencia de alumnos, "
							+ "de si el profesor asiste y de si su materia coincide con la que se "
							+ "da en esa aula, se daran la notas de los alumnos aprobados");
		System.out.println("Debe haber mas de la mitad de alumnos, de los cuales asisten si su porcentaje de asistencia es a partir de 50%, menos de ese porcentaje no asisten");
		System.out.println("El profesor asiste si su porcentaje de asistencia es a partir del 20%");
		System.out.println("Todos los datos se generaran de forma aleatoria");
		if(aula.darClase()) {
			aula.notas();
		}
		System.out.println("FIN");
	}

}
