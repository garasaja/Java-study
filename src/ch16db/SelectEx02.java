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
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ssar","bitc5600");//스트림연결
			PreparedStatement pstmt = conn.prepareStatement(SQL);//버퍼달기 파싱 여러번 하는 거 방지(?를 사용하게 해줌)
			//pstmt.setInt(1, 3);//db는 1부터 시작
			ResultSet rs = pstmt.executeQuery();//버퍼 입력 , ResultSet리턴 받음
			List<Users> users = new ArrayList<>();
			//Users users = null;
			while(rs.next()) {//2건 이상일때는 while문 돌리는거다
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
