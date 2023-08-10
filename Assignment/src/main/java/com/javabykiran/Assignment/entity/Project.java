package com.javabykiran.Assignment.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Project {
 private int projectid;
 private String projectName;
 private Date DateofStart;
 private int teamSize;
 @Id
public int getProjectid() {
	return projectid;
}
public void setProjectid(int projectid) {
	this.projectid = projectid;
}
public String getProjectName() {
	return projectName;
}
public void setProjectName(String projectName) {
	this.projectName = projectName;
}
public Date getDateofStart() {
	return DateofStart;
}
public void setDateofStart(Date dateofStart) {
	DateofStart = dateofStart;
}
public int getTeamSize() {
	return teamSize;
}
public void setTeamSize(int teamSize) {
	this.teamSize = teamSize;
}
@Override
public String toString() {
	return "Project [projectid=" + projectid + ", projectName=" + projectName + ", DateofStart=" + DateofStart
			+ ", teamSize=" + teamSize + "]";
}
 

 
}
