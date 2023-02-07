package com.wf.appstatus.springboot.model;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "software")
public class Software {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "software_name")
	@NotEmpty
	private String softwareName;

	@Column(name = "software_desc")
	@NotEmpty
	private String softwareDesc;

	@Column(name = "software_ver")
	@NotEmpty
	private String softwareVer;

	@Column(name = "due_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private String dueDate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSoftwareName() {
		return softwareName;
	}

	public void setSoftwareName(String softwareName) {
		this.softwareName = softwareName;
	}

	public String getSoftwareDesc() {
		return softwareDesc;
	}

	public void setSoftwareDesc(String softwareDesc) {
		this.softwareDesc = softwareDesc;
	}

	public String getSoftwareVer() {
		return softwareVer;
	}

	public void setSoftwareVer(String softwareVer) {
		this.softwareVer = softwareVer;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

}
