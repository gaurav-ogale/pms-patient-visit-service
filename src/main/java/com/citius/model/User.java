package com.citius.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;

	@Column(unique = true)
	private String username;

	@Size(min = 1, max = 3, message = "Invalid user title")
	private String userTitle;
	private String userFirstName;
	private String userLastName;

	@NotNull(message = "Email Should Not be Null")@NotEmpty @NotBlank
	private String userEmail;

	private LocalDate userDOB;

	@Size(min = 10,max = 10, message = "Contact No shoule be of 10 digit")
	private String userContactNo;

	@NotNull(message = "password should not be null")
	private String password;
	
	
	private Boolean isActive = true;

//	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "user")
//	@JsonIgnore
//	private Set<User_Roles> userRoles = new HashSet<User_Roles>();

	public User() {
		// TODO Auto-generated constructor stub
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserTitle() {
		return userTitle;
	}

	public void setUserTitle(String userTitle) {
		this.userTitle = userTitle;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public LocalDate getUserDOB() {
		return userDOB;
	}

	public void setUserDOB(LocalDate userDOB) {
		this.userDOB = userDOB;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public String getUserContactNo() {
		return userContactNo;
	}

	public void setUserContactNo(String userContactNo) {
		this.userContactNo = userContactNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

//
//	public Set<User_Roles> getUserRoles() {
//		return userRoles;
//	}
//
//	public void setUserRoles(Set<User_Roles> userRoles) {
//		this.userRoles = userRoles;
//	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", userTitle=" + userTitle + ", userFirstName="
				+ userFirstName + ", userLastName=" + userLastName + ", userEmail=" + userEmail + ", userDOB=" + userDOB
				+ ", userContactNo=" + userContactNo + ", password=" + password + ", isActive=" + isActive
				+ ", userRoles="  + "]";
	}

}