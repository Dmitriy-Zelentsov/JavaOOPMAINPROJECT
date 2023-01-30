package view;

import model.data.User;
import model.service.UserService;

public abstract class UserView<C extends User> {

    private UserService<C> model;

    public UserView(UserService<C> model) {
        this.model = model;
    }

    public void showContacts() {
        for (C contact : model.getContact()) {
            System.out.println(contact);
        }
    }

}