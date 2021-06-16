package com.thiagobetha.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.thiagobetha.cursomc.domain.Cliente;
import com.thiagobetha.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
	
}