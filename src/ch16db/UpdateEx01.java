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
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ssar","bitc5600");//��Ʈ������
			PreparedStatement pstmt = conn.prepareStatement(SQL);//���۴ޱ� �Ľ� ������ �ϴ� �� ����(?�� ����ϰ� ����)
			pstmt.setString(1, "5678");//db�� 1���� ����
			pstmt.setInt(2, 2);
			pstmt.executeUpdate();//���� �Է� , COMMIT�� ��
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
