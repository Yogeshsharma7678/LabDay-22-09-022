/* employee entity
    & atttributes 
    
 */
package com.HibernateSlot1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class employee {
	@Id
	private int empId;
	private String empName;


	@Override
	public String toString() {
		return "["+"empId=" + empId + ", empName=" + empName +"]";
	
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}

}
