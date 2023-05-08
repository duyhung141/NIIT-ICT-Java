package NV;

public class Employee implements Comparable<Employee> {
    private String id;
    private String name;
    private int age;
    private double salary;

    public Employee() {
    }

    public Employee(String id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getid() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int getage() {
        return age;
    }

    public void setage(int age) {
        this.age = age;
    }

    public double getsalary() {
        return salary;
    }

    public void setsalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee e2) {
        String[] name1 = this.getname().split(" ");
        String[] name2 = e2.getname().split(" ");
        String lastName1 = name1[name1.length - 1];
        String lastName2 = name2[name2.length - 1];
        return lastName1.compareTo(lastName2);
    }
}
