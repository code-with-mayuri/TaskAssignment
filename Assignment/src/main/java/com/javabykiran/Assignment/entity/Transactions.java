package com.javabykiran.Assignment.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Transactions {
int busid;
String username;
String email;
String busname;
int noofseat;
float price;
int total;
String date;
@Id
public int getBusid() {
	return busid;
}
public void setBusid(int busid) {
	this.busid = busid;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getBusname() {
	return busname;
}
public void setBusname(String busname) {
	this.busname = busname;
}
public int getNoofseat() {
	return noofseat;
}
public void setNoofseat(int noofseat) {
	this.noofseat = noofseat;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public int getTotal() {
	return total;
}
public void setTotal(int total) {
	this.total = total;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
@Override
public String toString() {
	return "Transaction [busid=" + busid + ", username=" + username + ", email=" + email + ", busname=" + busname
			+ ", noofseat=" + noofseat + ", price=" + price + ", total=" + total + ", date=" + date + "]";
}


}
