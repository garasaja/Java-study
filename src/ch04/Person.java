package ch04;
//state�� �ൿ
public class Person {
	String name;
	String job;
	String bloodType;
	int age;
	char gender;
	
	public Person() {//Ŭ���� �̸��� �Ȱ��� �Լ��� �����ڶ�� �Ѵ�. �����ڴ� �ʱ�ȭ�Ҷ� ����Ѵ�.�Ű������� ������ ����Ʈ �����ڶ���Ѵ�.
		
	}
	
	//alt + shift + s +o ������ ����Ű
	//alt + shift + s +r ������ �Լ� ����Ű

	public Person(String name, String job, String bloodType, int age, char gender) { //�����ε�
		
		this.name = name;
		this.job = job;
		this.bloodType = bloodType;
		this.age = age;
		this.gender = gender;
	}
	
	/*public Person() { 
		System.out.println("����Ѹ� ź��");
	}*/
	
	
	
}
