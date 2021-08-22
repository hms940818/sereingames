package com.sereingames.model;

public class ContactServiceInDto {
	/**
	 * 
	 */
	private static final long serialVersionUID = 802516060441676434L;

	public ContactServiceInDto() {
		// TODO Auto-generated constructor stub
	}
	private String name;
	private String email;
	private String tel;
	private String detailMessage;
	
	public ContactServiceInDto(String name, String email, String tel, String detailMessage) {
		super();
		this.name = name;
		this.email = email;
		this.tel = tel;
		this.detailMessage = detailMessage;
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
	 * @return the tel
	 */
	public String getTel() {
		return tel;
	}

	/**
	 * @param tel the tel to set
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}

	/**
	 * @return the detailMessage
	 */
	public String getDetailMessage() {
		return detailMessage;
	}

	/**
	 * @param detailMessage the detailMessage to set
	 */
	public void setDetailMessage(String detailMessage) {
		this.detailMessage = detailMessage;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}

