/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.model;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author macbookair
 */
@XmlRootElement(name = "employees")
@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeesList {

    
    @XmlElement(name = "employee")
    private List<EmployeeService> employees = null;

    public List<EmployeeService> getEmployees() {
        return employees;
    }

    public void setEmployees(List<EmployeeService> employees) {
        this.employees = employees;
    }

}
