package parte1.ejercicio1;

public class PrincipalHoras {

	public static void main(String[] args) {
		

HoraExacta hE=new HoraExacta(12,33,44);
hE.inc();
System.out.println(hE);
Hora h=new Hora(20,23);
h.inc();
System.out.println(h);
	}

}
