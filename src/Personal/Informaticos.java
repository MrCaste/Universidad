package Personal;

public class Informaticos extends PAS {

	public Informaticos(String dni, String nombre, int horasExtras) {
	  super(dni, nombre, horasExtras);
	}
	
	public void salario() {
	  int horas = 40;
	  float importe = 6;
	  super.salario(horas, importe);
	}

	@Override
	public String toString() {
		return "Informatico [nombre=" + nombre + ", salario=" + salario + "]";
	}

	
}
