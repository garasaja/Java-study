package array03;

import java.util.Scanner;

public class ArrayEx07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("6�ڸ� ���ڸ� �Է��ϼ���");
		int num = sc.nextInt();
		
		String strnum = num+"";
		//System.out.println(strnum.charAt(3));
		//System.out.println(strnum.length());
		boolean check = false;
		for(int i=0;i<strnum.length();i++)
		{
			if(strnum.charAt(i)=='3')
			{
				check = true;
			}
			
			
			
		}
	if(check ==true)
		System.out.println("3����");
	else System.out.println("3����");

	}

}
