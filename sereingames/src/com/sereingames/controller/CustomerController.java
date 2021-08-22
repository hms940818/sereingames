package com.sereingames.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.commom.HttpRequestDeviceUtils;
import com.sereingames.model.CustomerServiceOutDto;
import com.sereingames.model.CustomerWebDto;
import com.sereingames.service.CustomerService;

@Controller

public class CustomerController {

    
    /**
     * 合作伙伴
     * 
     * @return
     */
    @RequestMapping("/customer")
    public ModelAndView toCustomer(HttpServletRequest request) {
        ModelAndView view = new ModelAndView();
        CustomerWebDto webDto = new CustomerWebDto();

        //String para = request.getParameter("para");
        webDto.setCurrentTab("customer");
        webDto.setSpFlg(HttpRequestDeviceUtils.isMobileDevice(request));// 电脑手机区分


        CustomerService customerService = new CustomerService();
        CustomerServiceOutDto serviceOutDto = new CustomerServiceOutDto();
        
        serviceOutDto = customerService.init();
        webDto.setDetailDtoList(serviceOutDto.getDetailDtoList());
        
        view.addObject("webDto", webDto);
        view.setViewName("customer/customer");

        return view;
    }

    

}