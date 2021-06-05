
package my.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for employee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="employee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="department" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empJob" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "employee", propOrder = {
    "department",
    "empJob",
    "empName",
    "empNo"
})
public class Employee {

    protected String department;
    protected String empJob;
    protected String empName;
    protected String empNo;

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartment(String value) {
        this.department = value;
    }

    /**
     * Gets the value of the empJob property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpJob() {
        return empJob;
    }

    /**
     * Sets the value of the empJob property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpJob(String value) {
        this.empJob = value;
    }

    /**
     * Gets the value of the empName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * Sets the value of the empName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpName(String value) {
        this.empName = value;
    }

    /**
     * Gets the value of the empNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpNo() {
        return empNo;
    }

    /**
     * Sets the value of the empNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpNo(String value) {
        this.empNo = value;
    }

}
