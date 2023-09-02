package com.kumarfirst.repository;
import org.springframework.data.repository.CrudRepository;

import com.kumarfirst.model.Employee;
public interface EmployeeRepository extends CrudRepository<Employee, Integer>
{
}
