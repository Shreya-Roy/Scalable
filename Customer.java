package Jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Customer 
{
	public Connection connect() throws ClassNotFoundException, SQLException 
	{
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/Customer";
		String userName = "root";
		String password = "password";
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(url, userName, password);
		return conn;	
	}
	
	public void select()
	{
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select * from CustomerInfo";
		try
		{
			conn = connect();
			if(null != conn)
			{
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				
				while(rs.next())
				{
					System.out.println("id:" + rs.getInt(1) + ",name: " + rs.getString(2) + ",address: " + rs.getString(3));
				}
			}
		}
		catch (ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				rs.close();
				stmt.close();
				conn.close();
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
		}	
	}
	
	public void selectWithWhere(String condition)
	{
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select * from CustomerInfo where address = '" + condition + "'";
		try
		{
			conn = connect();
			if(null != conn)
			{
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				
				while(rs.next())
				{
					System.out.println("id:" + rs.getInt(1) + ",name: " + rs.getString(2) + ",address: " + rs.getString(3));
				}
			}
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				rs.close();
				stmt.close();
				conn.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public void insert(int cust_id , String cust_name , String cust_add , Connection conn)
	{
		PreparedStatement pstmt = null;
		String sql = "insert into CustomerInfo values(?,?,?)";
		try
		{
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,cust_id);
			pstmt.setString(2, cust_name);
			pstmt.setString(3, cust_add);
			int count = pstmt.executeUpdate();
			
			System.out.println("No of rows inserted = " + count);
		}
		catch (SQLException e)
		{
			e.printStackTrace();
			System.out.println("SQL State " + e.getSQLState());
		}
		finally
		{
			try
			{
				pstmt.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public void update()
	{
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "update CustomerInfo set address = ? where name = ? ";
		try
		{
			conn = connect();
			if(null != conn)
			{
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, "Kochi");
				pstmt.setString(2, "Sahil");
				pstmt.executeUpdate();
			}
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				pstmt.close();
				conn.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public void delete()
	{
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "delete from CustomerInfo where id = ?";
		try
		{
			conn = connect();
			if(null != conn)
			{
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, 3);
				pstmt.execute();
			}
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				pstmt.close();
				conn.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
	}
}
