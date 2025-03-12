package parte1.ejercicio3;

public class Producto {
	private String nombre;
	private double precio;

	public Producto(String nombre, double precio) {
		if (!nombre.isBlank() && nombre != null) {
			this.nombre = nombre;
		}
		if (precio > 0) {
			this.precio = precio;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;

	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		String cad="";
		cad +=nombre+" ";
		cad+=precio+" ";
		return cad;
	}
	public double calcular(int cantidad) {
		return precio*cantidad;
	}
}
