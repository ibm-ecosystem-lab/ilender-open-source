package com.ilender.micro.kafka;

public class KafkaMessage {

    int loanId;
    int loanOfferId;
    int customerId;
    int bankId;
    double loanAmount;

    String emailId;
    String messageText;

    public KafkaMessage() {
    }

    public KafkaMessage(int customerId, int bankId, int loanId, int loanOfferId, double loanAmount) {
        this.customerId = customerId;
        this.bankId = bankId;
        this.loanId = loanId;
        this.loanOfferId = loanOfferId;
        this.loanAmount = loanAmount;
    }


    public KafkaMessage(String fromEmail, String toEmail, String ccEmail, String subject, String messageText) {
        this.emailId = emailId;
        this.messageText = messageText;
    }

    public int getLoanId() {
        return loanId;
    }

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }

    public int getLoanOfferId() {
        return loanOfferId;
    }

    public void setLoanOfferId(int loanOfferId) {
        this.loanOfferId = loanOfferId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public int getBankId() {
        return bankId;
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }

    @Override
    public String toString() {
        return "KafkaMessage{" +
                "loanId=" + loanId +
                ", loanOfferId=" + loanOfferId +
                ", customerId=" + customerId +
                ", bankId=" + bankId +
                ", loanAmount=" + loanAmount +
                ", emailId='" + emailId + '\'' +
                ", messageText='" + messageText + '\'' +
                '}';
    }
}
