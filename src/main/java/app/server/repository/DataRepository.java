package app.server.repository;

import app.server.entity.Contact;

import java.util.ArrayList;
import java.util.List;

public class DataRepository {

    public List<Contact> fetchData() {

        List<Contact> contacts = new ArrayList<>();

        contacts.add(new Contact(1, "Yaroslav", "777-77-7777-77"));
        contacts.add(new Contact(2, "Roman", "888-88-8888-88"));
        contacts.add(new Contact(3, "Alina", "333-33-3333-33"));
        contacts.add(new Contact(4, "Robert", "117-28-4466-91"));
        contacts.add(new Contact(5, "Spartacus", "134-11-2922-73"));

        return contacts;
    }
}
