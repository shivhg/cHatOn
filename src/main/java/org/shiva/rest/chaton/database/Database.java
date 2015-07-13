package org.shiva.rest.chaton.database;

import java.util.HashMap;
import java.util.Map;

import org.shiva.rest.chaton.model.Message;
import org.shiva.rest.chaton.model.Profile;

public class Database {
	public static Map<Long, Message> messages = new HashMap<Long, Message>();
	public static Map<Long, Profile> profiles = new HashMap<Long, Profile>();

	
	public static Map<Long, Message> getMessages() {
		return messages;
	}
	public static Map<Long, Profile> getProfiles() {
		return profiles;
	}
}
