package array03;

public class ArrayEx06 {
	public static void getPrime(int num){
        boolean flag;    //�Ҽ� �Ǻ��� ���� true/false
        int cnt = 0;     //�Ҽ��� �� ������ Ȯ���ϱ� ���� ����
        for(int i=2; i<=num; i++){    //i�� 2~num ���̿� ����
            flag = true;
            for(int j=2; j<i; j++){   //j�� i���� ���� ����
                if(i%j ==0){          //i�� j�� �������� ��, ������ �������� �Ҽ��� �ƴ�
                    flag = false;
                }
            }
            if(flag == true){
                cnt++;
                System.out.println(i); //�Ҽ��� ���� �迭�� �������� �ʰ�, ã�� �� ���� ���
            }        
        }
        System.out.println("�Ҽ� ���� : " + cnt);
    }



	public static void main(String[] args) {
		long start = System.currentTimeMillis();
        getPrime(100);
        long end = System.currentTimeMillis();
        System.out.println("���� �ð� : " + (double)(end-start)/1000 + "(s)");


			
				
		//1~100���� �Ҽ� ���ϱ�	
		/*int count;
		for(int num=2;num<=100;num++)
		{
			count=0;
			for(int j=2;j<=num;j++)
			{
				if(num%j==0)
				{	
					count++;
				}
				if(count==1)
				{
					System.out.print(num + " ");
				}
			}
		}*/
		
	}

}
