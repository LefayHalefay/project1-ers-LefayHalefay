package com.projectone.dao;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

import com.projectone.model.EmployeeUser;
import com.projectone.model.Reimbursement;
import com.projectone.util.ConnectionUtility;

public class ReimbursementDaoJDBC implements ReimbursementDao {

	/* This an optinal feature, will be tackled if there time is left*/
	@Override
	public Reimbursement cancelRequestByEmployee(int employeeId, int requestId) {
		
		return null;
	}

	@Override
	public Reimbursement updateRequestByMgr() {
		
		Reimbursement updateReimb = new Reimbursement();
		System.out.print("What they want, TO UPDATE:");
		
		try(Connection conn = ConnectionUtility.getConnection()) {
			PreparedStatement prepStmt = conn.prepareStatement("UPDATE paymentsystems.ers_reimbursement\n" 
			+ "SET reimb_resolved=?,reimb_resolver=?, reimb_status_id=?\n" 
			+ "WHERE reimb_id = ?");
			
			prepStmt.setTimestamp(1, new Timestamp(System.currentTimeMillis()));
			prepStmt.setInt(2, updateReimb.getReimbResolverId());
			prepStmt.setInt(3, updateReimb.getReimbStatusId());
			
			prepStmt.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public int addRequestByEmployee(Reimbursement newReimb) {
		
		System.out.println("It is funny how the act now!");
		
		try(Connection conn = ConnectionUtility.getConnection()) {
			
			PreparedStatement prepStmt = conn.prepareStatement("INSERT INTO paymentsystems.ers_reimbursement(\n" 
			+ "reimb_amount, reimb_submitted, reimb_resolved, reimb_receipt, reimb_author, "
			+ "reimb_resolver, reimb_status_id, reimb_type_id, reimb_description)\n" 
			+ "	VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)", new String[] {"reimb_id"});
			
			prepStmt.setDouble(1 , newReimb.getReimbAmount());
			prepStmt.setTimestamp(2, new Timestamp(System.currentTimeMillis()));
			prepStmt.setTimestamp(3,  new Timestamp(System.currentTimeMillis()));
			prepStmt.setString(4, newReimb.getReimbReciept());
			prepStmt.setInt(5, newReimb.getReimbAuthorId());
			prepStmt.setInt(6, newReimb.getReimbResolverId());
			prepStmt.setInt(7, newReimb.getReimbStatusId());
			prepStmt.setInt(8, newReimb.getReimbTypeId());
			prepStmt.setString(9, newReimb.getReimbDescription());
			
			prepStmt.executeUpdate();
			
//			ResultSet rs = prepStmt.getGeneratedKeys();
//			if(rs.next()) {
//				int reimbId = rs.getInt("reimb_id");
//				return reimbId;
//			}
			
		}catch(SQLException e) {
			
			e.printStackTrace();
		}
		
		
		return 0;
	}

	@Override
	public List<Reimbursement> findRequestAllEmployees() {
		
		try(Connection conn = ConnectionUtility.getConnection()){
			
			PreparedStatement prepStmt = conn.prepareStatement("SELECT * FROM ers_reimbursement");
			
			ResultSet rstSet = prepStmt.executeQuery();
			
			List<Reimbursement> reimbursementRqt = new ArrayList<>();
			
			while(rstSet.next()) {
				reimbursementRqt.add(new Reimbursement(rstSet.getInt("reimb_id"),rstSet.getDouble("reimb_amount"), 
				rstSet.getTimestamp("reimb_submitted"),rstSet.getTimestamp("reimb_resolved"), rstSet.getString("reimb_receipt"), 
				rstSet.getInt("reimb_author"), rstSet.getInt("reimb_resolver"), rstSet.getInt("reimb_status_id"), 
				rstSet.getInt("reimb_type_id"), rstSet.getString("reimb_description")));
			}
			
			return reimbursementRqt;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<Reimbursement> findAllRequestsForEmployee(int reimbAuthorId) {
		
		try(Connection conn = ConnectionUtility.getConnection()){
			
			List<Reimbursement> reimbursementRqt = new ArrayList<>();
			PreparedStatement prepStmt = conn.prepareStatement("SELECT * FROM ers_reimbursement WHERE reimb_author = ?");
			prepStmt.setInt(1, reimbAuthorId);
			
			ResultSet rstSet = prepStmt.executeQuery();
	
			while(rstSet.next()) {
					reimbursementRqt.add(new Reimbursement(rstSet.getInt("reimb_id"),rstSet.getDouble("reimb_amount"), 
					rstSet.getTimestamp("reimb_submitted"),rstSet.getTimestamp("reimb_resolved"), rstSet.getString("reimb_receipt"), 
					rstSet.getInt("reimb_author"), rstSet.getInt("reimb_resolver"), rstSet.getInt("reimb_status_id"), 
					rstSet.getInt("reimb_type_id"), rstSet.getString("reimb_description")));		
			}
			
			return reimbursementRqt;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return null;
	}
}