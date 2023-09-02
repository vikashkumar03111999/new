package com.kumarfirst.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kumarfirst.model.Employee;
import com.kumarfirst.service.EmployeeService;
//mark class as Controller
@RestController
public class EmployeeController 
{
//autowire the EmployeeService class
@Autowired
EmployeeService employeeService;
//creating a get mapping that retrieves all the employee detail from the database 
@GetMapping("/employee")
private List<Employee> getAllEmployee() 
{
return employeeService.getAllEmployee();
}
//creating a get mapping that retrieves the detail of a specific employee
@GetMapping("/employee/{employeeid}")
private Employee getEmployee(@PathVariable("employeeid") int employeeid) 
{
return employeeService.getEmployeeById(employeeid);
}
//creating a delete mapping that deletes a specified employee
@DeleteMapping("/employee/{employeeid}")
private void deleteEmployee(@PathVariable("employeeid") int employeeid) 
{
employeeService.delete(employeeid);
}
//creating post mapping that post the employee detail in the database
@PostMapping("/employee")
private int saveEmployee(@RequestBody Employee employee) 
{
employeeService.saveOrUpdate(employee);
return employee.getEmployeeid();
}
//creating put mapping that updates the employee detail 
@PutMapping("/employee")
private Employee update(@RequestBody Employee employee) 
{
employeeService.saveOrUpdate(employee);
return employee;
}
}
