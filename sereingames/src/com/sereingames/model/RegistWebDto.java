package com.sereingames.model;

import java.io.Serializable;

public class RegistWebDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 802516060441676434L;

	public RegistWebDto() {
		// TODO Auto-generated constructor stub
	}
	private String name;
	private String sex;
	private String email;
	private String password;
	private String birthday;
	
	public RegistWebDto(String name, String sex, String email, String password,
			String birthday) {
		super();
		this.name = name;
		this.sex = sex;
		this.email = email;
		this.password = password;
		this.birthday = birthday;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the birthday
	 */
	public String getBirthday() {
		return birthday;
	}

	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
}
