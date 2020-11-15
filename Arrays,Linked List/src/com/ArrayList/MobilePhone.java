package com.ArrayList;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contacts> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contacts>();
    }

    public boolean addNewContact(Contacts contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already exists");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contacts oldContact,Contacts newContact){
        int index=findContact(oldContact);
        if(index <0){
            System.out.println(oldContact.getName()+" was not found");
            return false;
        }

        this.myContacts.set(index,newContact);
        System.out.println(oldContact.getName()+" was replaced with "+newContact.getName());
        return true;
    }

    private int findContact(Contacts contact) {
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contacts contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeContact(Contacts contact){
        int index = findContact(contact);
        if(index <0){
            System.out.println(contact.getName()+" was not found");
            return false;
        }
        this.myContacts.remove(index);
        System.out.println(contact.getName()+" was deleted");
        return true;
    }

    public String queryContact(Contacts contact){
        if(findContact(contact) >=0){
            return contact.getName();
        }
        return null;
    }
}
