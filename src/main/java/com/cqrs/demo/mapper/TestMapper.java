package com.cqrs.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cqrs.demo.model.dto.User;

@Mapper
//@Repository
public interface TestMapper {
	
	// Hello selectTest();
	
	List<User> testSelectList();
}