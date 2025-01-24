package com.fitriani.bank_application.service;

import com.fitriani.bank_application.dto.BankResponse;
import com.fitriani.bank_application.dto.UserRequest;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);
}
