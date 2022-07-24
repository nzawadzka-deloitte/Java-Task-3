package src.main.java;

import src.main.java.office.Student;

import java.util.List;

public class Container < T extends Student> {
   private T t;

   public T getT(){
       return t;
   }

    public void setT(T t){
        this.t=t;
    }
}