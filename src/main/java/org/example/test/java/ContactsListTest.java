package org.example.test.java;

import org.example.ContactsList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
public class ContactsListTest {
    @Test
    public void testContactsList(){
        ContactsList contact = new ContactsList("sempijja eric", "sempijjaeric@gmail.com","0754760756");
        assertEquals("sempijja eric",contact.getNames());
        assertEquals("sempijjaeric@gmail.com",contact.getEmail());
        assertEquals("0754760756",contact.getNumber());

        contact.setNames("kasule andrew");
        contact.setEmail("kasuleandrew@gmail.com");
        contact.setNumber("0758753508");

        assertEquals("kasule andrew",contact.getNames());
        assertEquals("kasuleandrew@gmail.com",contact.getEmail());
        assertEquals("0758753508",contact.getNumber() );
    }
}
