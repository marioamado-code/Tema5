package analisis.ejercicio2;

public class Revista extends Ficha{
private int año;
private int numeroRevista;
public Revista(int año,int numeroRevista,int numero,String titulo){
	super(numero,titulo);
	if(año>0) {
		this.año=año;
	}
	if(numeroRevista>0) {
		this.numeroRevista=numeroRevista;
		
	}
}
public int getNumeroRevista() {
	return numeroRevista;
}
public int getAño() {
	return año;
}
void prestar() {
	System.out.println("El préstamo dura 10 días");
}
@Override
public String toString() {
	return super.toString()+", año " +año+",número de revista "+numeroRevista;
}
}


