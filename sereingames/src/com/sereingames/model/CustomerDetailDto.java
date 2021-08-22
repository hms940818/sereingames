package com.sereingames.model;

public class CustomerDetailDto {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 802516060441676434L;

	public CustomerDetailDto() {
	}	
	
	private String title;//标题
	private String imgName;//图片名称
	private String category;//所属目录
	
	public CustomerDetailDto(String title, String imgName, String category) {
		super();
		this.title = title;
		this.imgName = imgName;
		this.category = category;
	}


	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}



	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}



	/**
	 * @return the imgName
	 */
	public String getImgName() {
		return imgName;
	}



	/**
	 * @param imgName the imgName to set
	 */
	public void setImgName(String imgName) {
		this.imgName = imgName;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}


	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	
	
}

