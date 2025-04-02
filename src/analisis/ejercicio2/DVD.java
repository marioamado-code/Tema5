package analisis.ejercicio2;

public class DVD extends Ficha {
private String director;
private int año;
private enum Tipo{PELICULA,DOCUMENTAL,SERIE};
private Tipo tipo;
public DVD(String director,int año,String  tipo,int numero,String titulo) {
	super(numero,titulo);
	if(director!=null&&!director.isBlank()) {
		this.director=director;
	}
	if(año>0) {
		this.año=año;
	}
	switch(tipo.toUpperCase()) {
	case "PELICULA","DOCUMENTAL","SERIE"->{
		this.tipo=Tipo.valueOf(tipo);
	}
	}
	
}
public String getDirector() {
	return director;
}
public int getAño() {
	return año;
}
@Override
public String toString() {
	return super.toString()+", director " +director+",año "+año+", tipo "+tipo;
}
void prestar() {
System.out.println("El préstamo dura 5 días");
}
}
