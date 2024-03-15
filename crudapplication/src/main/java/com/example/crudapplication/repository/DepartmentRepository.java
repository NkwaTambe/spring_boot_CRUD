package com.example.crudapplication.repository;

import com.example.crudapplication.entity.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long> {
}
