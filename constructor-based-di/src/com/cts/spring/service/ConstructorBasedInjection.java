package com.cts.spring.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ConstructorBasedInjection {
	private MessageService messageService;
	
	@Autowired
	public ConstructorBasedInjection(@Qualifier("TwitterService") MessageService messageService){
		this.messageService = messageService;
	}
	
	public void processMsg(String msg)
	{
		  messageService.sendMsg(msg);
	}

}
