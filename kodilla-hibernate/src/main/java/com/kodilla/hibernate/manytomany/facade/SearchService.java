package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class SearchService {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;
    private List<Employee> employees = new ArrayList<>();

    public List<Employee> getEmployees() {
        return employees;
    }

    public List<Company> getCompanies(){
        return employees.iterator().next().getCompanies();
    }

    public String searchForCompany(String a) {
        return companyDao.retrieveCompanyByFragment(a).iterator().toString();
    }

    public String serchForEmployee(String b) {
        return employeeDao.retrieveEmployeeByFragment(b).iterator().toString();
    }
}
