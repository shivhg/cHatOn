package org.shiva.rest.chaton.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.shiva.rest.chaton.model.Message;
import org.shiva.rest.chaton.service.MessageService;

@Path("messages")
public class Messages {
	
	MessageService mSer = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> firstMeth() {
		return mSer.getMessages();
	}
}
