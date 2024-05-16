package com.mfoyedele.javabankapplication.service.impl;

import com.mfoyedele.javabankapplication.dto.BankResponse;
import com.mfoyedele.javabankapplication.dto.UserRequest;
import com.mfoyedele.javabankapplication.entity.User;

public class UserServiceImpl implements UserService {

    @Override
    public BankResponse createAccount(UserRequest userRequest) {
        /**
         * Creating an account -
         */
        User newUser = User.builder()
                .firstName(userRequest.getFirstName())
                .lastName(userRequest.getLastName())
                .otherName(userRequest.getOtherName())

                .build();
    }
}
