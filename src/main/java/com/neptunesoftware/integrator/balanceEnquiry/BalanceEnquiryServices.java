package com.neptunesoftware.integrator.balanceEnquiry;

import data.account.BalanceenquiryResponse;

public interface BalanceEnquiryServices {
    BalanceenquiryResponse balanceEnquiry(String accountNumber);
}
