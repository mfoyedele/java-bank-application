package com.mfoyedele.javabankapplication.service.impl;

import com.mfoyedele.javabankapplication.dto.BankResponse;
import com.mfoyedele.javabankapplication.dto.UserRequest;
import com.mfoyedele.javabankapplication.entity.User;
import com.mfoyedele.javabankapplication.repository.UserRepository;
import com.mfoyedele.javabankapplication.utils.AccountUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public BankResponse createAccount(UserRequest userRequest) {
        /**
         * Creating an account - saving a new user into the db
         * Check if user already has an account
         */
        User newUser = User.builder()
                .firstName(userRequest.getFirstName())
                .lastName(userRequest.getLastName())
                .otherName(userRequest.getOtherName())
                .gender(userRequest.getGender())
                .address(userRequest.getAddress())
                .stateOfOrigin(userRequest.getStateOfOrigin())
                .accountNumber(AccountUtils.generateAccountNumber())
                .accountBalance(BigDecimal.ZERO)
                .email(userRequest.getEmail())
                .phoneNumber(userRequest.getPhoneNumber())
                .alternatePhoneNumber(userRequest.getAlternatePhoneNumber())
                .status("ACTIVE")
                .build();
    }
}
