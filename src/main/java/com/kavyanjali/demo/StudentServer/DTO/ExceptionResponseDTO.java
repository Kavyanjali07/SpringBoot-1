package com.kavyanjali.demo.StudentServer.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

//public class ExceptionResponseDTO {
//    public ExceptionResponseDTO(LocalDateTime now, int value, String reasonPhrase, String message, String requestURI) {
//    }

    @Data
    @AllArgsConstructor
    public class ExceptionResponseDTO{
        private LocalDateTime timestamp;
        private int statusCode;
        private String error;
        private String message;
        private String path;

    }

