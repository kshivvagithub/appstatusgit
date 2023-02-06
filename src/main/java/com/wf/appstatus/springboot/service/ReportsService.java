package com.wf.appstatus.springboot.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.wf.appstatus.springboot.model.SoftwareUpdateReport;

public interface ReportsService {

	SoftwareUpdateReport saveSoftwareUpdateReport(SoftwareUpdateReport report);

	SoftwareUpdateReport getSoftwareUpdateStatusById(long id);
	
	List<SoftwareUpdateReport> getAllReports(String keyword);
	
	Page<SoftwareUpdateReport> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);

}
