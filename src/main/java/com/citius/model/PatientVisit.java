package com.citius.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="patient_visit")
public class PatientVisit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "visit_id")
	private Integer visitId;
	

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "vital_id")
	private VitalSigns vitalSigns;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Procedures> procedureDetails;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Drug> drugDetails;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Diagnose> diagnosisDetails;

	public Integer getVisitId() {
		return visitId;
	}

	public void setVisitId(Integer visitId) {
		this.visitId = visitId;
	}

	public VitalSigns getVitalSigns() {
		return vitalSigns;
	}

	public void setVitalSigns(VitalSigns vitalSigns) {
		this.vitalSigns = vitalSigns;
	}

	public List<Procedures> getProcedureDetails() {
		return procedureDetails;
	}

	public void setProcedureDetails(List<Procedures> procedureDetails) {
		this.procedureDetails = procedureDetails;
	}

	public List<Drug> getDrugDetails() {
		return drugDetails;
	}

	public void setDrugDetails(List<Drug> drugDetails) {
		this.drugDetails = drugDetails;
	}

	public List<Diagnose> getDiagnosisDetails() {
		return diagnosisDetails;
	}

	public void setDiagnosisDetails(List<Diagnose> diagnosisDetails) {
		this.diagnosisDetails = diagnosisDetails;
	}
	
	
	
	

}
