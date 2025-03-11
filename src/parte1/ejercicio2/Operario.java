package parte1.ejercicio2;

public class Operario extends Empleado {
	public Operario(String nombre) {
		super(nombre);
		
	}

	@Override
	public String toString() {
		String cad;
		cad = super.toString() + " operario";
		return cad;
	}
}
