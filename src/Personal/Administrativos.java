package Personal;

public class Administrativos extends PAS {

	public Administrativos(String dni, String nombre, int horasExtras) {
	  super(dni, nombre, horasExtras);
	}
	
	
	public void salario() {
	  int horas = 37;
	  float importe = 7.5F;
	  super.salario(horas, importe);
	}

	@Override
	public String toString() {
		return "Administrativo [nombre=" + nombre + ", salario=" + salario + "]";
	}

	
}
