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
public class Account 
{
	public static final String DRIVER_CLASS_NAME ="oracle.jdbc.driver.OracleDriver";
	public static final String URL ="jdbc:oracle:thin:@localhost:1521:XE";
	public static final String USER_NAME ="SYSTEM";
	public static final String PASSWORD ="Logesh@11";
	public static final String CREATE_QUERY = "CREATE TABLE LOGESH.Account("
										+ "ACCOUNTID NUMBER PRIMARY KEY,"
            							+ "ACCOUNTHOLDERNAME VARCHAR2(20),"
            							+ "BALANCE NUMBER(10,2))";
	public static final String insertQuery(int accountID,String AccountName,double balance) {
	 String INSERT_QUERY = "INSERT INTO LOGESH.ACCOUNT VALUES("
			+ ""+accountID+","
			+ "'"
			+ AccountName
			+ "',"
			+ ""+balance+")";
	 	return INSERT_QUERY;
	}
	public static final String select() {
	String SELECT_QUERY ="SELECT * FROM LOGESH.ACCOUNT";
	return SELECT_QUERY;
	}
	public static String updateQuery(int accountID,double balance) {
	 String UPDATE_QUERY ="UPDATE LOGESH.ACCOUNT SET BALANCE = "+balance+" WHERE ACCOUNTID="+accountID;
	 return UPDATE_QUERY;
	 
	}
	public static String deleteQuery(int accountID) {
	 String DELETE_QUERY ="DELETE FROM LOGESH.ACCOUNT WHERE ACCOUNTID="+accountID;
	 return DELETE_QUERY;
	}
	static Scanner sc = new Scanner(System.in);
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
			if(option==1) {
				statement.execute(CREATE_QUERY);
				System.out.println("Tabel Created");
			}
			else if (option==2) {
				System.out.println("Enter Account ID");
				int a1 = sc.nextInt();
				System.out.println("Enter Account holder name");
				String s1 = sc.next();
				System.out.println("Enter amount");
				double b1 = sc.nextDouble();
				statement.execute(insertQuery(a1, s1, b1));
			}
			else if(option==3) {
				ResultSet rs = statement.executeQuery(select());
				while(rs.next()) {
					System.out.println(rs.getInt(1)+"|"+ rs.getString(2)+"|" +rs.getFloat(3));
				}
			}
			else if(option==4) {
				System.out.println("Enter Account ID");
				int a1 = sc.nextInt();
				System.out.println("Enter amount");
				double b1 = sc.nextDouble();
				 rows = statement.executeUpdate(updateQuery(a1,b1));
				if(rows>0)System.out.println("Product is Updated");
				else System.out.println("Please check...!");
				}
			else if(option==5){
				System.out.println("Enter Account ID");
				int a1 = sc.nextInt();
				rows = statement.executeUpdate(deleteQuery(a1));
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
