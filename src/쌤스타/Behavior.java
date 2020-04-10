package 쌤스타;

// 추상클래스와 유사
// 추상 메서드만 존재가능.
public interface Behavior {
	public abstract void move();
	void repair();
	void attack(Behavior unit);
}
