
package com.model;



import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity

@Table(name = "BatchTablenew")

public class Batch {

	@Id
	private int batchId;
	@NotNull
	@Size(min = 2, max = 30)
	private String batchName;
	@NotNull
	@Size(min = 2, max = 30)
	private String course;
	@NotNull
	@Size(min = 2, max = 30)
	private String facultyName;
	@NotNull
	@Temporal(TemporalType.DATE)
	private Date startDate;
	@NotNull
	@Temporal(TemporalType.DATE)
	private Date EndDate;
	@OneToMany(targetEntity=Faculty.class,cascade=CascadeType.ALL)
	@JoinColumn(name="batchId")
	private List<Faculty> faculty;
	



	public List<Faculty> getFaculty() {
		return faculty;
	}

	public void setFaculty(List<Faculty> faculty) {
		this.faculty = faculty;
	}

	public Batch() {

		super();

	}

	public int getBatchId() {

		return batchId;

	}

	public void setBatchId(int batchId) {

		this.batchId = batchId;

	}

	public String getBatchName() {

		return batchName;

	}

	public void setBatchName(String batchName) {

		this.batchName = batchName;

	}

	public String getCourse() {

		return course;

	}

	public void setCourse(String course) {

		this.course = course;

	}

	public String getFacultyName() {

		return facultyName;

	}

	public void setFacultyName(String facultyName) {

		this.facultyName = facultyName;

	}

	public Date getStartDate() {

		return startDate;

	}

	public void setStartDate(Date startDate) {

		this.startDate = startDate;

	}

	public Date getEndDate() {

		return EndDate;

	}

	public void setEndDate(Date endDate) {

		EndDate = endDate;

	}

	@Override

	public String toString() {

		return "Batch [batchId=" + batchId + ", batchName=" + batchName + ", course=" + course + ", facultyName="

				+ facultyName + ", startDate=" + startDate + ", EndDate=" + EndDate + "]";

	}

}
