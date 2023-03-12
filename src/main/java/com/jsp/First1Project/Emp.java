

package com.jsp.First1Project;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;



@Entity
//@Table(name="Employee")  //change table name
public class Emp 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(length=11)     //can store 10 digits
	private int eId;
	
	@Column(name="employ_name",length=15) //change column name and store 15 characters
	
	private String eName;
	private double eSal;
	@Transient        // donot save in database
	private int x;
	public Emp() 
	{
	
	}
	public int geteId() {
		return eId;
	}


	public void seteId(int eId) {
		this.eId = eId;
	}


	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public double geteSal() {
		return eSal;
	}
	public void seteSal(double eSal) {
		this.eSal = eSal;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	@Override
	public String toString() {
		return "Emp [eId=" + eId + ", eName=" + eName + ", eSal=" + eSal + ", x=" + x + "]";
	}
	
	
	
}


