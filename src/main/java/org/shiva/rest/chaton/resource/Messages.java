package org.shiva.rest.chaton.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.shiva.rest.chaton.model.Message;
import org.shiva.rest.chaton.service.MessageService;

@Path("messages")
public class Messages {

	public Messages() {
		System.out.println("in");
	}

	MessageService mSer = new MessageService();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> firstMeth() {
		return mSer.getMessages();
	}

	@POST
	@Path("/addmsg")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message addMsg(Message msg) {
		return mSer.addMessage(msg);
	}

	@Path("/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Message test1(@PathParam("id") long id) {
		return mSer.getMessages(id);
	}
}
