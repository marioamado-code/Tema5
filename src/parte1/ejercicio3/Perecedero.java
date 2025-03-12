package parte1.ejercicio3;

public class Perecedero extends Producto{
private int diasACaducar;
public Perecedero(int diasACaducar,double precio,String nombre) {
	super(nombre,precio);
	if(diasACaducar>0 ) {
		this.diasACaducar=diasACaducar;
	}
	
}
public int getDias() {
	return diasACaducar;
}

public void setDias(int  diasACaducar) {
	this.diasACaducar=diasACaducar;
}
@Override
public String toString() {
	String cad="";
	cad+=diasACaducar;;
	return super.toString()+cad;
}

public double calcular(int cantidad) {
    double precioFinal = super.calcular(cantidad);
    if (diasACaducar == 1) {
        precioFinal /= 4;
    } else if (diasACaducar == 2) {
        precioFinal /= 3;
    } else if (diasACaducar == 3) {
        precioFinal /= 2;
    }

    return precioFinal;
}
}
