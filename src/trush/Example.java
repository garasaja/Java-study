package trush;

import java.text.DecimalFormat;

//import java.text.DecimalFormat;

public class Example {

	public static void main(String[] args) {
		char arr[] = {'가','나','다','라','마'};
		char arr2[] = new char[arr.length];
		
		for(int i=arr.length;i>0;i--)
		{						
			System.out.print(arr[i-1] + " ");
		}
		System.out.print("\n");		
		System.out.println("------------------------------");
		
		
		for(int i=0;i<arr.length;i++)
		{			
			arr2[i] = arr[arr.length-1-i];
			System.out.print(arr2[i] + " ");		
		}
		System.out.print("\n");		
		System.out.println("------------------------------");
		
	
		DecimalFormat dc = new DecimalFormat("###,###,###,###");		
		int num = 1000000000;
		String ch = dc.format(num);
		
		System.out.println(ch);
		
	}

}
