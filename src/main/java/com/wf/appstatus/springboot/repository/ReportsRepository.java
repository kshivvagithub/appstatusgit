package com.wf.appstatus.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wf.appstatus.springboot.model.SoftwareUpdateReport;

@Repository
public interface ReportsRepository extends JpaRepository<SoftwareUpdateReport, Long> {

	@Query("SELECT s FROM SoftwareUpdateReport s WHERE s.applicationGroupName LIKE %?1%"
            + " OR s.applicationGroupEmail LIKE %?1%"
            + " OR s.softwareName LIKE %?1%"
            + " OR s.softwareDesc LIKE %?1%"
            + " OR s.softwareVer LIKE %?1%"
            + " OR s.applicable LIKE %?1%"
            + " OR s.appStatus LIKE %?1%")
    public List<SoftwareUpdateReport> searchReport(String keyword);
}
