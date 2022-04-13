package com.citius.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patient_vital_signs")
public class VitalSigns {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "vital_id")
	private Integer vitalId;
	
	private Integer height;
	
	private Integer weight;
	
	private Integer bloodPressure;
	
	private Integer bloodTemperature;
	
	private Integer respirationRate;

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Integer getBloodPressure() {
		return bloodPressure;
	}

	public void setBloodPressure(Integer bloodPressure) {
		this.bloodPressure = bloodPressure;
	}

	public Integer getBloodTemperature() {
		return bloodTemperature;
	}

	public void setBloodTemperature(Integer bloodTemperature) {
		this.bloodTemperature = bloodTemperature;
	}

	public Integer getRespirationRate() {
		return respirationRate;
	}

	public void setRespirationRate(Integer respirationRate) {
		this.respirationRate = respirationRate;
	}

	public Integer getVitalId() {
		return vitalId;
	}

	public void setVitalId(Integer vitalId) {
		this.vitalId = vitalId;
	}
	
	
	

}
