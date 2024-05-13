package daointerface;

import java.sql.SQLException;

import pojoclasses.User;
import votingexception.VotingException;

public interface UserDao {
	User signIn(String mail,String pass) throws SQLException, VotingException;
	void vote(String mail,String pass,int id) throws SQLException, VotingException;
	
}
