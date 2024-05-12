package com.account;
import java.sql.*;
import static com.app.utils.DBUtils.*;

public class AccountImpl implements AccountDao{

	
	private Connection con;
	private CallableStatement calls1;
	
	public AccountImpl() throws SQLException {
		con= openConnection() ;
		
//		create Call stemt to invoke stored procedure.
		calls1=con.prepareCall("{call transfer_funds_proc(?,?,?,?,?)}");
		calls1.registerOutParameter(4, Types.DOUBLE);
		calls1.registerOutParameter(5, Types.DOUBLE);
		System.out.println("Account dao created");
		
	}
	@Override
	public String transferFunds(int srcAcNo, int descANo, double amount) throws SQLException {
		
//		set IN params
		calls1.setInt(1, srcAcNo);
		calls1.setInt(2, descANo);
		calls1.setDouble(3, amount);
//		execute the procedure
		calls1.execute();
		return "Updated src balance "+calls1.getDouble(4)+" Destination balance "+calls1.getDouble(5);
		
	}

}
