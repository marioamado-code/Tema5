package parte1.ejercicio3;

public class NoPerecedero extends Producto{
private String tipo;
public NoPerecedero(String tipo,String nombre,double precio) {
	super(nombre, precio);
	if(!tipo.isBlank()&&tipo!=null) {
		this.tipo=tipo;
	}
	
}
public String getTipo() {
	return tipo;
}

public void setTipo(String tipo) {
	this.tipo=tipo;
}
@Override
public String toString() {
	String cad="";
	cad+=tipo+" ";
	return super.toString() + cad;
}
}
