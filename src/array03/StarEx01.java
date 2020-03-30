package array03;

public class StarEx01 {

	static void printStars(int i) {
		for (int j = 0; j < i; j++) 
		{
			System.out.print("*");
		}
			System.out.println();
	}
	public static void main(String[] args) {
		for(int i=5;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		/*
		 * for(int i=1;i<5;i++) { printStars(i); }
		 */
		/*for(int i=1;i<10;i++)
		{
			for(int j=10-i;j<10;j++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
		}*/

	}

}
