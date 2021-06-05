/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.servlet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import my.converter.ConvertToHTML;
import my.interfaces.Employee;
import my.model.EmployeeService;
import my.model.EmployeesList;
import my.services.EmployeeImplService;


/**
 *
 * @author macbookair
 */
@WebServlet(name = "EmployeeServlet", urlPatterns = {"/EmployeeServlet"})
public class EmployeeServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        EmployeeImplService employeeImplService = new EmployeeImplService();
        List<Employee> employee= employeeImplService.getEmployeeImplPort().getAllEmployees();
        
        EmployeesList employeeList = new EmployeesList();
        employeeList.setEmployees(new ArrayList<EmployeeService>());
        
        for(int i =0;i <employee.size();i++)
        {           
         employeeList.getEmployees().add(new EmployeeService(Integer.parseInt(employee.get(i).getEmpNo()), 
                 employee.get(i).getEmpName(),employee.get(i).getDepartment(), 
                 employee.get(i).getEmpJob(), "Sarbjot", new Date()));            
        }
     
        
          //Marshalling
        try {
            //creating the JAXB context
            JAXBContext jContext = JAXBContext.newInstance(EmployeesList.class);

            //creating the marshaller object
            Marshaller marshallObj = jContext.createMarshaller();

            //setting the values in POJO class
            System.out.println("----------------------------------");
            for(int i =0 ;i<employeeList.getEmployees().size();i++)
            {
                System.out.println(employeeList.getEmployees().get(i).getName());
            }
            
            marshallObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            
            marshallObj.marshal(employeeList, System.out);
          
            //calling the marshall method
            marshallObj.marshal(employeeList, new File("response.xml"));
          

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        response.setContentType("text/html;charset=UTF-8");
        
        try(PrintWriter out = response.getWriter())
        {
            out.println(ConvertToHTML.getHTML(employee, "Employees List"));
        };
       
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
