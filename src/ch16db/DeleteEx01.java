package ch16db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteEx01 {

	
	public DeleteEx01() {
		
	}
	public static void main(String[] args) {
		try {
			final String SQL = "DELETE FROM USERS WHERE ID = ?";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ssar","bitc5600");//��Ʈ������
			PreparedStatement pstmt = conn.prepareStatement(SQL);//���۴ޱ� �Ľ� ������ �ϴ� �� ����(?�� ����ϰ� ����)
			pstmt.setInt(1, 1);//db�� 1���� ����
			pstmt.executeUpdate();//���� �Է� , COMMIT�� ��
			System.out.println("delete �Ϸ�");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
