package com.codeProject.department.repository;

import com.codeProject.department.entity.Depart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartRepository extends JpaRepository<Depart,Long> {
    Depart findByDepartId(Long id);
}
