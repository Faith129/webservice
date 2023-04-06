package com.neptunesoftware.integrator.account;


import data.transaction.GLTransferRequest;
import data.transaction.PostGLtoGLXferResponse;

import java.math.BigDecimal;

public interface GLtoGLXferServices {
    PostGLtoGLXferResponse glToGlXfer(GLToGLTransferRequest glToGLTransferRequest);
}
