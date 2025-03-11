package parte1.ejercicio2;

public class Directivo extends Empleado {
	public Directivo(String nombre) {
		super(nombre);
		
	}

	@Override
	public String toString() {
		String cad;
		cad = super.toString() + " directivo";
		return cad;
	}
}
