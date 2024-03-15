package com.example.crudapplication.service;

import com.example.crudapplication.entity.Department;

import java.util.List;

public interface DepartmentService {

    //Save operation

    Department saveDepartment(Department department);

    //Read operation

    List<Department> fetchDepartmentList();

    //Update operation
    Department updateDepartment(Department department, Long departmentId);

    //Delete operation

    void deleteDepartmentById(Long departmentId);
}
