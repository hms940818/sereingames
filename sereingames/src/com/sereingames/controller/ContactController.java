package com.sereingames.controller;

import java.io.UnsupportedEncodingException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sereingames.model.ContactServiceInDto;
import com.sereingames.model.ContactWebdto;
import com.sereingames.service.ContactService;


@Controller

public class ContactController {

	@RequestMapping("/submitContact")
	public ModelAndView submitContact(ContactWebdto webdto){
		ModelAndView view = new ModelAndView();
		ContactServiceInDto contactServiceInDto = new ContactServiceInDto();
		
		contactServiceInDto.setDetailMessage(webdto.getDetailMessage());
		contactServiceInDto.setEmail(webdto.getEmail());
		contactServiceInDto.setName(webdto.getName());
		contactServiceInDto.setTel(webdto.getTel());
		
		ContactService contactService = new ContactService();
		contactService.senMail(contactServiceInDto);
		
		view.addObject("userBean", webdto);
		view.setViewName("contact/contactComplete");
		
		return view;
	}
	
}