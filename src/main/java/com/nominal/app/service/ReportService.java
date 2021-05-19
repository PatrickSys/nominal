package com.nominal.app.service;

import com.nominal.app.XMLWritter.XmlWriter;
import com.nominal.app.model.Payroll;
import com.nominal.app.repo.PayrollRepo;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.JRCsvExporter;
import net.sf.jasperreports.export.SimpleCsvExporterConfiguration;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleWriterExporterOutput;
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

        // Gets relative out paths
        XmlWriter xmlConverter = new XmlWriter();
        String thisReport = "src\\out\\reports\\" + id +".";
        Path current = Paths.get(thisReport);
        String outPath = current.toAbsolutePath().toString();
        String reportPath = "";
        String xmlPath = outPath + "xml";


        // List to input to the jasper
        List<Payroll> payrolls = new LinkedList<>();
        payrolls.add(payrollRepo.findPayrollByID(id));

        //Load file and compile
        File f = ResourceUtils.getFile("classpath:nomina.jrxml");
        JasperReport jr = JasperCompileManager.compileReport(f.getAbsolutePath());
        JRBeanCollectionDataSource dataSource =  new JRBeanCollectionDataSource(payrolls);
        Map<String,Object> m = new HashMap<>();
        m.put("NominalTeam","LRP");
        JasperPrint jp = JasperFillManager.fillReport(jr,m,dataSource);


        //the xml output
        xmlConverter.writeXml(id, xmlPath);

        if (report.equalsIgnoreCase("html")){
            reportPath = outPath +"html";
            JasperExportManager.exportReportToHtmlFile(jp,reportPath);

        }else if (report.equalsIgnoreCase("pdf")){
            reportPath = outPath +"pdf";
            JasperExportManager.exportReportToPdfFile(jp,reportPath);
        }
        else if (report.equalsIgnoreCase("csv")){
            reportPath = outPath + "csv";

            JRCsvExporter exporter = new JRCsvExporter();
            exporter.setExporterInput(new SimpleExporterInput(jp));
            exporter.setExporterOutput(new SimpleWriterExporterOutput(new File(reportPath)));
            SimpleCsvExporterConfiguration  simpleCsvExporterConfiguration= new SimpleCsvExporterConfiguration();
            simpleCsvExporterConfiguration.setWriteBOM(Boolean.TRUE);
            simpleCsvExporterConfiguration.setRecordDelimiter("\r\n");
            exporter.setConfiguration(simpleCsvExporterConfiguration);
            exporter.exportReport();

        }



        return  "Report guardado en " + reportPath + ".     " +
                "Archivo xml de salida guardado en "+ xmlPath;
    }
}
