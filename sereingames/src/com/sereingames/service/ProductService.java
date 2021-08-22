package com.sereingames.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import com.alibaba.druid.util.StringUtils;
import com.sereingames.model.ProductDetailDto;
import com.sereingames.model.ProductServiceInDto;
import com.sereingames.model.ProductServiceOutDto;
public class ProductService {
	
	
	
	

	/**
	 * 产品页面初始化
	 */
	public ProductServiceOutDto init(ProductServiceInDto indto) {
		
		String para = indto.getPara();
		//title Map
		List<String> productTitleMapValue= new ArrayList<String>();
		productTitleMapValue.add("product_smt_testing");
		productTitleMapValue.add("product_smt_production");
		productTitleMapValue.add("product_smt_fixture");
		productTitleMapValue.add("product_automation");
		productTitleMapValue.add("product_semiconductor");
		productTitleMapValue.add("product_smt_ancillary");
		productTitleMapValue.add("product_automatic_screw");
		productTitleMapValue.add("product_depanel");
		
		ProductServiceOutDto outDto = new ProductServiceOutDto();
		Map<String, String> productTitleMap = new HashMap<String, String>();
		for (int i=1;i<4;i++) {
			productTitleMap.put("header.product.subtitle" + i, productTitleMapValue.get(i -1));
		}
		outDto.setProductTitleMap(productTitleMap);
		
		//detail List
		List<ProductDetailDto> productDetailListValue= new ArrayList<ProductDetailDto>();
		Properties properties = new Properties();
		InputStream input = null;
		
		try {
			input =  this.getClass().getResourceAsStream("./properties/product.properties");//加载Java项目根路径下的配置文件
			properties.load(input);// 加载属性文件

			Set<Map.Entry<Object, Object>> entrySet = properties.entrySet();//返回的属性键值对实体
			int propertiesCount = 0;
			for (Map.Entry<Object, Object> entry : entrySet) {
				if(entry.getKey()!= null && entry.getValue()!= null) {
					propertiesCount ++ ;
				}
			}
			
			
			for (int i = 1; i< propertiesCount / 3 + 1; i++) {
				if (para == null || para.equals("") || para.equals("product_all")) {
					//全部显示
					ProductDetailDto productDetailDto = new ProductDetailDto();
					productDetailDto.setTitle("product.detail.title" + i);
					productDetailDto.setImgName(avoidNull(properties.getProperty("imgName"+i)));
					productDetailDto.setCategory(avoidNull(properties.getProperty("category"+i)));
					
					productDetailListValue.add(productDetailDto);
				}else if (para.equals(avoidNull(properties.getProperty("category"+i)))) {
					//根据对应的产品分类显示
					ProductDetailDto productDetailDto = new ProductDetailDto();
					productDetailDto.setTitle("product.detail.title" + i);
					productDetailDto.setImgName(avoidNull(properties.getProperty("imgName"+i)));
					productDetailDto.setCategory(avoidNull(properties.getProperty("category"+i)));
					
					productDetailListValue.add(productDetailDto);
					
				}
			}
		} catch (IOException io) {
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			outDto.setDetailDtoList(productDetailListValue);
		}
		
		
		return outDto;
		
	}
	
	

	/**
	 * 产品详细页面初始化
	 */
	public ProductServiceOutDto initDetail(ProductServiceInDto indto) {
		
		String id = indto.getPara();
		
		ProductServiceOutDto outDto = new ProductServiceOutDto();
		Properties properties = new Properties();
		InputStream input = null;
		
		try {
			input =  this.getClass().getResourceAsStream("./properties/productDetail.properties");//加载Java项目根路径下的配置文件
			properties.load(input);// 加载属性文件

			Set<Map.Entry<Object, Object>> entrySet = properties.entrySet();//返回的属性键值对实体
			int propertiesCount = 0;
			for (Map.Entry<Object, Object> entry : entrySet) {
				if(entry.getKey()!= null && entry.getValue()!= null) {
					propertiesCount ++ ;
				}
			}
			
			ProductDetailDto productDetailDto = new ProductDetailDto();
			productDetailDto.setDetailImgName0(avoidNull(properties.getProperty("detailImgName" + id + "_0")));
			productDetailDto.setDetailImgName1(avoidNull(properties.getProperty("detailImgName" + id + "_1")));
			productDetailDto.setDetailImgName2(avoidNull(properties.getProperty("detailImgName" + id + "_2")));
			productDetailDto.setDetailImgName3(avoidNull(properties.getProperty("detailImgName" + id + "_3")));
			productDetailDto.setDetailImgName4(avoidNull(properties.getProperty("detailImgName" + id + "_4")));

			outDto.setProductDetailDto(productDetailDto);
		} catch (IOException io) {
			
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
		
		
		return outDto;
		
	}

	private String avoidNull(String para) {
		if(StringUtils.isEmpty(para)) {
			return "";
		}
		return para;
	}

}
