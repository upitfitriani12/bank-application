package com.fitriani.bank_application.service;

import com.fitriani.bank_application.dto.EmailDetails;

public interface EmailService {
    void sendEmailAlert(EmailDetails emailDetails);
}
