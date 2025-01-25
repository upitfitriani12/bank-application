package com.fitriani.bank_application.service;

import com.fitriani.bank_application.dto.BankResponse;
import com.fitriani.bank_application.dto.CreditDebitRequest;
import com.fitriani.bank_application.dto.EnquiryRequest;
import com.fitriani.bank_application.dto.UserRequest;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);
    BankResponse balanceEnquiry(EnquiryRequest enquiryRequest);
    String nameEnquiry(EnquiryRequest request);
    BankResponse creditAccount(CreditDebitRequest request);
    BankResponse debitAccount(CreditDebitRequest request);
}
