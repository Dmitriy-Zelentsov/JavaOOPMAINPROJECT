package model.contactinfo;

import java.util.ArrayList;
import java.util.List;

import model.data.Partner;

public class PartnerListContactinfo extends UserListContactinfo {

    Partner partner;
    private List<String> address = new ArrayList<>();
    private List<String> email = new ArrayList<>();
    private List<String> phone = new ArrayList<>();
    private List<String> telegram = new ArrayList<>();

    public PartnerListContactinfo() {
    }

    public Partner getPartner() {
        return partner;
    }

    public List<String> getAdress() {
        return address;
    }

    public List<String> getEmail() {
        return email;
    }

    public List<String> getPhone() {
        return phone;
    }

    public List<String> getTelegram() {
        return telegram;
    }

    public void addTelegramMethod(String telegramAccount) {
        telegram.add(telegramAccount);
    }

    public void addEmailMethod(String emailAccount) {
        email.add(emailAccount);
    }

    public void addPhoneNumberMethod(String phoneAccount) {
        phone.add(phoneAccount);
    }

    public void addAddressMethod(String addressAccount) {
        address.add(addressAccount);
    }

    public void deleteTelegramMethod(int telegramIndex) {
        telegram.remove(telegramIndex);
    }

    public void deleteEmailMethod(int emailIndex) {
        email.remove(emailIndex);
    }

    public void deletePhoneMethod(int phoneIndex) {
        phone.remove(phoneIndex);
    }

    public void deleteAddressMethod(int addressIndex) {
        address.remove(addressIndex);
    }

    public void printListContactMethod() {
        
        if (telegram.size() > 0) {
            System.out.println();
            System.out.print("telegram - ");
            for (String string : telegram) {
                System.out.print(string + ",  ");
            }
        }
        if (email.size() > 0) {
            System.out.println();
            System.out.print("email - ");
            for (String string : email) {
                System.out.print(string + ",  ");
            }
        }
        if (phone.size() > 0) {
            System.out.println();
            System.out.print("Phone - ");
            for (String string : phone) {
                System.out.print(string + ",  ");
            }
        }
        if (address.size() > 0) {
            System.out.println();
            System.out.print("address - ");
            for (String string : address) {
                System.out.print(string + ", ");
            }
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "PartnerListContactMethod";
    }
    
}