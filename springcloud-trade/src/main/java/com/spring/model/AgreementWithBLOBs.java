package com.spring.model;

public class AgreementWithBLOBs extends Agreement {
    private String agreementContent;

    private String privacyPolicyContent;

    public String getAgreementContent() {
        return agreementContent;
    }

    public void setAgreementContent(String agreementContent) {
        this.agreementContent = agreementContent == null ? null : agreementContent.trim();
    }

    public String getPrivacyPolicyContent() {
        return privacyPolicyContent;
    }

    public void setPrivacyPolicyContent(String privacyPolicyContent) {
        this.privacyPolicyContent = privacyPolicyContent == null ? null : privacyPolicyContent.trim();
    }
}