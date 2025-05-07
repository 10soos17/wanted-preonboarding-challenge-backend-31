package com.cqrs.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cqrs.demo.model.data.CommonError;
import com.cqrs.demo.model.data.CommonResponse;
import com.cqrs.demo.model.data.ErrorMessage;
import com.cqrs.demo.model.dto.User;
import com.cqrs.demo.service.TestService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/cqrs")
public class TestController {

	@Autowired
	private TestService testService;
	
	// 1 성공응답 
	@RequestMapping(method = RequestMethod.GET, value = "/success")
	public CommonResponse getTestSuccessUserSelectList() {
		//log.info("test");
		System.out.println("===============getTestSuccessUserSelectList_controller");
		
		List<User> res = testService.testSelectList();
		
		CommonResponse commonRes = new CommonResponse<User>(res, "성공했습니다.");
		commonRes.setData(res);
		/*
		List<Map<String, Object>> resObj = new ArrayList<>();
		
		for(int i = 0; i < res.size(); i++) {
			Map<String, Object> map = new HashMap<>();
			//String name = res.get(i).getName();
			//int id = res.get(i).getId();
			map.put("name", name);
			map.put("id", id);
			resObj.add(map);
		};*/
		System.out.println("===============getTestSuccessUserSelectList_controller_____res"+commonRes);
		
		return commonRes;
	}
	// 2 에러응답
	@RequestMapping(method = RequestMethod.GET, value = "/fail")
	public CommonError getTestFailSelectList() {
		System.out.println("===============getTestFailSelectList_controller");
		
		// 2 에러응답
		ErrorMessage errMsg = new ErrorMessage("404", "Not Found");
		CommonError commonError = new CommonError(errMsg);
		
		System.out.println("===============getTestFailSelectList_controller_____res"+commonError);
		
		return commonError;
	}
}