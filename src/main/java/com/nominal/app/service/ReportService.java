package com.nominal.app.service;

import com.nominal.app.model.Payroll;
import com.nominal.app.repo.PayrollRepo;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
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
    private PayrollRepo payrollRepo = new PayrollRepo();

    public ReportService() throws Exception {

    }

    public String exportReport(String report, int id) throws Throwable {
        String reportPath = "";
        List<Payroll> payroll = new LinkedList<>();
        Payroll payroll1 = this.payrollRepo.findPayrollByID(id);
        payroll.add(payrollRepo.findPayrollByID(id));

        //Load file and compile
        File f = ResourceUtils.getFile("classpath:nomina.jrxml");
        JasperReport jr = JasperCompileManager.compileReport(f.getAbsolutePath());
        JRBeanCollectionDataSource dataSource =  new JRBeanCollectionDataSource(payroll);
        Map<String,Object> m = new HashMap<>();
        m.put("NominalTeam","LRP");
        JasperPrint jp = JasperFillManager.fillReport(jr,m,dataSource);
        String thisReport = "src\\out\\reports\\" + id +".";

        Path current = Paths.get(thisReport);

        String outPath = current.toAbsolutePath().toString();

        if (report.equalsIgnoreCase("html")){
            reportPath = outPath +"html";
            JasperExportManager.exportReportToHtmlFile(jp,reportPath);

        }else if (report.equalsIgnoreCase("pdf")){
            reportPath = outPath +"pdf";
            JasperExportManager.exportReportToPdfFile(jp,reportPath);
        }

        return  "Report guardado en " + reportPath;
    }
}
