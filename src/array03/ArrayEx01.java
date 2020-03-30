package array03;

public class ArrayEx01 {

	public static void main(String[] args) {
		int num =0;
		for (int i = 2; i < 20000000; i=i*2) {
			num++;
			System.out.println("2ÀÇ " + num + "½Â : " +i);
		}
		System.out.println("-------------------------");
		int i = 0;
		while (i < 10) {
			i++;
			System.out.println(i);
		}

		

	}

}
