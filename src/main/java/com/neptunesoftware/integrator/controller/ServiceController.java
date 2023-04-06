package com.neptunesoftware.integrator.controller;

import com.neptunesoftware.integrator.account.GLToGLTransferRequest;
import com.neptunesoftware.integrator.account.GLtoGLXferServices;
import com.neptunesoftware.integrator.balanceEnquiry.BalanceEnquiryServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@CrossOrigin
@RestController
public class ServiceController {
    private final BalanceEnquiryServices balanceEnquiry;
    private final GLtoGLXferServices gLtoGLXferServices;
    @GetMapping("/balanceEnquiry/{accountNumber}")
    public ResponseEntity<?> getAccountBalance(@PathVariable String accountNumber){
    return ResponseEntity.ok(balanceEnquiry.balanceEnquiry(accountNumber));
    }

    @PostMapping("transfer/glToGLTransfer")
    public ResponseEntity<?> postGlToGlXfers(@RequestBody GLToGLTransferRequest glToGLTransferRequest){
        return ResponseEntity.ok(gLtoGLXferServices.glToGlXfer(glToGLTransferRequest));
    }

}
