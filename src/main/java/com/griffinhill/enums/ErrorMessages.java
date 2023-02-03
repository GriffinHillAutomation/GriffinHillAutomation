package com.griffinhill.enums;

public enum ErrorMessages {

    CONTACT_PAGE_FORENAME_REQUIRED("Forename is required"),
    CONTACT_PAGE_EMAIL_REQUIRED("Email is required"),
    CONTACT_PAGE_MESSAGE_REQUIRED("Message is required");

    private String errorMessageText;

    ErrorMessages(String errorMessageText) {
        this.errorMessageText = errorMessageText;
    }

    public String getErrorMessage() { return errorMessageText; }
}
