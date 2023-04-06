package com.neptunesoftware.integrator.account;

import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;

@Builder
@Getter
public class GLToGLTransferRequest {
    private String fromGLAccountNumber;
    private String toGLAccountNumber;
    private BigDecimal amount;
    private BigDecimal transactionAmount;
    private String txnReference;
}
