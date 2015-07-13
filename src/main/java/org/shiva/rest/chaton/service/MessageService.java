package org.shiva.rest.chaton.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.shiva.rest.chaton.database.Database;
import org.shiva.rest.chaton.model.Message;

public class MessageService {
	Map<Long, Message> messages = Database.getMessages();
	
	public List<Message> getMessages() {
		return new ArrayList<Message>(messages.values());
	}
	
	public Message addMessage (Message msg) {
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
