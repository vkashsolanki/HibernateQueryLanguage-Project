package bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//@NoArgsConstructor

//@Data
//@AllArgsConstructor
@Entity
@Table(name="Employee_Table")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	@Column(name="Employee_Code")
	private int empCode;
	
	@Column(name="Employee_Name")
	private String empName;
	
	@Column(name="Employe_Designation")
	private String designation;
	
	@Column(name="Employee_Salary")
	private int Salary;
	
	//@ManyToOne(cascade = CascadeType.ALL);
	//private Address address;

}
