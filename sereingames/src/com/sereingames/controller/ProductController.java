package com.sereingames.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.commom.HttpRequestDeviceUtils;
import com.sereingames.model.HomeWebDto;
import com.sereingames.model.ProductServiceInDto;
import com.sereingames.model.ProductServiceOutDto;
import com.sereingames.model.ProductWebDto;
import com.sereingames.service.ProductService;


@Controller

public class ProductController {


    /**
     * 产品
     * 
     * @return
     */
    @RequestMapping("/product")
    public ModelAndView toProduct(HttpServletRequest request) {
        ModelAndView view = new ModelAndView();
        ProductWebDto webDto = new ProductWebDto();

        String para = request.getParameter("para");
        
        ProductService productService = new ProductService();
        ProductServiceInDto serviceInDto = new ProductServiceInDto();
        
        serviceInDto.setPara(para);
        ProductServiceOutDto serviceOutDto = new ProductServiceOutDto();
        
        serviceOutDto = productService.init(serviceInDto);
        webDto.setProductTitleMap(serviceOutDto.getProductTitleMap());
        webDto.setDetailDtoList(serviceOutDto.getDetailDtoList());
        
        if (StringUtils.isEmpty(para)) {
            webDto.setCurrentTab("product_all");
            webDto.setSubTitle("header.product");
        }else if("product_smt_testing".equals(para)){
            webDto.setCurrentTab("product_smt_testing");
            webDto.setSubTitle("header.product.subtitle1");
        }else if("product_smt_production".equals(para)){
            webDto.setCurrentTab("product_smt_production");
            webDto.setSubTitle("header.product.subtitle2");
        }else if("product_smt_fixture".equals(para)){
            webDto.setCurrentTab("product_smt_fixture");
            webDto.setSubTitle("header.product.subtitle3");
        }else if("product_automation".equals(para)){
            webDto.setCurrentTab("product_automation");
            webDto.setSubTitle("header.product.subtitle4");
        }else if("product_semiconductor".equals(para)){
            webDto.setCurrentTab("product_semiconductor");
            webDto.setSubTitle("header.product.subtitle5");
        }else if("product_smt_ancillary".equals(para)){
            webDto.setCurrentTab("product_smt_ancillary");
            webDto.setSubTitle("header.product.subtitle6");
        }else if("product_automatic_screw".equals(para)){
            webDto.setCurrentTab("product_automatic_screw");
            webDto.setSubTitle("header.product.subtitle7");
        }else if("product_depanel".equals(para)){
            webDto.setCurrentTab("product_depanel");
            webDto.setSubTitle("header.product.subtitle8");
        }
        
        webDto.setSpFlg(HttpRequestDeviceUtils.isMobileDevice(request));// 电脑手机区分

        view.addObject("webDto", webDto);
        view.setViewName("product/product");

        return view;
    }
    

    /**
     * 产品详细
     * 
     * @return
     */
    @RequestMapping("/product-view")
    public ModelAndView toProductView(HttpServletRequest request) {
        ModelAndView view = new ModelAndView();
        ProductWebDto webDto = new ProductWebDto();

        String id = request.getParameter("ID");
        int idInt = id == null ? 0 : Integer.valueOf(id);
        
//        ProductService productService = new ProductService();
//        ProductServiceInDto serviceInDto = new ProductServiceInDto();
        
        webDto.setId(id);
        webDto.setSpFlg(HttpRequestDeviceUtils.isMobileDevice(request));// 电脑手机区分
        
        

        ProductService productService = new ProductService();
        ProductServiceInDto serviceInDto = new ProductServiceInDto();
        
        serviceInDto.setPara(id);
        ProductServiceOutDto serviceOutDto = new ProductServiceOutDto();
        serviceOutDto = productService.initDetail(serviceInDto);
        webDto.setDetailDto(serviceOutDto.getProductDetailDto());
        
        //子标题
        if(20 > idInt) {
        	//分板机
            webDto.setSubTitle("header.product.subtitle8");
        }else if(20 < idInt && 40 > idInt) {
        	//SMT生产类设备
            webDto.setSubTitle("header.product.subtitle7");
        }else if(40 < idInt && 60 > idInt) {
        	//SMT治具类
            webDto.setSubTitle("header.product.subtitle6");
        }else if(60 < idInt && 80 > idInt) {
        	//SMT检测设备
            webDto.setSubTitle("header.product.subtitle5");
        }else if(80 < idInt && 100 > idInt) {
        	//SMT辅助服务
            webDto.setSubTitle("header.product.subtitle4");
        }else if(100 < idInt && 120 > idInt) {
        	//自动锁螺丝机
            webDto.setSubTitle("header.product.subtitle3");
        }else if(120 < idInt && 140 > idInt) {
        	//自动化设备
            webDto.setSubTitle("header.product.subtitle2");
        }else if(140 < idInt && 160 > idInt) {
        	//半导体设备
            webDto.setSubTitle("header.product.subtitle1");
        }
         
        view.addObject("webDto", webDto);
        view.setViewName("product/product-view");

        return view;
    }

}