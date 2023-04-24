package com.akhil.employeedirectory.dao;

import com.akhil.employeedirectory.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    /*
     return list of employees
      */
    List<Employee> findAll();

    Employee findByID(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);
}
