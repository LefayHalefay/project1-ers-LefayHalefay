package com.projectone.model;

public class EmployeeUser {
	
	private int ersUsersId;
	private String ersUserName;
	private String ersPassword;
	private String ersUserFirstName;
	private String ersUserLastName;
	private String ersUserEmail;
	private String ersUserRoleId;
	
	
	public EmployeeUser(int ersUsersId, String ersUserName, String ersPassword, String ersUserFirstName,
			String ersUserLastName, String ersUserEmail, String ersUserRoleId) {
		super();
		this.ersUsersId = ersUsersId;
		this.ersUserName = ersUserName;
		this.ersPassword = ersPassword;
		this.ersUserFirstName = ersUserFirstName;
		this.ersUserLastName = ersUserLastName;
		this.ersUserEmail = ersUserEmail;
		this.ersUserRoleId = ersUserRoleId;
	}
	public EmployeeUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ersPassword == null) ? 0 : ersPassword.hashCode());
		result = prime * result + ((ersUserEmail == null) ? 0 : ersUserEmail.hashCode());
		result = prime * result + ((ersUserFirstName == null) ? 0 : ersUserFirstName.hashCode());
		result = prime * result + ((ersUserLastName == null) ? 0 : ersUserLastName.hashCode());
		result = prime * result + ((ersUserName == null) ? 0 : ersUserName.hashCode());
		result = prime * result + ((ersUserRoleId == null) ? 0 : ersUserRoleId.hashCode());
		result = prime * result + ersUsersId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeUser other = (EmployeeUser) obj;
		if (ersPassword == null) {
			if (other.ersPassword != null)
				return false;
		} else if (!ersPassword.equals(other.ersPassword))
			return false;
		if (ersUserEmail == null) {
			if (other.ersUserEmail != null)
				return false;
		} else if (!ersUserEmail.equals(other.ersUserEmail))
			return false;
		if (ersUserFirstName == null) {
			if (other.ersUserFirstName != null)
				return false;
		} else if (!ersUserFirstName.equals(other.ersUserFirstName))
			return false;
		if (ersUserLastName == null) {
			if (other.ersUserLastName != null)
				return false;
		} else if (!ersUserLastName.equals(other.ersUserLastName))
			return false;
		if (ersUserName == null) {
			if (other.ersUserName != null)
				return false;
		} else if (!ersUserName.equals(other.ersUserName))
			return false;
		if (ersUserRoleId == null) {
			if (other.ersUserRoleId != null)
				return false;
		} else if (!ersUserRoleId.equals(other.ersUserRoleId))
			return false;
		if (ersUsersId != other.ersUsersId)
			return false;
		return true;
	}
	
	public int getErsUsersId() {
		return ersUsersId;
	}
	public void setErsUsersId(int ersUsersId) {
		this.ersUsersId = ersUsersId;
	}
	public String getErsUserName() {
		return ersUserName;
	}
	public void setErsUserName(String ersUserName) {
		this.ersUserName = ersUserName;
	}
	public String getErsPassword() {
		return ersPassword;
	}
	public void setErsPassword(String ersPassword) {
		this.ersPassword = ersPassword;
	}
	public String getErsUserFirstName() {
		return ersUserFirstName;
	}
	public void setErsUserFirstName(String ersUserFirstName) {
		this.ersUserFirstName = ersUserFirstName;
	}
	public String getErsUserLastName() {
		return ersUserLastName;
	}
	public void setErsUserLastName(String ersUserLastName) {
		this.ersUserLastName = ersUserLastName;
	}
	public String getErsUserEmail() {
		return ersUserEmail;
	}
	public void setErsUserEmail(String ersUserEmail) {
		this.ersUserEmail = ersUserEmail;
	}
	public String getErsUserRoleId() {
		return ersUserRoleId;
	}
	public void setErsUserRoleId(String ersUserRoleId) {
		this.ersUserRoleId = ersUserRoleId;
	}
	
}
