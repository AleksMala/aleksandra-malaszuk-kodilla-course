package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    private static Employee johnSmith = new Employee("John", "Smith");
    private static Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
    private static Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

    private static Company softwareMachine = new Company("Software Machine");
    private static Company dataMaesters = new Company("Data Maesters");
    private static Company greyMatter = new Company("Grey Matter");

    @Before
    public void executedBeforeEach() {
        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);
    }

    @Test

    public void testSaveManyToMany() {
        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.delete(softwareMachineId);
            companyDao.delete(dataMaestersId);
            companyDao.delete(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testNamedCompanies() {
        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);

        //When
        CharSequence sequence = "Sof";
        List<Company> companyName = companyDao.retrieveCompanyName(companyDao.findAll().iterator().next().getName().contains(sequence));

        //Then
        //Assert.assertEquals(1, companyName.size());
        Assert.assertEquals("Software Machine", companyName.toString());

        //CleanUp
        companyDao.deleteAll();
        employeeDao.deleteAll();
    }

    @Test
    public void testEmployeeWithLastname() {
        employeeDao.save(johnSmith);
        employeeDao.save(lindaKovalsky);
        employeeDao.save(stephanieClarckson);

        //When
        List<Employee> employeeLastname = employeeDao.retrieveLastname("Smith");

        //Then
        Assert.assertEquals(1, employeeLastname.size());

        //CleanUp
        employeeDao.deleteAll();
        companyDao.deleteAll();
    }
}
