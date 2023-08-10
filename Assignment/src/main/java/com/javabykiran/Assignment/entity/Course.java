package com.javabykiran.Assignment.entity;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Course {

	private int courseId;
	private String title;
	private Date startDate;
	private Date endDate;
	@Id
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", title=" + title + ", startDate=" + startDate + ", endDate=" + endDate
				+ "]";
	}
	

}
