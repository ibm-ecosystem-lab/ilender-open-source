package com.ilender.micro.model;

public class LoanOfferRequestInfo {

    int loanId;
    int customerId;
    double loanAmount;

    public LoanOfferRequestInfo() {
    }

    public LoanOfferRequestInfo(int customerId, int loanId, double loanAmount) {
        this.customerId = customerId;
        this.loanId = loanId;
        this.loanAmount = loanAmount;
    }

    public int getLoanId() {
        return loanId;
    }

    public void setLoanId(int loanId) {
        this.loanId = loanId;
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
}
