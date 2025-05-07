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
@Alias(value="user")
//id, name, email, avatar_url, created_at
public class User {
	public User(int id, String name, String email, String avatar_url, String created_at) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.avatar_url = avatar_url;
		this.created_at = created_at;
	}

	private int id;
	private String name;
	private String email;
	private String avatar_url;
	private String created_at;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAvatar_url() {
		return avatar_url;
	}

	public void setAvatar_url(String avatar_url) {
		this.avatar_url = avatar_url;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
}
