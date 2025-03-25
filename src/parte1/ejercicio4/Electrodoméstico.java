package parte1.ejercicio4;

public class Electrodoméstico {
	private double precioBase = 100;

	private enum Color {
		BLANCO, NEGRO, ROJO, AZUL, GRIS
	};

	private Color color = Color.BLANCO;
	private double peso = 5;

	private enum ConsumoEnergético {
		A, B, C, D, E, F
	};

	private ConsumoEnergético cons = ConsumoEnergético.F;

	public Electrodoméstico(double precioBase, double peso) {
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}
		if (peso > 0) {
			this.peso = peso;
		}
	}
public Electrodoméstico(double precioBase,double peso,String color) {
	if (precioBase > 0) {
		this.precioBase = precioBase;
	}
	if (peso > 0) {
		this.peso = peso;
	}
}
private char comprobarConsumoEnergetico(char letra) {
	return letra;
}
private String comprobarColor(String color) {
	return color;
}
public void precioFinal(){
	
}
}
