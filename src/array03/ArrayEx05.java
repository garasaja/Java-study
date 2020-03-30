package array03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ArrayEx05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count=0;
		String tempnum = num + "";
		String tempnum2[] = tempnum.split("");
		
		count = tempnum2.length;
		for(int i=0;i<tempnum2.length;i++)
		{						
			System.out.print(tempnum2[i]);
			count--;
			
			if(count%3==0 && count!=0)
			{							
				System.out.print(",");				
			}
		}
		
		//System.out.println(tempnum2[0]);
		//System.out.println("±æÀÌ : " + tempnum2.length);
		
		
		/*DecimalFormat dc = new DecimalFormat("###,###,###,###");		
		int num = 1000000000;
		String ch = dc.format(num);
		
		System.out.println(ch);*/
	}

}
