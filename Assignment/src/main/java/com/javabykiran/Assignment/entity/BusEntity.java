package com.javabykiran.Assignment.entity;


import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class BusEntity {
private int id;
private String BusName;
private int destination;
private String BusType;
private LocalTime departuretime;
 private LocalTime arrivaltime;
 private int totalseat;
 private float price;
 @Id
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBusName() {
	return BusName;
}
public void setBusName(String busName) {
	BusName = busName;
}
public int getDestination() {
	return destination;
}
public void setDestination(int destination) {
	this.destination = destination;
}
public String getBusType() {
	return BusType;
}
public void setBusType(String busType) {
	BusType = busType;
}
public LocalTime getDeparturetime() {
	return departuretime;
}
public void setDeparturetime(LocalTime departuretime) {
	this.departuretime = departuretime;
}
public LocalTime getArrivaltime() {
	return arrivaltime;
}
public void setArrivaltime(LocalTime arrivaltime) {
	this.arrivaltime = arrivaltime;
}
public int getTotalseat() {
	return totalseat;
}
public void setTotalseat(int totalseat) {
	this.totalseat = totalseat;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
@Override
public String toString() {
	return "BusEntity [id=" + id + ", BusName=" + BusName + ", destination=" + destination + ", BusType=" + BusType
			+ ", departuretime=" + departuretime + ", arrivaltime=" + arrivaltime + ", totalseat=" + totalseat
			+ ", price=" + price + "]";
} 
 
 
}
