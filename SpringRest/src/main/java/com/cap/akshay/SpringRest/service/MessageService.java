package com.cap.akshay.SpringRest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.cap.akshay.SpringRest.database.DatabaseClass;
import com.cap.akshay.SpringRest.model.Message;


public class MessageService {
	
	private Map<Long, Message> messages	 = DatabaseClass.getMessages();
	
	public MessageService() {
		
		messages.put(1L, new Message(1, "hello", "rishi"));
		messages.put(2L, new Message(2,"hi", "risheendra"));
	}
	
public List<Message> getAllMessages(){
	
	return new ArrayList<Message>(messages.values());
//	Message m1=new Message(1l, "hello", "rishi");
//	Message m2=new Message(2l, "jersey", "risheendra");
//	List<Message> list=new ArrayList<Message>();
//	list.add(m1);
//	list.add(m2);
//	return list;
}

public Message addMessage(Message message) {
	message.setId(messages.size()+1);
	messages.put(message.getId(), message);
	return message;
}

public Message updateMessage(Message message) {
	if(message.getId() <= 0) {
		return null;
	}
	messages.put(message.getId(), message);
	return message;
}

public Message removeMessage(long id) {
	return messages.remove(id);
}

}
