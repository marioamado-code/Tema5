package parte1.ejercicio2;

public class Oficial extends Operario {
	public Oficial(String nombre) {
		super(nombre);
		
	}

	@Override
	public String toString() {
		String cad;
		cad = super.toString() + " oficial";
		return cad;
	}
}
