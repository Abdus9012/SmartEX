package com.example.smartex.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.smartex.model.Transaction;
import com.example.smartex.model.User;

@Service
public class PaymentService {
    //1. processPayment() -> create a transaction btwn sender and receiver id and deduct/add balances as followed.

    private final UserService userService;

    public PaymentService(UserService userService) {
        this.userService = userService;
    }
    
    private List<Transaction> transactions = new ArrayList<>();


    //*****The entire processPayment() funcn is all about transferring money frm 1 user to anothre user**** */
    public String processPayment(String senderId, String receiverId, double amount){
        User sender = userService.getUser(senderId);
        User receiver = userService.getUser(receiverId);

        if(sender == null || receiver == null){
            return "No user found";
        }

        if(sender.getBalance() < amount){
            return "Insufficient funds";
        }

        sender.setBalance(sender.getBalance() - amount);
        receiver.setBalance(receiver.getBalance() + amount);

        transactions.add(new Transaction(senderId, receiverId, amount, LocalDateTime.now()));
        return "Payment successful";
        
    }

    public List<Transaction> getAllTransactions(){
        return transactions;
    }

}
