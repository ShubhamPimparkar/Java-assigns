package com.account;

import java.sql.SQLException;

public interface AccountDao {
	String transferFunds(int srcAcNo,int descANo,double amount) throws SQLException;
}
