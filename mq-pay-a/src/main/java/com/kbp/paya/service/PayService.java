package com.kbp.paya.service;

public interface PayService {

	String payment(String userId, String orderId, String accountId, double money);
}
