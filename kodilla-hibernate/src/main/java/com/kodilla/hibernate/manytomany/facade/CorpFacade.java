package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CorpFacade {
    @Autowired
    private SearchService searchService;
    private static final Logger LOGGER = LoggerFactory.getLogger(CorpFacade.class);

    public void searchProcess(final List<Company> company) {

        try{
            for(Employee companyEmployee : company.iterator().next().getEmployees()){
                LOGGER.info("Employee Id: " + companyEmployee.getId());
            }
            if(!company.iterator().next().getEmployees().isEmpty()){
                searchService.serchForEmployee(company.iterator().next().getEmployees().stream().iterator().next().getLastname());
            }
            System.out.println("Something went wrong");
            if(!searchService.getCompanies().isEmpty()){
                searchService.searchForCompany(company.iterator().next().getName());
            }
            System.out.println("Something went wrong");
        } finally {
            System.out.println("You made a search");
        }
    }
}
