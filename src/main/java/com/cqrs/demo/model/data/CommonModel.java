package com.cqrs.demo.model.data;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CommonModel implements Serializable {

	private static final long serialVersionUID = 1L;
	// guid
	private String guid;
}
