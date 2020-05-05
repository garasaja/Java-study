package ch16db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectEx01 {

	
	public SelectEx01() {
		
	}
	public static void main(String[] args) {
		try {
	
			final String SQL = "SELECT ID, NAME , EMAIL, PASSWORD FROM USERS WHERE ID = ?";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ssar","bitc5600");//��Ʈ������
			PreparedStatement pstmt = conn.prepareStatement(SQL);//���۴ޱ� �Ľ� ������ �ϴ� �� ����(?�� ����ϰ� ����)
			pstmt.setInt(1, 3);//db�� 1���� ����
			ResultSet rs = pstmt.executeQuery();//���� �Է� , ResultSet���� ����
			Users users = null;
			while(rs.next()) {
				users = new Users(rs.getInt("id"),
						          rs.getString("name"),
						          rs.getString("email"),
						          rs.getString("password")
						          );
			}
				System.out.println(users.getId());
				System.out.println(users.getName());
				System.out.println(users.getEmail());
				System.out.println(users.getPassword());
			
			
			//System.out.println("delete �Ϸ�");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
