package daoimplclass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static connnection.MakeConnection.getConn;

import daointerface.UserDao;
import enumrole.Role;
import pojoclasses.User;
import votingexception.VotingException;

public class UserDaoClass implements UserDao {
	private PreparedStatement pst1,pst2,pst3;
	
	public UserDaoClass() throws SQLException {
		Connection conn= getConn();
		pst1 = conn.prepareStatement("Select * from users where email=? and password=?");
		pst2 = conn.prepareStatement("Update users set status=1 where email=?");
		pst3 = conn.prepareStatement("Update candidates set votes = votes+1 where id=? ");
 
	}
	
	@Override
	public User signIn(String mail, String pass) throws SQLException, VotingException {
		pst1.setString(1, mail);
		pst1.setString(2, pass);
		ResultSet rs;
		
		rs = pst1.executeQuery();
		if(rs.next()) {
			System.out.println("Signed in Success....");
			Role role=Role.valueOf(rs.getString(8).toUpperCase());
			return new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),
					rs.getDate(6),rs.getInt(7),role);		
			
		}
		else {
			throw new VotingException("Invalid Credentials");
		}
	}
	@Override
	public void vote(String mail,String pass,int id) throws SQLException, VotingException  {
		
		User user = signIn(mail,pass);
		Role role = user.getRole();
		Role voter = Role.VOTER;
		if(role==voter) {
			pst2.setString(1,mail);
			pst3.setInt(1, id);
			pst2.executeUpdate();
			pst3.executeUpdate();
			
			System.out.println("Voted...");
		
		}
		else {
			throw new VotingException("Admin cannot cast a Vote...");
		}
	
		
	}
	public void cleanup() throws SQLException {
		if(pst1!=null) {
			pst1.close();
		}
	}

	

}
