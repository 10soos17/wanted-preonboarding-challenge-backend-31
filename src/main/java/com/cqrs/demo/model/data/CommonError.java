package com.cqrs.demo.model.data;

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
public class CommonError {
	/*
	 * 요청 결과
	 */
	private final boolean success = false;
	/*
	 * 에러 코드, 메시지
	 */   
	private ErrorMessage error;
	
    public CommonError(ErrorMessage error) {
		super();
		this.error = error;
	}
	public ErrorMessage getError() {
		return error;
	}
	public void setError(ErrorMessage error) {
		this.error = error;
	}
	public boolean isSuccess() {
		return success;
	}

}
