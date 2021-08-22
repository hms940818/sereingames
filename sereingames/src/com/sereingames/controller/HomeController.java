package com.sereingames.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.commom.HttpRequestDeviceUtils;
import com.sereingames.model.HomeWebDto;


@Controller

public class HomeController {

	/**
     * 初始化 
     * 
     * @return
     */
	@RequestMapping("/home")
    public ModelAndView init(HttpServletRequest request) {
		ModelAndView view = new ModelAndView();
		HomeWebDto webDto = new HomeWebDto();
		
        webDto.setCurrentTab("top");// 当前页面
        webDto.setSpFlg(HttpRequestDeviceUtils.isMobileDevice(request));// 电脑手机区分

		view.addObject("webDto", webDto);
		view.setViewName("home/home");
		
		return view;
	}

    /**
     * 关于我们
     * 
     * @return
     */
    @RequestMapping("/aboutus")
    public ModelAndView toAboutUs(HttpServletRequest request) {
        ModelAndView view = new ModelAndView();
        HomeWebDto webDto = new HomeWebDto();

        String para = request.getParameter("para");
        if (StringUtils.isEmpty(para) || "profile".equals(para)) {
            webDto.setCurrentTab("profile");
        }else if("philosophy".equals(para)){
            webDto.setCurrentTab("philosophy");
        }
        webDto.setSpFlg(HttpRequestDeviceUtils.isMobileDevice(request));// 电脑手机区分

        view.addObject("webDto", webDto);
        view.setViewName("aboutus/aboutus");

        return view;
    }

    /**
     * 新闻
     * 
     * @return
     */
    @RequestMapping("/news")
    public ModelAndView toNews(HttpServletRequest request) {
        ModelAndView view = new ModelAndView();
        HomeWebDto webDto = new HomeWebDto();

        webDto.setCurrentTab("news");
        webDto.setSpFlg(HttpRequestDeviceUtils.isMobileDevice(request));// 电脑手机区分

        view.addObject("webDto", webDto);
        view.setViewName("news/news");

        return view;
    }

    /**
     * 联络我们
     * 
     * @return
     */
    @RequestMapping("/contact")
    public ModelAndView toContact(HttpServletRequest request) {
        ModelAndView view = new ModelAndView();
        HomeWebDto webDto = new HomeWebDto();

        webDto.setCurrentTab("contact");
        webDto.setSpFlg(HttpRequestDeviceUtils.isMobileDevice(request));// 电脑手机区分

        view.addObject("webDto", webDto);
        view.setViewName("contact/contact");

        return view;
    }

    /**
     * 登录
     * 
     * @return
     */
    @RequestMapping("/login")
    public String toLogin(HttpServletRequest request) {

        System.out.print("toLogin");
        return "login";
    }

    /**
     * 注册
     * 
     * @return
     */
    @RequestMapping("/regist")
    public String toRegist(HttpServletRequest request) {

        System.out.print("toRegist");
        return "regist/regist";
    }
	
}