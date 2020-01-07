package com.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Faculty")
public class Faculty{

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name = "facultyId")
 private int facultyId;
 @NotNull
 private String facultyname;
 @NotNull
 private int batchId;
 @NotNull
 private int associateId;
 @NotNull
 private String module;
 @OneToMany( targetEntity=Student.class,cascade = CascadeType.ALL)  
 @JoinColumn(name="facultyId")
 private List<Student> student;
 

public List<Student> getStudent() {
	return student;
}

public void setStudent(List<Student> student) {
	this.student = student;
}

public int getFacultyId() {
	return facultyId;
}

public void setFacultyId(int facultyId) {
	this.facultyId = facultyId;
}

public String getFacultyname() {
	return facultyname;
}

public void setFacultyname(String facultyname) {
	this.facultyname = facultyname;
}

public int getBatchId() {
	return batchId;
}

public void setBatchId(int batchId) {
	this.batchId = batchId;
}

public int getAssociateId() {
	return associateId;
}

public void setAssociateId(int associateId) {
	this.associateId = associateId;
}





public String getModule() {
	return module;
}

public void setModule(String module) {
	this.module = module;
}

@Override
public String toString() {
	return "Faculty [facultyId=" + facultyId + ", facultyname=" + facultyname + ", batchId=" + batchId
			+ ", associateId=" + associateId + ", module=" + module + ", student=" + student
			+ "]";
}
 
 
 
 
}