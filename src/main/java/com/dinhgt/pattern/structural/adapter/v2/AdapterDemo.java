package com.dinhgt.pattern.structural.adapter.v2;

import java.util.List;

public class AdapterDemo {

    public static void main(String[] args) {
        System.out.println("### ADAPTER DESIGN PATTERN ###");
        EmployeeClient employeeClient = new EmployeeClient();
        List<Employee> employees = employeeClient.getListEmployee();
        for (Employee employee : employees) {
            System.out.println(employee.getId() + ":" + employee.getFirstName() + ":" + employee.getLastName() + ":" + employee.getEmail());
        }
    }

}
