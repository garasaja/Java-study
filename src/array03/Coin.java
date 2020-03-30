package array03;

public class Coin {
//남은 동전의 개수를 구하는 프로그램
	public static void main(String[] args) {
		int money = 2680;
		int count = 0;
		int coin[] = {500,100,50,10};
		/*System.out.println("시작금액" + money);
		System.out.println(" ");
		count = money/500;
		money = money %500;
		System.out.println("500원갯수는:" + count);
		System.out.println("남은돈은" + money);
		System.out.println(" ");
		
		count = money/100;
		money = money %100;
		System.out.println("100원갯수는:" + count);
		System.out.println("남은돈은" + money);
		System.out.println(" ");
		
		count = money/50;
		money = money %50;
		System.out.println("50원갯수는:" + count);
		System.out.println("남은돈은" + money);
		System.out.println(" ");
		
		count = money/10;
		money = money %10;
		System.out.println("10원갯수는:" + count);
		System.out.println("남은돈은" + money);
		System.out.println(" ");*/
		
		for(int i=0;i<coin.length;i++)
		{			
			count = money/coin[i];
			money = money %coin[i];
			System.out.println(coin[i]+"원갯수는:" + count);
			System.out.println("남은돈은" + money);
			System.out.println(" ");		
		}

	}

}
