package ch16db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SelectEx02 {

	//select * from users;
	
	public static void main(String[] args) {
		try {
	
			final String SQL = "SELECT ID, NAME , EMAIL, PASSWORD FROM USERS";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ssar","bitc5600");//��Ʈ������
			PreparedStatement pstmt = conn.prepareStatement(SQL);//���۴ޱ� �Ľ� ������ �ϴ� �� ����(?�� ����ϰ� ����)
			//pstmt.setInt(1, 3);//db�� 1���� ����
			ResultSet rs = pstmt.executeQuery();//���� �Է� , ResultSet���� ����
			List<Users> users = new ArrayList<>();
			//Users users = null;
			while(rs.next()) {//2�� �̻��϶��� while�� �����°Ŵ�
				Users user = new Users(rs.getInt("id"),
										rs.getString("name"),
										rs.getString("email"),
										rs.getString("password")
						          	   );
				users.add(user);
			}
			
			for (Users user : users) {
				System.out.println(user.getId());
				System.out.println(user.getName());
				System.out.println(user.getEmail());
				System.out.println(user.getPassword());
				System.out.println();
			}				
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
