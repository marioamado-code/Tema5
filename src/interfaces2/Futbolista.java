package interfaces2;



public class Futbolista implements Comparable<Futbolista>{

	private int numCamiseta;
	private String nombre;
	private int edad;
	private int numGoles;
	
	public Futbolista(int numCamiseta,String nombre,int edad,int numGoles) {
		if(numCamiseta<100&&numCamiseta>0)
		this.numCamiseta=numCamiseta;
		if(!nombre.isBlank()&&!nombre.isEmpty())
			this.nombre=nombre;
		if(edad>0){
			this.edad=edad;
		}
		if(numGoles>0)
			this.numGoles=numGoles;
		
	}
	public String getNombre() {
		return nombre;
	}
	public int getNumCamiseta() {
		return numCamiseta;
	}
	 @Override
	    public String toString() {
	        return "Futbolista: "+nombre+" ,con dorsal "+numCamiseta+" ,de "+edad+" años y "+numGoles+" goles";
	    }
	 @Override
	 public boolean equals(Object objeto){ // compara this con objeto
	 	boolean iguales = false;
	 Futbolista otraPersona = (Futbolista) objeto; // realizamos un cast
	 	if(this.nombre.equals(otraPersona.nombre) 
	 && this.numCamiseta == otraPersona.numCamiseta) {
	 			iguales = true;
	 }
	 return iguales;
	 }
public int compareTo(Futbolista f) {
	int res=0;
	
	
	res = this.numCamiseta - f.numCamiseta;
	if(res == 0) {
		res = this.nombre.compareTo(f.nombre);
	}
	
	return res;
	
}
}
