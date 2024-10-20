package Personal;

public class Profesores extends PDI {
	
	private int sexenio;
	
	public Profesores(String dni, String nombre, int sexenio) {
	  super(dni, nombre);
	  this.sexenio = sexenio;
	}
	//Metodo para calcular el salario con el sexenio
	public void salario() {
      int horas = 37;
	  float importe = 8;
	  super.salario(horas, importe);
	  salario += 100 * sexenio;
	}

	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", salario=" + salario + "]";
	}

}
