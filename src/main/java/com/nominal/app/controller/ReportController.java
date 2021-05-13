package com.nominal.app.controller;

import com.nominal.app.service.ReportService;
import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.sql.SQLException;

/************************************************************************ยบ
 Made by        Nominal Team
 Date           12/05/2021
 Package        com.nominal.app.controller
 Description:
 ************************************************************************/

@RestController
@RequestMapping("/report")
public class ReportController {

    @Autowired
    ReportService reportservice;

    @GetMapping("/{format}/{id}")
    public String generateReport(@PathVariable String format, @PathVariable int id) throws Throwable {
        return reportservice.exportReport(format, id);
    }
}
