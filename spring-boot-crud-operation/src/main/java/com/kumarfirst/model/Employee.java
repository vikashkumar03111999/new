package com.kumarfirst.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//mark class as an Entity 
@Entity
//defining class name as Table name
@Table
public class Employee
{
//Defining employee id as primary key
@Id
@Column
private int employeeid;
@Column
private String employeename;
@Column
private String address;
@Column
private int salary;
public int getEmployeeid() 
{
return employeeid;
}
public void setEmployeeid(int employeeid) 
{
this.employeeid = employeeid;
}
public String getEmployeename()
{
return employeename;
}
public void setEmployeename(String employeename) 
{
this.employeename = employeename;
}
public String getAddress() 
{
return address;
}
public void setAddress(String address) 
{
this.address = address;
}
public int getSalary() 
{
return salary;
}
public void setSalary(int salary) 
{
this.salary = salary;
}
}