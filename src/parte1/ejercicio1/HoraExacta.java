package parte1.ejercicio1;

public class HoraExacta extends Hora {
	private int segundo;
	public HoraExacta(int hora,int minuto,int segundo) {
		super(hora,minuto);
		
		if(segundo<60 && segundo>=0) {
			this.segundo=segundo;
			
			
		}
		
	}
	public void inc() {
		if (segundo++==60) {
			segundo=0;
			super.inc();
		}
	}
public boolean setSegundos(int segundo) {
	boolean res=false;
	if(segundo<60 && segundo>=0) {
		res=true;
	}
	return res;
}

@Override
public String toString() {
	String cad;
	
	
	
	cad=":"+segundo;
	return super.toString()+cad;
}
}



