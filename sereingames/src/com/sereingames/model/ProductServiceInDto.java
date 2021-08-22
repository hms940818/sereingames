package com.sereingames.model;

public class ProductServiceInDto {
	
	/**
	 * ²úÆ·Ã÷Ï¸dto
	 */
	private static final long serialVersionUID = 802516060441676434L;

	public ProductServiceInDto() {
	}
	private String para;
	
	public ProductServiceInDto(String para) {
		super();
		this.setPara(para);
	}

	

	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	/**
	 * @return the para
	 */
	public String getPara() {
		return para;
	}



	/**
	 * @param para the para to set
	 */
	public void setPara(String para) {
		this.para = para;
	}
	
	
}

