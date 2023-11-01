package jdbc.dataacess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	public static final String DRIVER_CLASS_NAME ="oracle.jdbc.driver.OracleDriver";
	public static final String URL ="jdbc:oracle:thin:@localhost:1521:XE";
	public static final String USER_NAME ="SYSTEM";
	public static final String PASSWORD ="Logesh@11";
	public static final String CREATE_QUERY = "CREATE TABLE LOGESH.PRODUCT("
										+ "PRODUCTID NUMBER,"
            							+ "PRODUCT VARCHAR2(20),"
            							+ "PRODUCTPRICE NUMBER(4,2))";
	public static final String INSERT_QUERY = "INSERT INTO LOGESH.PRODUCT VALUES("
			+ "1234,"
			+ "'"
			+ "LAPTOP"
			+ "',"
			+ "25.45)";
	public static final String SELECT_QUERY ="SELECT * FROM LOGESH.PRODUCT";
	public static final String UPDATE_QUERY ="UPDATE LOGESH.PRODUCT SET PRODUCT='headphones' WHERE PRODUCTID=3456 ";
	public static final String DELETE_QUERY ="DELETE FROM LOGESH.PRODUCT WHERE PRODUCTID=2345";
	
	public static Statement ConnectionandStatement() throws ClassNotFoundException, SQLException{
    
		Connection con = null;
    	Statement statement = null;
    	
//			STEP 1: Register the driver class
    		Class.forName(DRIVER_CLASS_NAME);
    		
//    		STEP 2: Create the Connection
    		con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
        	if(con!= null) System.out.println("Connection SUccesfull..!!");
        	else System.out.println("Conection Failed..!!");
        	
//        	STEP 3; Create the Statement
        	statement =con.createStatement();
        	
        	return statement;
        	
    }
	public static void main( String[] args ) throws SQLException
    {
		try {
			int rows;
			Statement statement;
			// STEP :2&3 CREATE CONNECTION AND STATEMENT 
			statement = ConnectionandStatement();
			// USer Option
			while(true) {
			System.out.println("1.CREATE_TABLE\n"
					+ "2.LOADTABLE \n"
					+ "3.READ \n"
					+ "4.UPDATE \n"
					+ "5.DELETE \n"
					+ "6.EXIT ");
			System.out.println("User Choice");
			int option = new Scanner(System.in).nextInt();
			// STEP 4: Execute the Query Statement 
			if(option==1)statement.execute(CREATE_QUERY);
			else if (option==2) statement.execute(INSERT_QUERY);
			else if(option==3) {
				ResultSet rs = statement.executeQuery(SELECT_QUERY);
				while(rs.next()) {
					System.out.println(rs.getInt(1)+"|"+ rs.getString(2)+"|" +rs.getFloat(3));
				}
			}
			else if(option==4) {
				 rows = statement.executeUpdate(UPDATE_QUERY);
				if(rows>0)System.out.println("Product is Updated");
				else System.out.println("Please check...!");
				}
			else if(option==5){
				rows = statement.executeUpdate(DELETE_QUERY);
				if(rows>0)System.out.println("Record deleted");
				else System.out.println("Please check again");	 
			}
			else if(option==6) {
				System.out.println("Thank you..!!");
				break;
			}
			}
		} catch (ClassNotFoundException e) {
		System.out.println(e.getMessage());
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}finally {
//	    	STEP 5: Close the Connection
			
//			statement.close();
		}
    }
}
