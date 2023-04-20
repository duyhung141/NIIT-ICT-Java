package demo;

import java.util.Scanner;

public class Person{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

     public void display(){
         System.out.println("Họ và tên: "+getName()+", tuổi: "+getAge());
     }

     public void input(){
         Scanner scanner = new Scanner(System.in);
         System.out.println("Họ và tên: ");
         String name=scanner.nextLine();
         System.out.println("Tuổi: ");
         int age=scanner.nextInt();
         setName(name);
         setAge(age);
     }
}
