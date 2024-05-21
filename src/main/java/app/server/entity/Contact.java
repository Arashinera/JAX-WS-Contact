package app.server.entity;

public class Contact {

    private final Integer id;
    private final String name;
    private final String phoneNumber;

    public Contact(Integer id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "id - " + this.getId() +
                ", name : " + this.getName() +
                ", phone number : " + this.getPhoneNumber() + "\n";
    }
}
