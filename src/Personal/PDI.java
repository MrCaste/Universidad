package Personal;

public class PDI extends Personal {

	public PDI(String dni, String nombre) {
	  super(dni, nombre);
	}
	
	
	@Override
	public void salario(int horas, float importe) {
	  super.salario(horas, importe);
	}

}
