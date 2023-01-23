package com.wf.appstatus.springboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "softwareUpdateStatus")
public class SoftwareUpdateStatus {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "application_group_id")
	private long applicationGroupId;

	@Column(name = "software_id")
	private long softwareId;

	@Column(name = "applicable")
	private String applicable;

	@Column(name = "update_status")
	private String updateStatus;

	@Column(name = "completed_date")
	private String completedDate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getApplicationGroupId() {
		return applicationGroupId;
	}

	public void setApplicationGroupId(long applicationGroupId) {
		this.applicationGroupId = applicationGroupId;
	}

	public long getSoftwareId() {
		return softwareId;
	}

	public void setSoftwareId(long softwareId) {
		this.softwareId = softwareId;
	}

	public String getApplicable() {
		return applicable;
	}

	public void setApplicable(String applicable) {
		this.applicable = applicable;
	}

	public String getUpdateStatus() {
		return updateStatus;
	}

	public void setUpdateStatus(String updateStatus) {
		this.updateStatus = updateStatus;
	}

	public String getCompletedDate() {
		return completedDate;
	}

	public void setCompletedDate(String completedDate) {
		this.completedDate = completedDate;
	}

}
