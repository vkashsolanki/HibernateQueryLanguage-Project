package bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Student {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//@Column(name="Student_RollNo")
	private int rollno;
	
	//@Column(name="Student_Name")
	private String name;
	
	//@Column(name="Student_Email")
	private String email;
	
	//@Column(name="Student_Mobile")
	private int mobile;
	
	//@Column(name="Student_Address")
	private String address;
	
	//@Column(name="Student_College")
	private String college;
	
	//@Column(name="Student_Course")
	private String coursename;
	
	//@Column(name="Student_Fee")
	private int fee;
}
