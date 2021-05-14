package com.nominal.app.controller;

import com.nominal.app.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    ReportService reportService;

    @GetMapping("/{format}/{id}")
    public String generateReport(@PathVariable String format, @PathVariable int id) throws Throwable {
        return reportService.exportReport(format, id);
    }


}
