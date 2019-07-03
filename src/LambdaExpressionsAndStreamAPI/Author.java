package LambdaExpressionsAndStreamAPI;

public class Author {
    public String firstname;
    public String lastname;

    Author(String firstName, String lastName) {
        this.firstname = firstName;
        this.lastname = lastName;

    }

    String getFullname() {
        return lastname + " " + firstname;
    }
}
