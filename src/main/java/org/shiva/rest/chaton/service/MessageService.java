package org.shiva.rest.chaton.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.shiva.rest.chaton.database.Database;
import org.shiva.rest.chaton.model.Message;

public class MessageService {
	
	public MessageService() {
		super();
	}
	Map<Long, Message> messages = Database.getMessages();
	
	public List<Message> getMessages() {
		return new ArrayList<Message>(messages.values());
	}
	
	public Message getMessages(long id) {
		return messages.get(id);
	}
	
	public Message addMessage (Message msg) {
		msg.setId(messages.size()+1);
		messages.put(msg.getId(), msg);
		return msg;
	}
	
	public Message updateMessage (Message msg) {
		if(msg.getId() == 0) 
			return null;
		else
			messages.put(msg.getId(), msg);
			return msg;
	}
	
	public Message deleteMessage (Long id) {
		return messages.remove(id);
	}
}
