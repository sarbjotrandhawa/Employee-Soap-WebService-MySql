/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.converter;

import java.util.List;
import my.interfaces.Employee;

/**
 *
 * @author macbookair
 */
public class ConvertToHTML {

    public static String getHTML(List<Employee> list, String title) {
        String table = "<h1> " + title + "</h1>";
        table += "<table border='1'><tr><th>Emp No.</th><th>Emp. Name</th><th>Department</th><th>EmpJob</th>";

        for (Employee emp : list) {
            table += "<tr><td>" + emp.getEmpNo() + "</td>"
                    + "<td>" + emp.getEmpName() + "</td>"
                    + "<td>" + emp.getDepartment() + "</td>"
                    + "<td>" + emp.getEmpJob() + "</td><tr>";
        }
        table += "</table>";
        return table;
    }

}
