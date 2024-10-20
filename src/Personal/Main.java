package Personal;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
  ArrayList<Personal> personal = new ArrayList<>();
  Scanner scanner;
  Administrativos admin;
  Informaticos info;
  Investigadores investigador;
  Profesores profe;
  
	public static void main(String[] args) {
	  
	  Main main = new Main();
	  main.scanner = new Scanner(System.in);
	  boolean exit = false;
	  int opcion;
	  do {
	    System.out.println("\n-----Menu-----");
	    System.out.println("\nOpcion 1: Agregar personal a la lista");
	    System.out.println("Opcion 2: Imprimir nominas");
	    System.out.println("Opcion 3: Imprimir presupuesto total");
	    System.out.println("Opcion 4: Salir");
	    
	    opcion = main.scanner.nextInt();
	    switch (opcion) {
		case 1:
			main.agregarLista();
			break;
		case 2:
			System.out.println("-----Personal-----\n");
			main.nominas();
			break;
		case 3:
			main.presupuestoTotal();
			break;
		case 4:
			exit = true;
			System.out.println("Saliendo...");
			break;
		default:
			System.err.println("Opcion incorrecta");
			break;
		}
		
	} while (!exit);
	  
	  main.scanner.close();
	}
	//Menu para agregar a la lista el personal que quieras
	public void agregarLista() {
	  boolean exit = false;
	  System.out.println("Que personal desea agregar?: ");
	  do {
	    System.out.println("\nOpcion 1: Administrativo");
	    System.out.println("Opcion 2: Informaticos");
	    System.out.println("Opcion 3: Investigadores");
	    System.out.println("Opcion 4: Profesores");
	    System.out.println("Opcion 5: Volver al menu");
	    
	    int opcion = scanner.nextInt();
	    
	    
	    switch (opcion) {
		case 1:
			scanner = new Scanner(System.in);
			System.out.println("Ingrese DNI, nombre y horas extras(en caso de que las hubiera) respectivamente");
			String dni = scanner.nextLine();
			String nombre = scanner.nextLine();
			int horasE = scanner.nextInt();
			Administrativos admin = new Administrativos(dni, nombre, horasE);
			admin.salario();
			personal.add(admin);
			break;
		case 2:
			scanner = new Scanner(System.in);
			System.out.println("Ingrese DNI, nombre y horas extras(en caso de que las hubiera) respectivamente");
			dni = scanner.nextLine();
			nombre = scanner.nextLine();
			horasE = scanner.nextInt();
			Informaticos info = new Informaticos(dni, nombre, horasE);
			info.salario();
			personal.add(info);
			break;
		case 3:
			scanner = new Scanner(System.in);
			System.out.println("Ingrese DNI y nombre");
			dni = scanner.nextLine();
			nombre = scanner.nextLine();
			Investigadores investigador = new Investigadores(dni, nombre);
			investigador.salario();
			personal.add(investigador);
			break;
		case 4:
			scanner = new Scanner(System.in);
			System.out.println("Ingrese DNI, nombre y sexenios(en caso de que las hubiera) respectivamente");
			dni = scanner.nextLine();
			nombre = scanner.nextLine();
			int sexenio = scanner.nextInt();
			Profesores profe = new Profesores(dni, nombre, sexenio);
			profe.salario();
			personal.add(profe);
			break;
		case 5:
			exit = true;
			break;
		default:
			System.err.println("Opcion incorrecta");
			break;
		}
	  } while (!exit);
    }
	//Metodo para imprimir las nominas
	public void nominas() {
	  Universidad.imprimirNominas(personal);
	}
	//Metodo para imprimir el presupuesto total
	public void presupuestoTotal() {
	  System.out.println("Presupuesto total: "+Universidad.obtenerPresupuestoTotal(personal));
	}
}
