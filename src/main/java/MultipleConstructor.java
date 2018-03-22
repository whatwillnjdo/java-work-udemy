public final class MultipleConstructor {
    String name;
    Double creditlimit;
    String emailaddress;

    public MultipleConstructor(String name, Double creditlimit, String emailaddress) {
        this.name = name;
        this.creditlimit = creditlimit;
        this.emailaddress = emailaddress;
    }

    public MultipleConstructor(String name, String emailaddress) {
        this(name, 1000D, emailaddress);
    }

    public MultipleConstructor() {
        this("Default",100D, "noemail@email.com");
    }

    public String getName() {
        return name;
    }

    public Double getCreditLimit() {
        return creditlimit;
    }

    public String getEmailAddress() {
        return emailaddress;
    }
}
