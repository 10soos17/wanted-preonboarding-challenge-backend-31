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
public class ErrorMessage {
    /*
     * 에러코드
     */
    private String code;

    /*
     * 에러내용
     */
    private String message;
}
