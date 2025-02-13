package org.example.test.java;
import org.example.Contacts;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ContactsTest {
    @Test
    public void testContactsWindowCreation(){
        Contacts contacts = new Contacts();
        assertNotNull(contacts.ContactsWindow());
    }

    @Test
    public void testAddContact() {
        Contacts contacts = new Contacts();
        contacts.saveContact().doClick();
    }

}
