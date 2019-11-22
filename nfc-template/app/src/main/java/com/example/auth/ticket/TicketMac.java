package com.example.auth.ticket;

import java.security.GeneralSecurityException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class TicketMac {
    private SecretKeySpec hmacKey;
    private Mac mac;
    private boolean isKeySet = false;

    public TicketMac() throws GeneralSecurityException {
        isKeySet = false;
        hmacKey = null;
    }

    public void setKey(byte[] key) throws GeneralSecurityException {
        hmacKey = new SecretKeySpec(key, "HmacSHA256");
        mac = Mac.getInstance("HmacSHA256");
        mac.init(hmacKey);

        isKeySet = true;
    }

    public byte[] generateMac(byte[] data) throws GeneralSecurityException {
        if(!isKeySet)
            return null;
        mac.reset();
        return mac.doFinal(data);
    }
}
