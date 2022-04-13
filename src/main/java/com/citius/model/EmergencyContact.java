package com.citius.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patient_emergency_contact")
public class EmergencyContact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="emergId")
	private Integer emergencyId;
	
	private String firstName;
	
	private String lastName;
	
	private String relationship;
	
	private String email;
	
	private Long contact;
	
	private Boolean addressSameAsPatient;
	
	private String address;
	
	private Boolean accessToPatientPortal;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getContact() {
		return contact;
	}

	public void setContact(Long contact) {
		this.contact = contact;
	}

	public Boolean getAddressSameAsPatient() {
		return addressSameAsPatient;
	}

	public void setAddressSameAsPatient(Boolean addressSameAsPatient) {
		this.addressSameAsPatient = addressSameAsPatient;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Boolean getAccessToPatientPortal() {
		return accessToPatientPortal;
	}

	public void setAccessToPatientPortal(Boolean accessToPatientPortal) {
		this.accessToPatientPortal = accessToPatientPortal;
	}

	public Integer getEmergencyId() {
		return emergencyId;
	}

	public void setEmergencyId(Integer emergencyId) {
		this.emergencyId = emergencyId;
	}
	
	
	
	

}
