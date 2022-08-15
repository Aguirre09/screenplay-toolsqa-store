package co.com.testing.models;

public class Information {
    private String firstname;
    private String lastname;
    private String country;
    private String state;
    private String phone;
    private String email;

    public Information() {
    }

    public Information(String firstname, String lastname, String country, String state, String phone, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.country = country;
        this.state = state;
        this.phone = phone;
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
