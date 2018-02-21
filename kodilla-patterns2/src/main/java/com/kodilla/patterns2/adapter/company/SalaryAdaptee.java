package com.kodilla.patterns2.adapter.company;

import com.kodilla.patterns2.adapter.company.newhrsystem.CompanyProcessorSalary;
import com.kodilla.patterns2.adapter.company.newhrsystem.Employee;
import com.kodilla.patterns2.adapter.company.newhrsystem.SalaryProcessor;

import java.math.BigDecimal;
import java.util.List;

public class SalaryAdaptee implements SalaryProcessor {
    @Override
    public BigDecimal calculatesalaries(List<Employee> employees) {
        CompanyProcessorSalary theProcessor = new CompanyProcessorSalary();
        return theProcessor.calculatesalaries(employees);
    }
}
