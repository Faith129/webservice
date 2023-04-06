package com.neptunesoftware.integrator.account;

import com.neptunesoftware.integrator.config.RubikonCredentials;
import data.account.BalanceenquiryResponse;
import data.transaction.GLTransferRequest;
import data.transaction.PostGLtoGLXfer;
import data.transaction.PostGLtoGLXferResponse;
import jakarta.xml.bind.JAXBElement;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class GLtoGLXferImplServices implements GLtoGLXferServices {

    @Value("${endpoints.txnProcessWebService}")
    private String TXN_PROCESS_WEB_SERVICE_END_POINT_PORT;

    private final RubikonCredentials rubikonCredentials;
    private static final String PACKAGE_TO_SCAN = "data/transaction";


    @Override
    public PostGLtoGLXferResponse glToGlXfer(GLToGLTransferRequest glToGLTransferRequest) {
        GLTransferRequest glTransferRequest = buildRequest(glToGLTransferRequest);
        WebServiceTemplate webServiceTemplate = new WebServiceTemplate(marshaller());

        PostGLtoGLXfer postGLtoGLXfer = new PostGLtoGLXfer();
        postGLtoGLXfer.setArg0(glTransferRequest);
        JAXBElement response = null;

        try {
            response = (JAXBElement) webServiceTemplate.marshalSendAndReceive(
                TXN_PROCESS_WEB_SERVICE_END_POINT_PORT, postGLtoGLXfer);
            return (PostGLtoGLXferResponse) response.getValue();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        assert response != null;
        return (PostGLtoGLXferResponse) response.getValue();

    }

    private GLTransferRequest buildRequest(GLToGLTransferRequest glToGLTransferRequest) {

        GLTransferRequest glTransferRequest = new GLTransferRequest();
        glTransferRequest.setXAPIServiceCode("FNT011");
        glTransferRequest.setAmount(glToGLTransferRequest.getAmount());
        glTransferRequest.setChannelCode(rubikonCredentials.getChannelCode());
        glTransferRequest.setChannelId(Long.valueOf(rubikonCredentials.getChannelId()));
        glTransferRequest.setCurrBUId(Long.valueOf(rubikonCredentials.getCurrBUId()));
        glTransferRequest.setTransmissionTime(System.currentTimeMillis());
        glTransferRequest.setUserAccessCode("");
        glTransferRequest.setUserId(-99L);
        glTransferRequest.setUserPassword("");
        glTransferRequest.setUserRoleId(Long.valueOf(rubikonCredentials.getUserRoleId()));
        glTransferRequest.setValidXapiRequest(true);
        glTransferRequest.setFromGLAccountNumber(glToGLTransferRequest.getToGLAccountNumber());
        glTransferRequest.setToGLAccountNumber(glToGLTransferRequest.getToGLAccountNumber());
        glTransferRequest.setTransactionAmount(glToGLTransferRequest.getTransactionAmount());
        glTransferRequest.setTransactionCurrencyCode(rubikonCredentials.getTransactionCurrencyCode());
        glTransferRequest.setTxnReference(glToGLTransferRequest.getTxnReference());
        return glTransferRequest;
    }


    private Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // this package must match the package in the <generatePackage> specified in
        // pom.xml
        marshaller.setPackagesToScan(PACKAGE_TO_SCAN);
        return marshaller;
    }


}
