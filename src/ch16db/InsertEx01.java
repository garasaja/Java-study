package ch16db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertEx01 {

	
	public InsertEx01() {
		
	}
	public static void main(String[] args) {
		try {
			final String SQL = "INSERT INTO USERS (ID,NAME,EMAIL,PASSWORD) VALUES(?,?,?,?)";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ssar","bitc5600");//스트림연결
			PreparedStatement pstmt = conn.prepareStatement(SQL);//버퍼달기 파싱 여러번 하는 거 방지(?를 사용하게 해줌)
			pstmt.setInt(1, 4);//db는 1부터 시작
			pstmt.setString(2, "석원모");
			pstmt.setString(3, "suk@nate.com");
			pstmt.setString(4, "1234");
			pstmt.executeUpdate();//버퍼 입력 , COMMIT이 됨
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
