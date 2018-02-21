package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Employee;

import java.util.ArrayList;
import java.util.List;

public class CompanyDto {

    private int id;
    private String name;
    private List<Employee> employees = new ArrayList<>();
}
