package daointerface;

import java.sql.SQLException;

import votingexception.VotingException;

public interface CandidateDao {
	void changeCandi(int id,String name) throws SQLException, VotingException;
	void changeParty(int id,String party) throws SQLException, VotingException;
}
