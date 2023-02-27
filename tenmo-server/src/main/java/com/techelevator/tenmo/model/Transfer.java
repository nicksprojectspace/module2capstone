package com.techelevator.tenmo.model;

import java.math.BigDecimal;

public class Transfer {
    private int transferId;
    private int typeId;
    private String transferType; //call the description from the transfer_type table in the DAO
    private int statusId;
    private String transferStatus; //call the description from the transfer_status table in the DAO
    private int accountFrom;
    private int accountTo;
    private BigDecimal amount;
    private String username;

    public Transfer() {
    }

    public Transfer(int transferId, String transferType, String transferStatus, int accountFrom, int accountTo, BigDecimal amount) {
        this.transferId = transferId;
        this.transferType = transferType;
        this.transferStatus = transferStatus;
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
        this.amount = amount;
    }

    public Transfer(int transferId, int typeId, int statusId, int accountFrom, int accountTo, BigDecimal amount) {
        this.transferId = transferId;
        this.typeId = typeId;
        this.statusId = statusId;
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
        this.amount = amount;
    }

    public Transfer (int transferId, int accountFrom, int accountTo, BigDecimal amount, String username){
        this.transferId = transferId;
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
        this.amount = amount;
        this.username = username;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getTypeId() {
        return typeId;
    }

    public int getStatusId() {
        return statusId;
    }

    public String getUsername() {
        return username;
    }

    public int getTransferId() {
        return transferId;
    }

    public String getTransferType() {
        return transferType;
    }

    public String getTransferStatus() {
        return transferStatus;
    }

    public int getAccountFrom() {
        return accountFrom;
    }

    public int getAccountTo() {
        return accountTo;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setTransferId(int transferId) {
        this.transferId = transferId;
    }

    public void setTransferType(String transferType) {
        this.transferType = transferType;
    }

    public void setTransferStatus(String transferStatus) {
        this.transferStatus = transferStatus;
    }

    public void setAccountFrom(int accountFrom) {
        this.accountFrom = accountFrom;
    }

    public void setAccountTo(int accountTo) {
        this.accountTo = accountTo;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
