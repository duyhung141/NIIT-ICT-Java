package NV;

import java.util.*;

public class EmployeeManager {
    private static List<Employee> listEmployee = new ArrayList<Employee>(Arrays.asList(
            new Employee("NV01", "Trần Văn B", 30, 10000),
            new Employee("NV02", "Trần Văn A", 30, 10000),
            new Employee("NV03", "Trần Văn C", 30, 10000),
            new Employee("NV04", "Nguyễn Thị A", 25, 8000),
            new Employee("NV05", "Nguyễn Thị C", 25, 8000),
            new Employee("NV06", "Nguyễn Thị B", 25, 8000),
            new Employee("NV07", "Lê Minh A", 35, 12000),
            new Employee("NV08", "Lê Minh B", 35, 12000),
            new Employee("NV09", "Lê Minh C", 35, 12000)
    ));

    public void input() {
        Scanner scanner = new Scanner(System.in);
        String id = "NV";
        int newId = listEmployee.size()+1;
        if (newId < 10) id = id + "0" + Integer.toString(newId);
        else id += Integer.toString(newId);

        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Age: ");
        int age = scanner.nextInt();
        System.out.println("Salary: ");
        double salary = scanner.nextDouble();
        Employee employee = new Employee(id, name, age, salary);
        listEmployee.add(employee);
    }

    public void display() {
        for (Employee employee : listEmployee) {
            System.out.println(employee);
        }
    }

    public Employee searchById(String id) {
        for (Employee nv : listEmployee) {
            if (nv.getid().equals(id)) return nv;
        }
        return null;
    }

    public void sortByName() {
        Collections.sort(listEmployee);
    }


}
