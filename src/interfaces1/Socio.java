package interfaces1;

public class Socio implements Comparable<Socio> {
    private int id;
    private String nombre;
    private int edad;

    // Constructor con parámetros
    public Socio(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método toString para mostrar la información del socio
    @Override
    public String toString() {
        return "Socio{id=" + id + ", nombre='" + nombre + "', edad=" + edad + "}";
    }

    // Implementación del método compareTo para ordenar por id
    @Override
    public int compareTo(Socio otroSocio) {
        return Integer.compare(this.id, otroSocio.id);
    }

    // Métodos getter para acceder a los atributos (si es necesario)
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}


	
