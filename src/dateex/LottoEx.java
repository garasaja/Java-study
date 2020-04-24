package dateex;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoEx {
	public static void main(String[] args) {
		int a[] = new int[6];
		
		Random r1 = new Random();
		for (int i = 0; i < a.length; i++) {
			System.out.print((r1.nextInt(45)+1) +" " );
		}
		System.out.println();
		
		
		System.out.println("--------------------");
		
		Set<Integer> lottoSet = new HashSet<>(); 
		Random r = new Random();
		while(lottoSet.size()<6) {
			int value = r.nextInt(45)+1;
			lottoSet.add(value);
		}
		
		System.out.println(lottoSet);
		
	}
}
