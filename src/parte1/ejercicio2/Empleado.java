package parte1.ejercicio2;

public class Empleado {
private String nombre;
public Empleado(String nombre) {
	if(!nombre.isBlank()&&nombre!=null) {
		this.nombre=nombre;
	}
	
}
public String getNombre() {
	return nombre;
}
@Override
public String toString() {
	String cad;
	
	
	
	cad="Empleado "+nombre;
	return cad;
}
}
