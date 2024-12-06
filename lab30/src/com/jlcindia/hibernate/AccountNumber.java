package com.jlcindia.hibernate;

import java.io.Serializable;
import java.util.Objects;

public class AccountNumber implements Serializable {
    private int branchCode;
    private String acctype;
    private int accId;

    // Default constructor
    public AccountNumber() {}

    // Parameterized constructor
    public AccountNumber(int branchCode, String acctype, int accId) {
        this.branchCode = branchCode;
        this.acctype = acctype;
        this.accId = accId;
    }

    // Getters and Setters
    public int getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(int branchCode) {
        this.branchCode = branchCode;
    }

    public String getAcctype() {
        return acctype;
    }

    public void setAcctype(String acctype) {
        this.acctype = acctype;
    }

    public int getAccId() {
        return accId;
    }

    public void setAccId(int accId) {
        this.accId = accId;
    }

    // equals() and hashCode() methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountNumber that = (AccountNumber) o;
        return branchCode == that.branchCode &&
               accId == that.accId &&
               Objects.equals(acctype, that.acctype);
    }

    @Override
    public int hashCode() {
        return Objects.hash(branchCode, acctype, accId);
    }
}
