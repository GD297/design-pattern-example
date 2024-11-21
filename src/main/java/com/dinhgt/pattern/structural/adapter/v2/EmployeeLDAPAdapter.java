package com.dinhgt.pattern.structural.adapter.v2;

public class EmployeeLDAPAdapter implements Employee{

    private final EmployeeLDAP employeeLDAP;

    public EmployeeLDAPAdapter(EmployeeLDAP employeeLDAP) {
        this.employeeLDAP = employeeLDAP;
    }

    @Override
    public String getId() {
        return this.employeeLDAP.getUniqueIndex();
    }

    @Override
    public String getFirstName() {
        return this.employeeLDAP.getPreIdentity();
    }

    @Override
    public String getLastName() {
        return this.employeeLDAP.getPostIdentity();
    }

    @Override
    public String getEmail() {
        return this.employeeLDAP.getEmail();
    }
}
