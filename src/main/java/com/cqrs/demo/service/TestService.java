package com.cqrs.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cqrs.demo.mapper.TestMapper;
import com.cqrs.demo.model.dto.Hello;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class TestService {

	@Autowired
	private TestMapper testMapper;

	public List<Hello> testSelectList() {
		System.out.println("===============test_service");
		List<Hello> res = testMapper.testSelectList();
		System.out.println("===============test_service__________res");
		return res;
	}
}