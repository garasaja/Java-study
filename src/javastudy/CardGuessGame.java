package javastudy;

import java.util.Random;
import java.util.Scanner;

public class CardGuessGame {

	static void calc() {
		Random r = new Random();
		int correct = r.nextInt(100);
		int count = 0;
		Scanner sc = new Scanner(System.in);
		boolean flag = false;

		System.out.println("���� �����Ͽ����ϴ�. ���߾����");

		while (flag = true) {
			int myans = sc.nextInt();
			if (correct < myans) {
				count++;
				System.out.println(count + ">>�� ����");

			} else if (correct > myans) {
				count++;
				System.out.println(count + ">>�� ����");

			} else if (correct == myans) {
				count = 0;
				System.out.println(">>�¾ҽ��ϴ�.");
				flag = true;
				break;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// int back = 1;
		System.out.println("���α׷� ����");
		String back = "y";
		boolean a = true;
		while (a) {

			calc();

			boolean aa = true;
			while (aa) {
				System.out.println(" �ٽ� �Ͻðڽ��ϱ�? y: �ٽ��� n: ����");

				back = sc.next();

				if (back.equals("n")) {
					a = false;
					aa = false;
					
				} else if (back.equals("y")) {
					a = true;
					aa = false;
					
				} else {
					System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��ϼ���");
				}

			}

		}
		System.out.println("���α׷��� �����մϴ�.");

	}
}
