package com.vighnesh153.interviewbitclone.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class ResponseDto<T> {
    private HttpStatus status;
    private T data;

    public ResponseDto(HttpStatus status, T data) {
        this.status = status;
        this.data = data;
    }
}
