package com.sereingames.model;

import java.util.List;
import java.util.Map;

public class ProductServiceOutDto {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 802516060441676434L;

	public ProductServiceOutDto() {
	}
	private Map<String, String> productTitleMap;//子标题目录Map
	private List<ProductDetailDto> detailDtoList ; //产品明细dto list(产品页面用)

	private ProductDetailDto productDetailDto = new ProductDetailDto();//(产品详细页面用)
	
	
	public ProductServiceOutDto(Map<String, String> productTitleMap, List<ProductDetailDto> detailDtoList) {
		super();
		this.setProductTitleMap(productTitleMap);
		this.setDetailDtoList(detailDtoList);
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the productTitleMap
	 */
	public Map<String, String> getProductTitleMap() {
		return productTitleMap;
	}

	/**
	 * @param productTitleMap the productTitleMap to set
	 */
	public void setProductTitleMap(Map<String, String> productTitleMap) {
		this.productTitleMap = productTitleMap;
	}

	/**
	 * @return the detailDtoList
	 */
	public List<ProductDetailDto> getDetailDtoList() {
		return detailDtoList;
	}

	/**
	 * @param detailDtoList the detailDtoList to set
	 */
	public void setDetailDtoList(List<ProductDetailDto> detailDtoList) {
		this.detailDtoList = detailDtoList;
	}

	/**
	 * @return the productDetailDto
	 */
	public ProductDetailDto getProductDetailDto() {
		return productDetailDto;
	}

	/**
	 * @param productDetailDto the productDetailDto to set
	 */
	public void setProductDetailDto(ProductDetailDto productDetailDto) {
		this.productDetailDto = productDetailDto;
	}

	
}

