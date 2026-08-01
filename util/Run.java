package project.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Run {

	public static void main(String[] args) {
		String sql = "SELECT PLAN_ID, PLAN_TITLE FROM PLAN WHERE PLAN_ID = 1";
		
		try (Connection conn = DBUtil.getConnecion()) {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				System.out.printf("ID: %d, Title: %s", rs.getInt("PLAN_ID"), rs.getString("PLAN_TITLE"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
