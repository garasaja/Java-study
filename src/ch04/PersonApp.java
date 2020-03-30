package ch04;

public class PersonApp {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "ÃÖ½ÂÈñ";
		p1.job = "ÀÇ»ç";
		p1.age = 45;
		p1.gender = '¿©';
		p1.bloodType = "A";
		
		Person p2 = new Person();
		p2.name = "ÀÌ¹Ì³à";
		p2.job = "°ñÇÁ ¼±¼ö";
		p2.age = 28;
		p2.gender = '¿©';
		p2.bloodType = "O";
		
		Person p3 = new Person();
		p3.name = "±è¹Ì³²";
		p3.job = "±³¼ö";
		p3.age = 47;
		p3.gender = '³²';
		p3.bloodType = "AB";
		
		Person p4 = new Person("¤¾¤·","¤»¤»","¿Ö±×·¡",45,'c');
		
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
