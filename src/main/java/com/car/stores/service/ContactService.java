package com.car.stores.service;

import javax.mail.MessagingException;
import com.car.stores.entity.Contact;

public interface ContactService {
	
	void saveContacts(Contact contact) throws MessagingException;

}
