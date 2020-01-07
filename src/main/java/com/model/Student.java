package com.model;

import javax.persistence.*;

import javax.validation.constraints.*;

@Entity
@Table(name = "student")
public class Student {
	@NotNull
	private String firstName;
	@NotNull
	private String lastName;
	private int age;
	private String gender;
	private String contactNumber;
	private int facultyId;
	@Email
	@NotBlank
	private String emailId;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long StudentId;
	private String module;

	public Student() {
		super();

	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", gender=" + gender
				+ ", contactNumber=" + contactNumber + ", emailId=" + emailId + ", StudentId=" + StudentId + "]";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Long getStudentId() {
		return StudentId;
	}

	public void setStudentId(Long studentId) {
		StudentId = studentId;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}
	

}
