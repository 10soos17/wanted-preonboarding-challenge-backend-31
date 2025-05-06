package com.cqrs.demo.model.dto;

import org.apache.ibatis.type.Alias;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Alias(value="hello")
public class Hello {
	private String name;
	private int id;

	@Builder
	public Hello(String name, int id) {
		System.out.println("===============test_Hello_model:" + name);
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Hello [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

}
