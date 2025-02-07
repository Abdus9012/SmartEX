package com.example.smartex.model;

import java.time.LocalDateTime;

public class Transaction {

    private String senderId;
    private String receivweId;
    private double amount;
    LocalDateTime timeStamp;
    public Transaction(String senderId, String receivweId, double amount, LocalDateTime timeStamp) {
        this.senderId = senderId;
        this.receivweId = receivweId;
        this.amount = amount;
        this.timeStamp = timeStamp;
    }
    public String getSenderId() {
        return senderId;
    }
    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }
    public String getReceivweId() {
        return receivweId;
    }
    public void setReceivweId(String receivweId) {
        this.receivweId = receivweId;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }
    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

}
