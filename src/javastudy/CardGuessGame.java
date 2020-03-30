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

		System.out.println("수를 결정하였습니다. 맞추어보세요");

		while (flag = true) {
			int myans = sc.nextInt();
			if (correct < myans) {
				count++;
				System.out.println(count + ">>더 낮게");

			} else if (correct > myans) {
				count++;
				System.out.println(count + ">>더 높게");

			} else if (correct == myans) {
				count = 0;
				System.out.println(">>맞았습니다.");
				flag = true;
				break;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// int back = 1;
		System.out.println("프로그램 시작");
		String back = "y";
		boolean a = true;
		while (a) {

			calc();

			boolean aa = true;
			while (aa) {
				System.out.println(" 다시 하시겠습니까? y: 다시함 n: 종료");

				back = sc.next();

				if (back.equals("n")) {
					a = false;
					aa = false;
					
				} else if (back.equals("y")) {
					a = true;
					aa = false;
					
				} else {
					System.out.println("잘못된 입력입니다. 다시 입력하세요");
				}

			}

		}
		System.out.println("프로그램을 종료합니다.");

	}
}
