package ch04;

public class PersonApp {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "�ֽ���";
		p1.job = "�ǻ�";
		p1.age = 45;
		p1.gender = '��';
		p1.bloodType = "A";
		
		Person p2 = new Person();
		p2.name = "�̹̳�";
		p2.job = "���� ����";
		p2.age = 28;
		p2.gender = '��';
		p2.bloodType = "O";
		
		Person p3 = new Person();
		p3.name = "��̳�";
		p3.job = "����";
		p3.age = 47;
		p3.gender = '��';
		p3.bloodType = "AB";
		
		Person p4 = new Person("����","����","�ֱ׷�",45,'c');
		
		Person p5 = new Person();
		//p5.setall
		
		System.out.println(p3.name);
		System.out.println(p3.job);
		System.out.println(p3.age);
		System.out.println(p3.gender);
		System.out.println(p3.bloodType);
		System.out.println(p4);
		
	}

}
