/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.model;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author macbookair
 */
@XmlRootElement(name = "employee")
@XmlAccessorType (XmlAccessType.FIELD)
public class EmployeeService {

    private int id;
    private String name;
    private String department;
    private String job;
    private String myname;
    private Date date;

    public EmployeeService() {
    }

    public EmployeeService(int id, String name, String department, String job, String myname, Date date) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.job = job;
        this.myname = myname;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getMyname() {
        return myname;
    }

    public void setMyname(String myname) {
        this.myname = myname;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
