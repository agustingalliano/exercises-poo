# exercises-poo
En estos 6 ejercicios lo que se intenta aplicar son conociemientos de programacion orientada a objetos, tales como 
clases, objetos, instancias de clase, modularizacion, encapsulamiento, herencia y polimorfismo.

Ejercicio 1: Instancia de la clase Libro 2 veces en las cuales los parametros que recibe el constructor son ingresados por consola por el usuario.
Informacion de que libro posee mas paginas a partir del metodo getNroPagina que nos da la cantidada de paginas de cada libro.

Ejercicio 2: Instancia de la clase Raices que recibe como parametros los coeficientes de una ecuacion cuadratica y nos devuelve las raices.

Ejercicio 3: Instancia de clase Aula, dentro de ese constructor se instancia la clase Profesor y el metodo crearAlumnos instancia
la clase Alumno hasta completar el array. Toda la informacion tanto del profesor como de los alumnos es aleatoria.
Solo se podra dar clases si el profesor asiste, si su materia coincide con la del aula y si asisten mas de la mitad de los alumnos del curso. Se aplica herencia ya que Profesor y Alumno extienden de Persona.

Ejercicio 4: Instancia de clase Pelicula e instancia de clase Cine con sus respectivos parametros cada constructor. Se instancia la clase Espectador tantas veces segun la cantidad de espectadores y se los sentara de forma aleatoria en la matriz siempre y cuando tengan el dinero, la edad para ver la pelicula y haya asientos disponibles. Finalmente nos mostrara todos los asientos y la informacion de cada persona que haya podido concurrir.

Ejercicio 5: Se aplica herencia ya que BarajaEspañola, BarajaFrancesa y BarajaUno extienden de Mazo. Al heredar metodos y parametros de la clase Mazo, se podran utilizar sus metodos los cuales son mezclar el mazo completo (metodo barajar), dar una o mas cartas (siguienteCarta y darCartas), cuales cartas han salido hasta el momento y cuales estan en el mazo a traves de los metodos cartasMonton y mostrarBaraja respectivamente.

Ejercicio 6: Se aplica herencia ya que Bebida azucarada y AguaMineral extienden de Bebida (son Bebidas) y polimorfismo al querer conocer el precio total de una fila, una marca o de todos los productos porque llamara al metodo getPrecio correspondiente si es una Bebida azucarada o Agua Mineral, es decir el objeto se va comportar de una forma u otra dependiendo el contexto. En Bebida azucarada se sobreescribe el metodo getPrecio porque puede incluir o no una promocion.
