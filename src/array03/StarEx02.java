package array03;

public class StarEx02 {

	static void a(int i)
	{
		
			if(i==1)
			{
				System.out.print("___");
				System.out.print("*");
				System.out.println();
			}
			if(i==2)
			{
				System.out.print("__");
				System.out.print("**");
				System.out.println();
			}
			if(i==3)
			{
				System.out.print("_");
				System.out.print("***");
				System.out.println();
			}
			if(i==4)
			{
				System.out.print("");
				System.out.print("****");
				System.out.println();
			}
			
		
	}
	public static void main(String[] args) {
		a(1);
		a(2);
		a(3);
		a(4);
		System.out.println("------------------------");
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=6-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=(i-1)*2+1;j++)
			{
			System.out.print("*");
			}
			System.out.println();
		}
		//System.out.println();
	}

}
