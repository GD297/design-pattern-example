package com.dinhgt.pattern.structural.adapter.v2;

public class EmployeeLDAP {

    private String uniqueIndex;
    private String preIdentity;
    private String postIdentity;
    private String email;

    public EmployeeLDAP() {
    }

    public EmployeeLDAP(String uniqueIndex, String preIdentity, String postIdentity, String email) {
        this.uniqueIndex = uniqueIndex;
        this.preIdentity = preIdentity;
        this.postIdentity = postIdentity;
        this.email = email;
    }

    public String getUniqueIndex() {
        return uniqueIndex;
    }

    public void setUniqueIndex(String uniqueIndex) {
        this.uniqueIndex = uniqueIndex;
    }

    public String getPreIdentity() {
        return preIdentity;
    }

    public void setPreIdentity(String preIdentity) {
        this.preIdentity = preIdentity;
    }

    public String getPostIdentity() {
        return postIdentity;
    }

    public void setPostIdentity(String postIdentity) {
        this.postIdentity = postIdentity;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
