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
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ssar","bitc5600");//��Ʈ������
			PreparedStatement pstmt = conn.prepareStatement(SQL);//���۴ޱ� �Ľ� ������ �ϴ� �� ����(?�� ����ϰ� ����)
			pstmt.setInt(1, 4);//db�� 1���� ����
			pstmt.setString(2, "������");
			pstmt.setString(3, "suk@nate.com");
			pstmt.setString(4, "1234");
			pstmt.executeUpdate();//���� �Է� , COMMIT�� ��
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
