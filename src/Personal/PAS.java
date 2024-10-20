package Personal;

public class PAS extends Personal {
	
	protected int horasExtras;

	

	public PAS(String dni, String nombre, int horasExtras) {
		super(dni, nombre);
		this.horasExtras = horasExtras;
	}


	//Metodo para calcular el salario con las horas extras de los PAS
	@Override
	public void salario(int horas, float importe) {
	  super.salario(horas, importe);
	  salario += horasExtras * 6;
	  horasExtras = 0;
	}
	
	
	
}
