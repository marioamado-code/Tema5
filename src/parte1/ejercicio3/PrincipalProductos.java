package parte1.ejercicio3;

public class PrincipalProductos {

	public static void main(String[] args) {
		Producto p1=new Producto("pera",55);
		Producto p2=new NoPerecedero("fruta","manzana",88);
		
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1.calcular(5));
		System.out.println(p2.calcular(33));

	}

}
