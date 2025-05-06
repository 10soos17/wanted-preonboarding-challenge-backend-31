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
public class CommonResponse {

    /*
     * 요청 결과
     */
    private final boolean success = true;

    /*
     * 데이터
     */
    private Object data;
    
    /*
     * 메시지
     */
    private String message;

}
