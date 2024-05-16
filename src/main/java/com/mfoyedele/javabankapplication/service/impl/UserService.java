package com.mfoyedele.javabankapplication.service.impl;

import com.mfoyedele.javabankapplication.dto.BankResponse;
import com.mfoyedele.javabankapplication.dto.UserRequest;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);
}
