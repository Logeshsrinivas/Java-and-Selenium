package jdbc.hrdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Hrdatabase {
	public static final String DRIVER_CLASS_NAME ="oracle.jdbc.driver.OracleDriver";
	public static final String URL ="jdbc:oracle:thin:@localhost:1521:XE";
	public static final String USER_NAME ="SYSTEM";
	public static final String PASSWORD ="Logesh@11";
	public static final String SELECT_QUERY ="SELECT FIRST_NAME,LAST_NAME,JOB_ID,DEPARTMENT_ID,SALARY FROM LOGESH.EMPLOYEES WHERE JOB_ID ='ST_CLERK'";
	public static final String DELETE_QUERY ="DELETE FROM LOGESH.EMPLOYEES WHERE DEPARTMENT_ID=80 AND JOB_ID='AD_VP'";


	public static Statement ConnectionandStatement() throws ClassNotFoundException, SQLException{
	    
		Connection con = null;
		Statement statement = null;
		
											    // Register the driver class
			Class.forName(DRIVER_CLASS_NAME);
			
											    // Create the Connection
			con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
	    	if(con!= null) System.out.println("Connection SUccesfull..!!");
	    	else System.out.println("Conection Failed..!!");
	    	
	    										// Create the Statement
	    	statement =con.createStatement();
	    	
	    	return statement;
	}
	public static void main( String[] args ) throws SQLException
	{
		try {
			Statement statement;
									// CREATE CONNECTION AND STATEMENT 
			statement = ConnectionandStatement();
									// USer Option
			while(true) {
			System.out.println("1.To delete employee whose department is 80 and job_id is'AD_VP\n"
					+ "2.Display employee details whose job_id is 'ST_CLERK'\n"
					+ "3.Exit ");
			System.out.println("User Choice");
			int option = new Scanner(System.in).nextInt();
									//  Execute the Query Statement 
			if(option==2) {
				ResultSet rs = statement.executeQuery(SELECT_QUERY);
				while(rs.next()) {
					System.out.println(rs.getString(1)+"|"+ rs.getString(2)+"|" +rs.getString(3)+"|"+rs.getInt(4)+"|"+rs.getInt(5));
			}
			}
			else if (option==1) {
				int rows;
				rows = statement.executeUpdate(DELETE_QUERY);
				if(rows>0)System.out.println("Record deleted");
				else System.out.println("Please check again");	
			}else if (option==3) {
				break;
			}
			}
		}catch (ClassNotFoundException e) {
		System.out.println(e.getMessage());
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	}
		

