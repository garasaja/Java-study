package array03;

public class Coin {
//���� ������ ������ ���ϴ� ���α׷�
	public static void main(String[] args) {
		int money = 2680;
		int count = 0;
		int coin[] = {500,100,50,10};
		/*System.out.println("���۱ݾ�" + money);
		System.out.println(" ");
		count = money/500;
		money = money %500;
		System.out.println("500��������:" + count);
		System.out.println("��������" + money);
		System.out.println(" ");
		
		count = money/100;
		money = money %100;
		System.out.println("100��������:" + count);
		System.out.println("��������" + money);
		System.out.println(" ");
		
		count = money/50;
		money = money %50;
		System.out.println("50��������:" + count);
		System.out.println("��������" + money);
		System.out.println(" ");
		
		count = money/10;
		money = money %10;
		System.out.println("10��������:" + count);
		System.out.println("��������" + money);
		System.out.println(" ");*/
		
		for(int i=0;i<coin.length;i++)
		{			
			count = money/coin[i];
			money = money %coin[i];
			System.out.println(coin[i]+"��������:" + count);
			System.out.println("��������" + money);
			System.out.println(" ");		
		}

	}

}
