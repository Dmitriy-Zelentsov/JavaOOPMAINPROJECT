package model.data;

public abstract class User {

    private String name; // наименование организации (имя)

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

}