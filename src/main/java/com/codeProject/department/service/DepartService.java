package com.codeProject.department.service;

import com.codeProject.department.entity.Depart;
import com.codeProject.department.repository.DepartRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartService {

    @Autowired
    private DepartRepository departRepository;

    public Depart create(Depart depart) {
        log.info("Inside dept save Service");
        return departRepository.save(depart);
    }


    public Depart findById(Long id) {
        log.info("Inside dept findBy Service");
        return departRepository.findByDepartId(id);
    }
}
