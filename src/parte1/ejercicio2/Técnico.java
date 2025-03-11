package parte1.ejercicio2;

public class Técnico extends Operario{
	public Técnico(String nombre) {
		super(nombre);
		
	}

	@Override
	public String toString() {
		String cad;
		cad = super.toString() + " técnico";
		return cad;
	}
}
