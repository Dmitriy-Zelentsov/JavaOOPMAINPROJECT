package model.service;

import java.util.List;

import model.data.User;

public interface UserService<C extends User> {

    void addContact(C contact);

    void save();

    void load();

    List<C> getContact();

}