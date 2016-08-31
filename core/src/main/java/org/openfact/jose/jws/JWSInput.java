package org.openfact.jose.jws;

import org.openfact.common.util.Base64Url;
import org.openfact.util.JsonSerialization;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class JWSInput {
    String wireString;
    String encodedHeader;
    String encodedContent;
    String encodedSignature;
    String encodedSignatureInput;
    JWSHeader header;
    byte[] content;
    byte[] signature;


    public JWSInput(String wire) throws JWSInputException {
        try {
            this.wireString = wire;
            String[] parts = wire.split("\\.");
            if (parts.length < 2 || parts.length > 3) throw new IllegalArgumentException("Parsing error");
            encodedHeader = parts[0];
            encodedContent = parts[1];
            encodedSignatureInput = encodedHeader + '.' + encodedContent;
            content = Base64Url.decode(encodedContent);
            if (parts.length > 2) {
                encodedSignature = parts[2];
                signature = Base64Url.decode(encodedSignature);

            }
            byte[] headerBytes = Base64Url.decode(encodedHeader);
            header = JsonSerialization.readValue(headerBytes, JWSHeader.class);
        } catch (Throwable t) {
            throw new JWSInputException(t);
        }
    }

    public String getWireString() {
        return wireString;
    }

    public String getEncodedHeader() {
        return encodedHeader;
    }

    public String getEncodedContent() {
        return encodedContent;
    }

    public String getEncodedSignature() {
        return encodedSignature;
    }
    public String getEncodedSignatureInput() {
        return encodedSignatureInput;
    }

    public JWSHeader getHeader() {
        return header;
    }

    public byte[] getContent() {
        return content;
    }

    public byte[] getSignature() {
        return signature;
    }

    public boolean verify(String key) {
        if (header.getAlgorithm().getProvider() == null) {
            throw new RuntimeException("signing algorithm not supported");
        }
        return header.getAlgorithm().getProvider().verify(this, key);
    }

    public <T> T readJsonContent(Class<T> type) throws JWSInputException {
        try {
            return JsonSerialization.readValue(content, type);
        } catch (IOException e) {
            throw new JWSInputException(e);
        }
    }

    public String readContentAsString() {
        try {
            return new String(content, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}