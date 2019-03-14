package com.cap.akshay.SpringRest.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.cap.akshay.SpringRest.model.Message;
import com.cap.akshay.SpringRest.service.MessageService;

@Path("messages")
public class MessageResource {
	
	MessageService messageService=new MessageService();
	
//public String getMessages()
//{
//	return "Hello world";
//	
//} 
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages() {	 
		return messageService.getAllMessages();
	}
}
