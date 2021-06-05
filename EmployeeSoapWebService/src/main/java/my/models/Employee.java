/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.models;

/**
 *
 * @author macbookair
 */
public class Employee {

    private String EmpNo;
    private String EmpName;
    private String Department;
    private String EmpJob;

    public Employee() {
    }

    public Employee(String EmpNo, String EmpName, String Department, String EmpJob) {
        this.EmpNo = EmpNo;
        this.EmpName = EmpName;
        this.Department = Department;
        this.EmpJob = EmpJob;
    }

    public String getEmpNo() {
        return EmpNo;
    }

    public void setEmpNo(String EmpNo) {
        this.EmpNo = EmpNo;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String EmpName) {
        this.EmpName = EmpName;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public String getEmpJob() {
        return EmpJob;
    }

    public void setEmpJob(String EmpJob) {
        this.EmpJob = EmpJob;
    }

}
