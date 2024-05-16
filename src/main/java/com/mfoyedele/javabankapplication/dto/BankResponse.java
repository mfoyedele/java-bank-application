package com.mfoyedele.javabankapplication.dto;

import lombok.Builder;

@Builder
public class BankResponse {
    private String responseCode;
    private String responseMessage;
    private AccountInfo accountInfo;
}
