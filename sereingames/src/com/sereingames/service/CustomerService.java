package com.sereingames.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import com.alibaba.druid.util.StringUtils;
import com.sereingames.model.CustomerDetailDto;
import com.sereingames.model.CustomerServiceOutDto;
import com.sereingames.model.ProductDetailDto;
import com.sereingames.model.ProductServiceInDto;
import com.sereingames.model.ProductServiceOutDto;
public class CustomerService {
	
	
	
	

	/**
	 * 初始化
	 */
	public CustomerServiceOutDto init() {

		CustomerServiceOutDto outDto = new CustomerServiceOutDto();
        List<CustomerDetailDto> customerDetailListValue= new ArrayList<CustomerDetailDto>();
		Properties properties = new Properties();
		InputStream input = null;
		
		try {
			input =  this.getClass().getResourceAsStream("./properties/customerDetail.properties");//加载Java项目根路径下的配置文件
			properties.load(input);// 加载属性文件

			Set<Map.Entry<Object, Object>> entrySet = properties.entrySet();//返回的属性键值对实体
			int propertiesCount = 0;
			for (Map.Entry<Object, Object> entry : entrySet) {
				if(entry.getKey()!= null && entry.getValue()!= null) {
					propertiesCount ++ ;
				}
			}
			
			
			for (int i = 1; i< propertiesCount + 1; i++) {
				//全部显示
				CustomerDetailDto productDetailDto = new CustomerDetailDto();
				productDetailDto.setTitle("customer.detail.title" + i);
				productDetailDto.setImgName(avoidNull(properties.getProperty("imgName"+i)));
				
				customerDetailListValue.add(productDetailDto);
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

			outDto.setDetailDtoList(customerDetailListValue);
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
