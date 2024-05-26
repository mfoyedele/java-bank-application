package com.mfoyedele.javabankapplication.service.impl;

import com.mfoyedele.javabankapplication.dto.EmailDetails;

public abstract class EmailService {
    abstract void sendEmailAlert(EmailDetails emailDetails);
}
