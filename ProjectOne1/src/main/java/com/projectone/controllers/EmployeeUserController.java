package com.projectone.controllers;

import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.projectone.model.EmployeeUser;
import com.projectone.service.EmployeeUserService;
import com.projectone.service.ReimbursementService;
import com.projectone.util.ResponseMapper;

public class EmployeeUserController {
	private Logger log = Logger.getRootLogger();
	private EmployeeUserService empUserService = EmployeeUserService.currentImplementation;

	public void process(HttpServletRequest reqt, HttpServletResponse resp) {
		
		String method = reqt.getMethod();
		switch (method) {
		case "GET":
			processGet(reqt, resp);
			break;
		case "POST":
			processPost(reqt, resp);
			break;
		case "OPTIONS":
			return;
		default:
			resp.setStatus(404);
			break;
		}
	}

	private void processPost(HttpServletRequest reqt, HttpServletResponse resp) {
//		String uri = reqt.getRequestURI();
//		String context = "Reimbursements";
//		
//		uri = uri.substring(context.length() + 2, uri.length());
//		
//		String[] uriArray = uri.split("/");
//		System.out.println(Arrays.toString(uriArray));
//		
//		if (uriArray.length == 1) {
//			
//			log.info("retreiving all users");
//			
//			List<EmployeeUser> empUser = empUserService.findRequestAllEmployees();
//			
//			return;
//			
//		} else if (uriArray.length == 2) {
//			try {
//				int id = Integer.parseInt(uriArray[1]);
//				log.info("retreiving user with id: " + id);
//				EmployeeUser empUser = us.findById(id);
//				ResponseMapper.convertAndAttach(user, resp);
//				return;
//			} catch (NumberFormatException e) {
//				resp.setStatus(400);
//				return;
//			}
//		} else {
//			resp.setStatus(404);
//		}
//		
	}

	private void processGet(HttpServletRequest reqt, HttpServletResponse resp) {
		
		
	}

}
