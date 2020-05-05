package ch16db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateEx01 {

	
	public UpdateEx01() {
		
	}
	public static void main(String[] args) {
		try {
			final String SQL = "UPDATE USERS SET PASSWORD = ? WHERE ID = ?";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ssar","bitc5600");//스트림연결
			PreparedStatement pstmt = conn.prepareStatement(SQL);//버퍼달기 파싱 여러번 하는 거 방지(?를 사용하게 해줌)
			pstmt.setString(1, "5678");//db는 1부터 시작
			pstmt.setInt(2, 2);
			pstmt.executeUpdate();//버퍼 입력 , COMMIT이 됨
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
