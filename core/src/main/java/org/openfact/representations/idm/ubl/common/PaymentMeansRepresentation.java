package org.openfact.representations.idm.ubl.common;

import java.time.LocalDate;
import java.util.List;

public class PaymentMeansRepresentation {
    private String idUbl;
    private String paymentMeansCode;
    private LocalDate paymentDueDate;
    private String paymentChannelCode;
    private String instructionID;
    private List<String> instructionNote;
    private List<String> paymentID;
    private CardAccountRepresentation cardAccount;
    private FinancialAccountRepresentation payerFinancialAccount;
    private FinancialAccountRepresentation payeeFinancialAccount;
    private CreditAccountRepresentation creditAccount;
    private String id;

    public String getIdUbl() {
        return this.idUbl;
    }

    public void setIdUbl(String idUbl) {
        this.idUbl = idUbl;
    }

    public List<String> getInstructionNote() {
        return this.instructionNote;
    }

    public void setInstructionNote(List<String> instructionNote) {
        this.instructionNote = instructionNote;
    }

    public FinancialAccountRepresentation getPayerFinancialAccount() {
        return this.payerFinancialAccount;
    }

    public void setPayerFinancialAccount(FinancialAccountRepresentation payerFinancialAccount) {
        this.payerFinancialAccount = payerFinancialAccount;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInstructionID() {
        return this.instructionID;
    }

    public void setInstructionID(String instructionID) {
        this.instructionID = instructionID;
    }

    public FinancialAccountRepresentation getPayeeFinancialAccount() {
        return this.payeeFinancialAccount;
    }

    public void setPayeeFinancialAccount(FinancialAccountRepresentation payeeFinancialAccount) {
        this.payeeFinancialAccount = payeeFinancialAccount;
    }

    public CreditAccountRepresentation getCreditAccount() {
        return this.creditAccount;
    }

    public void setCreditAccount(CreditAccountRepresentation creditAccount) {
        this.creditAccount = creditAccount;
    }

    public List<String> getPaymentID() {
        return this.paymentID;
    }

    public void setPaymentID(List<String> paymentID) {
        this.paymentID = paymentID;
    }

    public String getPaymentChannelCode() {
        return this.paymentChannelCode;
    }

    public void setPaymentChannelCode(String paymentChannelCode) {
        this.paymentChannelCode = paymentChannelCode;
    }

    public LocalDate getPaymentDueDate() {
        return this.paymentDueDate;
    }

    public void setPaymentDueDate(LocalDate paymentDueDate) {
        this.paymentDueDate = paymentDueDate;
    }

    public CardAccountRepresentation getCardAccount() {
        return this.cardAccount;
    }

    public void setCardAccount(CardAccountRepresentation cardAccount) {
        this.cardAccount = cardAccount;
    }

    public String getPaymentMeansCode() {
        return this.paymentMeansCode;
    }

    public void setPaymentMeansCode(String paymentMeansCode) {
        this.paymentMeansCode = paymentMeansCode;
    }
}