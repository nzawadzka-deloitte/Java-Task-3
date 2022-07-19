package src.main.java.office;

public class Worker extends Student {
    int prize;
    int holiday;

    public Worker(String name, String lastName, int salary) {
        super(name, lastName, salary);
        this.prize = prize;
        this.holiday = holiday;
    }

    public int getPrize() {
        return prize;
    }

    public int getHoliday() {
        return holiday;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    public void setHoliday(int holiday) {
        this.holiday = holiday;
    }
}
