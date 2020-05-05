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
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ssar","bitc5600");//스트림연결
			PreparedStatement pstmt = conn.prepareStatement(SQL);//버퍼달기 파싱 여러번 하는 거 방지(?를 사용하게 해줌)
			pstmt.setInt(1, 3);//db는 1부터 시작
			ResultSet rs = pstmt.executeQuery();//버퍼 입력 , ResultSet리턴 받음
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
			
			
			//System.out.println("delete 완료");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
