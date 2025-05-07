package com.cqrs.demo.model.data;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class CommonResponse<T> {
	/*
	 * 요청 결과
	 */
	private final boolean success = true;
	
	/*
	 * 데이터
	 */
	private List<T> data;
	
	/*
	 * 메시지
	 */
	private String message;

    public CommonResponse(List<T> data, String message) {
		super();
		this.data = data;
		this.message = message;
	}


	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isSuccess() {
		return success;
	}

}
