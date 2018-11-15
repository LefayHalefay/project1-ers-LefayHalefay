package com.projectone.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.projectone.model.EmployeeUser;
import com.projectone.model.Reimbursement;
import com.projectone.util.ConnectionUtility;

public class EmployeeUserDaoJDBC implements EmployeeUserDao {

	@Override
	public EmployeeUser findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeUser> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeUser findByUsernameAndPassword(String username, String password) {
		
		try (Connection conn = ConnectionUtility.getConnection()) {
			PreparedStatement ps = conn.prepareStatement(
					"SELECT * FROM ers_users INNER JOIN ers_user_roles USING (ers_user_roles_id) WHERE ers_username = ?  AND ers_password = ?");
			ps.setString(1, username);
			ps.setString(2, password);
			
			List<EmployeeUser> empUsers = new ArrayList<>();
			
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				
				//empUsers.add(new Reimbursement(rs.getString("ers_username"), rs.getString("ers_password")));
				
				
				//return empUsers;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		return null;
	}

}
