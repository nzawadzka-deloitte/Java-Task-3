package src.main.java;

import src.main.java.office.Boss;
import src.main.java.office.Student;
import src.main.java.office.Worker;

public class Display {

    public static void main(String[] args){
        Container<Student> studentContainer = new Container<>();
        Container<Worker> workerContainer = new Container<>();
        Container<Boss> bossContainer = new Container<>();

        Display.displayStudent(studentContainer);
        Display.displayWorker(workerContainer);
        Display.displayBoss(bossContainer);
    }
    public static void displayStudent(Container<Student> container){
        Student student = container.getT();
        System.out.println(student.getName() + " " + student.getLastName() + " " + student.getSalary());
    }
    public static void displayWorker(Container<Worker> container){
        Worker worker = container.getT();
        System.out.println(worker.getHoliday() + " " + worker.getPrize());
    }

    public static void displayBoss(Container<Boss> container){
        Boss boss = container.getT();
        System.out.println(boss.getPrivateOffice());
    }
}
