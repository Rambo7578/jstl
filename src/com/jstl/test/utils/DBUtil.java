package com.jstl.test.utils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {
	public static void closeAll(ResultSet rs,PreparedStatement ps,Connection con) {
		if(rs!=null) {
		DBUtil.close(rs);
		}
		DBUtil.close(ps);
		DBUtil.close(con);
		
	}
	
	
	public static void close(ResultSet rs) {
		try {
			if(rs!=null) {
			rs.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void close(Connection con) {
		try {
			if(con!=null) {
				con.close();
				}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void close(PreparedStatement ps) {
		try {
			if(ps!=null) {
				ps.close();
				}
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
