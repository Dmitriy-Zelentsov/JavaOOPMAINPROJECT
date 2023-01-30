package model.contactinfo;

import model.contactinfo.adres.Adres;
import model.contactinfo.email.Email;
import model.contactinfo.phone.Phone;
import model.contactinfo.telegramm.Telegramm;

public class UserListContactinfo implements Adres, Email, Phone, Telegramm {

    @Override
    public void addressMethod() {
    }

    @Override
    public void emailMethod() {
    }

    @Override
    public void phoneMethod() {
    }

    @Override
    public void telegramMethod() {
    }
    
}