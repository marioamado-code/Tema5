package parte1.ejercicio1;

public class Hora {
private int hora;
private int minuto;
public Hora(int hora,int minuto) {
	if (hora<24 && minuto>=0) {
		this.hora=hora;
	}
	
	if(minuto<60 && minuto>=0) {
		this.minuto=minuto;
		
	}
}
	public void inc() {
		if (minuto++==60) {
			minuto=0;
			if(hora++==24) {
				hora=0;
			}
		}
	}
public boolean setMinutos(int minuto) {
	boolean res=false;
	if(minuto<60 && minuto>=0) {
		res=true;
	}
	return res;
}

@Override
public String toString() {
	String cad;
	
	
	
	cad=hora+":"+minuto;
	return cad;
}
}

