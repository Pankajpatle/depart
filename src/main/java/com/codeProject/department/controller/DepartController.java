package com.codeProject.department.controller;

import com.codeProject.department.entity.Depart;
import com.codeProject.department.service.DepartService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/depart")
@Slf4j
public class DepartController {

    @Autowired
    private DepartService departService;


    @PostMapping("/create")
    public Depart createDepart(@RequestBody Depart depart){
        log.info("Inside dept save Controller");
       return  departService.create(depart);
    }

    @GetMapping("/get/{id}")
    public Depart getDepart(@PathVariable Long id){
        log.info("Inside dept findById Controller");
        return departService.findById(id);
    }

}
