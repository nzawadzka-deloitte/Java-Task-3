package src.main.java.office;

public class Boss extends Worker{
    String privateOffice;

    public Boss(String name, String lastName, int salary) {
        super(name, lastName, salary);
        this.privateOffice = privateOffice;
    }

    public String getPrivateOffice() {
        return privateOffice;
    }

    public void setPrivateOffice(String privateOffice) {
        this.privateOffice = privateOffice;
    }
}
