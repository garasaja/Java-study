package array03;

public class Gugudan {

	public static void main(String[] args) {
		for(int i=1;i<10;i++)
		{
			for(int j=10-i;j<10;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		
		/*
		
		  int[][] gugudan = new int[10][10]; 
		  for(int i=2;i<gugudan.length;i++) 
		  {
		  System.out.println("구구단 " + i + "단"); 
		  		for(int j=1;j<gugudan[i].length;j++) 
		  		{
		  			gugudan[i][j] = i*j; 
		  			System.out.print(i + " * " + j + " = " + i*j + "   ");
		  			if(j==9) 
		  			{ 
		  				System.out.println("\n"); 
		  			} 
		  		} 
		  }*/
		 
		/*System.out.print(" ");
		for (int i = 1; i < 10; i++) 
		{
			for (int j = 2; j < 10; j++) 
			{
				System.out.print(j + " * " + i + " = " + i * j + " ");
			}
			System.out.print(" ");
			System.out.print(" \n ");
		}*/
	}

}
