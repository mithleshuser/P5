package org.tss.hibernate.onetomany;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Department  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int deptId;
	private String departmentName;
	private String location;
	Set<Employee> listEmployee = new HashSet<Employee>();
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Set<Employee> getListEmployee() {
		return listEmployee;
	}
	public void setListEmployee(Set<Employee> listEmployee) {
		this.listEmployee = listEmployee;
	}
	
	

}
