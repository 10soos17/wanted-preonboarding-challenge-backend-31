package com.cqrs.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cqrs.demo.model.dto.Hello;
import com.cqrs.demo.service.TestService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/cqrs")
public class ServiceController {

	@Autowired
	private TestService testService;

	@RequestMapping(method = RequestMethod.GET, value = "/test")
	public List<Map<String, Object>> getTestSelectList() {
		//log.info("test");
		System.out.println("===============testt_controller");
		List<Hello> res = testService.testSelectList();
		List<Map<String, Object>> resObj = new ArrayList<>();
		
		for(int i = 0; i < res.size(); i++) {
			Map<String, Object> map = new HashMap<>();
			String name = res.get(i).getName();
			int id = res.get(i).getId();
			map.put("name", name);
			map.put("id", id);
			resObj.add(map);
		};
		System.out.println("===============test_controller_____res");
		return resObj;
	}
}