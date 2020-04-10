package animal;

interface Cal {//변수 : public static final 생략
				//함수 : public abstract 생략
				//통로의 역할 - 동적바인딩
				//무조건 추상메서드만 존재가능 = 강제성부여
				//new 할 수 없다.
	public static final int num = 10;
}

public class InterfaceEx01 {

	public static void main(String[] args) {
		System.out.println(Cal.num);

	}

}
