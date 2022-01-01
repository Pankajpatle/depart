package com.codeProject.department.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Depart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departId;
    private String name;
    private String code;
    private String address;
}
