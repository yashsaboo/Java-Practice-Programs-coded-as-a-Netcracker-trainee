package com.netcracker;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class FunctionDemo {

	public static void main(String[] args) throws SQLException {
		try(Connection con = DBUtil.getInstance().getConnection())
		{
			CallableStatement cs = con.prepareCall("{ ? = call sysdate}");
			cs.registerOutParameter(1, Types.VARCHAR);
			
			cs.execute();
			
			System.out.println(cs.getString(1));
			
		}
	}

}
