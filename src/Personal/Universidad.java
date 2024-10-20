package Personal;

import java.util.ArrayList;

public class Universidad {
	//Imprime las nominas de cada posicion del Array, con su nombre, salario y categoria
	public static void imprimirNominas(ArrayList<Personal> personal) {
	  
	  for (int i = 0; i < personal.size(); i++) {
	    System.out.println(personal.get(i).toString()); 
	  }	 
	}
	//Hace la suma e imprime el salario total
	public static long obtenerPresupuestoTotal(ArrayList<Personal> personal) {
	  long numerito = 0;
	  for (int i = 0; i < personal.size(); i++) {
		numerito += personal.get(i).salario;
	  }
	  return numerito;
	}

}
