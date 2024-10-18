/*
 *  Define classes for Contact, AddressBook, and Group. 
 *  Use association to manage contacts in an address book and group them 
 *  based on categories.

 * 
 */
package com.kumar.Assignments_Task_2;

import java.util.ArrayList;
import java.util.List;

// Class representing a Contact
class Contact {
    private String name;
    private String phoneNumber;
    private String email;

    // Constructor
    public Contact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone: " + phoneNumber + ", Email: " + email;
    }
}

// Class representing a Group that contains multiple contacts
class Group {
    private String groupName;
    private List<Contact> contacts;

    // Constructor
    public Group(String groupName) {
        this.groupName = groupName;
        this.contacts = new ArrayList<>();
    }

    // Add a contact to the group
    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    // Remove a contact from the group
    public void removeContact(Contact contact) {
        contacts.remove(contact);
    }

    // Display all contacts in the group
    public void displayContacts() {
        System.out.println("Group: " + groupName);
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    public String getGroupName() {
        return groupName;
    }
}

// Class representing an AddressBook that manages contacts and groups
class AddressBook {
    private List<Contact> contacts;
    private List<Group> groups;

    // Constructor
    public AddressBook() {
        this.contacts = new ArrayList<>();
        this.groups = new ArrayList<>();
    }

    // Add a contact to the address book
    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    // Remove a contact from the address book
    public void removeContact(Contact contact) {
        contacts.remove(contact);
    }

    // Add a group to the address book
    public void addGroup(Group group) {
        groups.add(group);
    }

    // Assign a contact to a group
    public void assignContactToGroup(Contact contact, Group group) {
        if (!contacts.contains(contact)) {
            System.out.println("Contact not found in AddressBook.");
        } else {
            group.addContact(contact);
        }
    }

    // Display all contacts in the address book
    public void displayContacts() {
        System.out.println("All Contacts:");
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    // Display all groups and their contacts
    public void displayGroups() {
        System.out.println("Groups and Contacts:");
        for (Group group : groups) {
            group.displayContacts();
        }
    }
}

// Main class to test the program
public class AddressBookApp {
    public static void main(String[] args) {
        // Create an AddressBook
        AddressBook addressBook = new AddressBook();

        // Create some contacts
        Contact contact1 = new Contact("John Doe", "123-456-7890", "john@example.com");
        Contact contact2 = new Contact("Jane Smith", "987-654-3210", "jane@example.com");
        Contact contact3 = new Contact("Bob Johnson", "555-555-5555", "bob@example.com");

        // Add contacts to the address book
        addressBook.addContact(contact1);
        addressBook.addContact(contact2);
        addressBook.addContact(contact3);

        // Create groups
        Group family = new Group("Family");
        Group friends = new Group("Friends");
        Group work = new Group("Work");

        // Add groups to the address book
        addressBook.addGroup(family);
        addressBook.addGroup(friends);
        addressBook.addGroup(work);

        // Assign contacts to groups
        addressBook.assignContactToGroup(contact1, family);
        addressBook.assignContactToGroup(contact2, friends);
        addressBook.assignContactToGroup(contact3, work);

        // Display all contacts in the address book
        addressBook.displayContacts();

        // Display all groups and their contacts
        addressBook.displayGroups();
    }
}

