package cdacteamproject.bussinesslayer;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Emp {

	@Id
	private int empno;
	private String empname;
	private int deptid;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", empname=" + empname + ", deptid=" + deptid + "]";
	}
	
}
