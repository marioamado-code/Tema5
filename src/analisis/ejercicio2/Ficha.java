package analisis.ejercicio2;

public abstract class Ficha {
private int numero;
private String titulo;
public Ficha(int numero,String titulo) {
	if(numero>0) {
		this.numero=numero;
	}
	if(titulo!=null&&!titulo.isBlank()) {
		this.titulo=titulo;
	}
	
}
	public String getTitulo() {
		return titulo;
	}
	public int getNumero() {
		return numero;
	}
	@Override
	public String toString() {
		return "Número " +numero+",título "+titulo;
	}
	abstract void prestar();
}
