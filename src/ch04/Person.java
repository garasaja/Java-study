package ch04;
//state와 행동
public class Person {
	String name;
	String job;
	String bloodType;
	int age;
	char gender;
	
	public Person() {//클래스 이름과 똑같은 함수를 생성자라고 한다. 생성자는 초기화할때 사용한다.매개변수가 없을땐 디폴트 생성자라고한다.
		
	}
	
	//alt + shift + s +o 생성자 단축키
	//alt + shift + s +r 생성자 함수 단축키

	public Person(String name, String job, String bloodType, int age, char gender) { //오버로딩
		
		this.name = name;
		this.job = job;
		this.bloodType = bloodType;
		this.age = age;
		this.gender = gender;
	}
	
	/*public Person() { 
		System.out.println("사람한명 탄생");
	}*/
	
	
	
}
