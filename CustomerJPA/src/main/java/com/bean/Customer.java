package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	
@Id
private int cid;
private String username,password,email,address,phoneno;

public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getPhoneno() {
	return phoneno;
}
public void setPhoneno(String phoneno) {
	this.phoneno = phoneno;
}
@Override
public String toString() {
	return "Customer [cid=" + cid + ", username=" + username + ", password=" + password + ", email=" + email
			+ ", address=" + address + ", phoneno=" + phoneno + "]";
}


}
