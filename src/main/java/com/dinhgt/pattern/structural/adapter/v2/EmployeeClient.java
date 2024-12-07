package com.dinhgt.pattern.structural.adapter.v2;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {


    public List<Employee> getListEmployee(){
        List<Employee> employees = new ArrayList<>();

        Employee employee = new EmployeeDB("EDB", "John", "Wick", "john@wick.com");
        employees.add(employee);

        Employee employeeLDAP = new EmployeeLDAPAdapter(new EmployeeLDAP("ELDAP", "JOHON", "WIKICH", "johon@wikich.com"));
        employees.add(employeeLDAP);

        return employees;
    }

}
