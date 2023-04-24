package com.akhil.employeedirectory.dao;

import com.akhil.employeedirectory.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    //define field for entity manager
    private EntityManager entityManager;

    //setup constructor for injection
    @Autowired
    public EmployeeDAOImpl(EntityManager theEntityManager){
        entityManager=theEntityManager;
    }
    @Override
    public List<Employee> findAll() {

        //create a query
        TypedQuery<Employee> theQuery = entityManager.createQuery("from Employee",Employee.class);

        //execute query and get result
        List<Employee> employees  = theQuery.getResultList();

        //return the result
        return employees;
    }

    @Override
    public Employee findByID(int theId) {

        //get employee
        Employee theEmployee = entityManager.find(Employee.class,theId);

        //return employee
        return theEmployee;
    }

    @Override
    public Employee save(Employee theEmployee) {

        //save employee
        Employee dbEmployee = entityManager.merge(theEmployee);

        //return
        return dbEmployee;
    }

    @Override
    public void deleteById(int theId) {

        //find employee by id
        Employee findEmployee = entityManager.find(Employee.class,theId);

        //remove
        entityManager.remove(findEmployee);
    }
}
