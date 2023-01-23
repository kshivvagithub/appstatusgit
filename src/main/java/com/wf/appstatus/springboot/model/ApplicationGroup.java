package com.wf.appstatus.springboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "applicationGroup")
public class ApplicationGroup {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "application_group_name")
	private String applicationGroupName;

	@Column(name = "application_group_email")
	private String applicationGroupEmail;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getApplicationGroupName() {
		return applicationGroupName;
	}

	public void setApplicationGroupName(String applicationGroupName) {
		this.applicationGroupName = applicationGroupName;
	}

	public String getApplicationGroupEmail() {
		return applicationGroupEmail;
	}

	public void setApplicationGroupEmail(String applicationGroupEmail) {
		this.applicationGroupEmail = applicationGroupEmail;
	}

}
