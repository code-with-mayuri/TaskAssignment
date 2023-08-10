package com.javabykiran.Assignment.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	 private Long id;
	    private String userName;
	    private String encryptedPassword;
	    private boolean enable;
	    @Id
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getEncryptedPassword() {
			return encryptedPassword;
		}
		public void setEncryptedPassword(String encryptedPassword) {
			this.encryptedPassword = encryptedPassword;
		}
		public boolean isEnable() {
			return enable;
		}
		public void setEnable(boolean enable) {
			this.enable = enable;
		}
		@Override
		public String toString() {
			return "User [id=" + id + ", userName=" + userName + ", encryptedPassword=" + encryptedPassword
					+ ", enable=" + enable + "]";
		}
	    
	    
}
