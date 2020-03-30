package array03;

import java.util.Scanner;

public class CharTest {

	public static void main(String[] args) {
		/*int ch = 65;
		System.out.println((char)ch);
		String input = "A";
		char c = input.charAt(0);
		System.out.println((int)c);*/
		
		System.out.println("알파벳을 입력하세요");;
		Scanner sc = new Scanner(System.in);
		String first =sc.next();
		char c = first.charAt(0);
		
		for(char i=(char)(c+1);i<='Z';i++)
		{
			System.out.print(i + " ");
		}

	}

}
