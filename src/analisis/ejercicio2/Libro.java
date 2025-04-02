package analisis.ejercicio2;

public class Libro extends Ficha {
private String autor;
private String editorial;
public Libro(String autor,String editorial,int numero,String titulo) {
	super(numero,titulo);
	if(autor!=null&&!autor.isBlank()) {
		this.autor=autor;
	}
	if(editorial!=null&&!editorial.isBlank()) {
		this.editorial=editorial;
	}
}
public String getAutor() {
	return autor;
}
public String getEditorial() {
	return editorial;
}
void prestar() {
	System.out.println("El préstamo dura 15 días");
}
@Override
public String toString() {
	return super.toString()+", autor " +autor+",editorial "+editorial;
}
}
