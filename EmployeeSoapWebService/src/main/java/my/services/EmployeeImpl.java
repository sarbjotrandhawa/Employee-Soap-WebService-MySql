/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import my.models.Employee;

/**
 *
 * @author macbookair
 */
@WebService(endpointInterface = "my.interfaces.IEmployee")
public class EmployeeImpl {

    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();

        try {
            ResultSet rs = null;
            String query = "Select * from EMP";

            Connection con = initiateDbConnection();
            Statement statement = con.createStatement();
            rs = statement.executeQuery(query);

            while (rs.next()) {
                employees.add(new Employee(rs.getString("EmpNo"), rs.getString("EmpName"), rs.getString("Department"), rs.getString("EmpJob")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return employees;
    }

    private Connection initiateDbConnection() {

        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String db_URL, db_Username, db_Password;
            db_URL = "jdbc:mysql://localhost:3306/As2_Sarbjot?zeroDateTimeBehavior=CONVERT_TO_NULL&useSSL=false";
            db_Username = "root";
            db_Password = "12345678";

            con = DriverManager.getConnection(db_URL, db_Username, db_Password);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

}
