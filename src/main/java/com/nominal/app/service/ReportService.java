package com.nominal.app.service;

import com.nominal.app.model.Employee;
import com.nominal.app.model.Payroll;
import com.nominal.app.repo.EmployeesRepo;
import com.nominal.app.repo.PayrollRepo;
import com.nominal.app.repo.Repo;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/************************************************************************ยบ
 Made by        Nominal Team
 Date           11/05/2021
 Package        com.nominal.app.service
 Description:
 ************************************************************************/

@Service
public class ReportService {

    @Autowired
    private PayrollRepo payrollrepo;

    public String exportReport(String report, int id) throws Throwable {
        List<Payroll> payroll = (List<Payroll>) payrollrepo.findPayrollByID(id);
        //Load file and compile
        File f = ResourceUtils.getFile("classpath:nominal.jrxml");
        JasperReport jr = JasperCompileManager.compileReport(f.getAbsolutePath());
        JRBeanCollectionDataSource dataSource =  new JRBeanCollectionDataSource(payroll);
        Map<String,Object> m = new HashMap<>();
        m.put("NominalTeam","LRP");
        JasperPrint jp = JasperFillManager.fillReport(jr,m,dataSource);

        if (report.equalsIgnoreCase("html")){
            JasperExportManager.exportReportToHtmlFile(jp,"src\\main\\resources"+"\\report.html");
        }else if (report.equalsIgnoreCase("pdf")){
            JasperExportManager.exportReportToPdfFile(jp,"src\\main\\resources"+"\\report.pdf");
        }
        else if(report.equalsIgnoreCase("csv")){
            JasperExportManager.exportReportToPdfFile(jp,"src\\main\\resources"+"\\report.csv");
        }
        return "Report saved in src\\main\\rources";
    }
}
