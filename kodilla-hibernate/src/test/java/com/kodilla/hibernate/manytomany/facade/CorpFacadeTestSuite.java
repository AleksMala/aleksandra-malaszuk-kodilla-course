package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CorpFacadeTestSuite {

    @Autowired
    private CorpSearchService corpSearchService;
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void testFindCompanyNameByFragment() {
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);

        //When
        List<Company> newList = corpSearchService.searchForCompany("te");
        //Then
        assertEquals(1, newList.size());
        //CleanUp
        try {
            companyDao.deleteAll();
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testFindEmployeeNameByFragment() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        employeeDao.save(johnSmith);
        employeeDao.save(lindaKovalsky);
        employeeDao.save(stephanieClarckson);

        //When
        List<Employee> newEmployeeList = corpSearchService.serchForEmployee("mit");
        //Then
        assertEquals(3, newEmployeeList.size());

        //CleanUp
        try {
            employeeDao.deleteAll();
        } catch (Exception e) {
            //do nothing
        }
    }
}
