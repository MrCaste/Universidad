package Personal;

public class Investigadores extends PDI {

	public Investigadores(String dni, String nombre) {
	  super(dni, nombre);
	}
	
	public void salario() {
	  int horas = 35;
	  float importe = 7;
	  super.salario(horas, importe);
	}
	
	@Override
	public String toString() {
		return "Investigador [nombre=" + nombre + ", salario=" + salario + "]";
	}
	
	

}
