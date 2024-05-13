package daoimplclass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import static connnection.MakeConnection.getConn;
import daointerface.CandidateDao;
import votingexception.VotingException;

public class CandidateDaoClass implements CandidateDao {
	private Connection conn;
	private PreparedStatement pst1,pst2;
	public CandidateDaoClass() throws SQLException {
		conn = getConn();
		pst1 = conn.prepareStatement("Update candidates set name=? where id=?");
		pst2 = conn.prepareStatement("Update candidates set party=? where id=?");
		
	}
	@Override
	public void changeCandi(int id, String name) throws SQLException, VotingException {
		pst1.setString(1, name);
		pst1.setInt(2, id);
		try {
			int res= pst1.executeUpdate();
			if(res>0) {
				System.out.println("Name Changed....");
			}
			else {
				throw new VotingException("Else Invalid Id");
			}
			
		}
		catch(Exception e){
			throw new VotingException("Invalid ID");
		}
		
		
	}

	@Override
	public void changeParty(int id, String party) throws SQLException, VotingException {
		pst2.setString(1, party);
		pst2.setInt(2, id);
		
		try {
			int res= pst2.executeUpdate();
			if(res>0) {
				System.out.println("Name Changed....");
			}
			else {
				throw new VotingException("Else Invalid Id");
			}
			
		}
		catch(Exception e){
			throw new VotingException("Invalid ID");
		}
		
		
	}

}
