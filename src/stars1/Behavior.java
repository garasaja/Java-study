package stars1;

// �������̽��� �߻� Ŭ������ ����
// �ٸ��� : �߻� �޼��常 ���簡��
// ���� ���ε��� ��ηθ� ���
// �޼��忡 public abstract�� ��������
// �����ڿ� �̿����� ��� - Ű���忡�� a�� ������ �۵������� ���� ��ǻ�Ϳ� a�� �Էµȴ�
// �������� : ������ ������ ��ȣ �����Ͽ� �̷���� ���
// �������̽� : �����ڰ� ������ �˷��ְ� �̿��ڰ� ����ϴ� ���� ���

public interface Behavior {
	public abstract void move();

	public void repair();

	void attack(Behavior unit);
	
	public String getName();
	
	public int getHp();
	
	public void setHp(int hp);
}

