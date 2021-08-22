package com.sereingames.model;

public class ProductDetailDto {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 802516060441676434L;

	public ProductDetailDto() {
	}	
	
	private String title;//±êÌâ
	private String imgName;//Í¼Æ¬Ãû³Æ
	private String category;//ËùÊôÄ¿Â¼
	private String detailImgName0;//ÏêÏ¸Í¼Æ¬Ãû³Æ0(²úÆ·±¾Éí´óÍ¼)
	private String detailImgName1;//ÏêÏ¸Í¼Æ¬Ãû³Æ1
	private String detailImgName2;//ÏêÏ¸Í¼Æ¬Ãû³Æ2
	private String detailImgName3;//ÏêÏ¸Í¼Æ¬Ãû³Æ3
	private String detailImgName4;//ÏêÏ¸Í¼Æ¬Ãû³Æ4
	
	public ProductDetailDto(String title, String imgName, String category) {
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


	/**
	 * @return the detailImgName1
	 */
	public String getDetailImgName1() {
		return detailImgName1;
	}


	/**
	 * @param detailImgName1 the detailImgName1 to set
	 */
	public void setDetailImgName1(String detailImgName1) {
		this.detailImgName1 = detailImgName1;
	}


	/**
	 * @return the detailImgName2
	 */
	public String getDetailImgName2() {
		return detailImgName2;
	}


	/**
	 * @param detailImgName2 the detailImgName2 to set
	 */
	public void setDetailImgName2(String detailImgName2) {
		this.detailImgName2 = detailImgName2;
	}


	/**
	 * @return the detailImgName3
	 */
	public String getDetailImgName3() {
		return detailImgName3;
	}


	/**
	 * @param detailImgName3 the detailImgName3 to set
	 */
	public void setDetailImgName3(String detailImgName3) {
		this.detailImgName3 = detailImgName3;
	}


	/**
	 * @return the detailImgName4
	 */
	public String getDetailImgName4() {
		return detailImgName4;
	}


	/**
	 * @param detailImgName4 the detailImgName4 to set
	 */
	public void setDetailImgName4(String detailImgName4) {
		this.detailImgName4 = detailImgName4;
	}


	/**
	 * @return the detailImgName0
	 */
	public String getDetailImgName0() {
		return detailImgName0;
	}


	/**
	 * @param detailImgName0 the detailImgName0 to set
	 */
	public void setDetailImgName0(String detailImgName0) {
		this.detailImgName0 = detailImgName0;
	}
	
	
}

