package interfaces2;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		Futbolista[] futbolistas=new Futbolista[5];
		futbolistas [0]=new Futbolista(44,"fff",12,8);
		futbolistas [1]=new Futbolista(50,"aaa",12,8);
		futbolistas [2]=new Futbolista(50,"fff",12,8);
		futbolistas [3]=new Futbolista(50,"fff",12,8);
		futbolistas [4]=new Futbolista(10,"aaa",12,8);
		
		Arrays.sort(futbolistas);
		for(Futbolista f: futbolistas) {
			System.out.println(f);
		}
	}

}
