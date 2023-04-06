package com.neptunesoftware.integrator.balanceEnquiry;

import com.neptunesoftware.integrator.config.RubikonCredentials;
import data.account.BalanceEnquiryRequestData;
import data.account.Balanceenquiry;
import data.account.BalanceenquiryResponse;
import jakarta.xml.bind.JAXBElement;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
@RequiredArgsConstructor
public class BalanceEnquiryImplService implements BalanceEnquiryServices{

    @Value("${endpoints.accountWebService}")
    private String ACCOUNT_WEB_SERVICE_END_POINT_PORT;

    private final RubikonCredentials rubikonCredentials;

    private static final String PACKAGE_TO_SCAN = "data/account";
    @Override
    public BalanceenquiryResponse balanceEnquiry(String accountNumber) {
        WebServiceTemplate webServiceTemplate = new WebServiceTemplate(marshaller());
        BalanceEnquiryRequestData balEnqRequest = buildRequest(accountNumber);

        Balanceenquiry balanceenquiry = new Balanceenquiry();
        balanceenquiry.setArg0(balEnqRequest);
        JAXBElement response = null;

        try {
            response = (JAXBElement) webServiceTemplate.marshalSendAndReceive(
                ACCOUNT_WEB_SERVICE_END_POINT_PORT, balanceenquiry);
            return (BalanceenquiryResponse) response.getValue();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        assert response != null;
        return (BalanceenquiryResponse) response.getValue();
    }

    private BalanceEnquiryRequestData buildRequest(String accountNumber) {
        BalanceEnquiryRequestData balEnqRequest = new BalanceEnquiryRequestData();
        balEnqRequest.setSessionId(String.valueOf(System.currentTimeMillis()));
        balEnqRequest.setDestinationInstitutionCode("");
        balEnqRequest.setChannelCode(rubikonCredentials.getChannelId());

        balEnqRequest.setAuthorizationCode("");
        balEnqRequest.setTargetAccountName("");
        balEnqRequest.setTargetBankVerificationNumber("");
        balEnqRequest.setTargetAccountNumber(accountNumber);
        return balEnqRequest;
    }

    private Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // this package must match the package in the <generatePackage> specified in
        // pom.xml
        marshaller.setPackagesToScan(PACKAGE_TO_SCAN);
        return marshaller;
    }
}
