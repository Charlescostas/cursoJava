package com.charles.cursojava.services;

import org.springframework.mail.SimpleMailMessage;

import com.charles.cursojava.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}