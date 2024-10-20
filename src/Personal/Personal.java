package Personal;

public class Personal {
	
	protected String dni;
	protected String nombre;
	protected float salario;
	protected int semanas;
	
	public Personal(String dni, String nombre) {
	  super();
	  this.dni = dni;
	  this.nombre = nombre;
	  this.semanas = 4;
	}
	//Metodo general del calculo del salario
	public void salario(int horas, float importe) {
	  salario = (importe * horas) * semanas;
	}

	@Override
	public String toString() {
		return "Personal [dni=" + dni + ", nombre=" + nombre + ", salario=" + salario
				+ "]";
	}
	
	
	

}
