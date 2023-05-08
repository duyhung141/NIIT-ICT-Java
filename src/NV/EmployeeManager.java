package NV;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class EmployeeManager {
    private static List<Employee> listEmployee = new ArrayList<Employee>(Arrays.asList());
    private List<Employee> getData(){
        List<Employee> listEmployee = new ArrayList<Employee>(Arrays.asList());
        try {
            FileReader fileReader = new FileReader("D:/java/NIIT-ICT/src/NV/data.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String row = "";
            while((row=bufferedReader.readLine())!=null){
                String[] data = row.split(", ");
                String id = data[0];
                String name = data[1];
                int age = Integer.parseInt(data[2]);
                double salary = Double.parseDouble(data[3]);
                Employee employee = new Employee(id, name, age, salary);
                listEmployee.add(employee);
            }
            bufferedReader.close();
            fileReader.close();
        }catch (Exception e){

        }
        return listEmployee;
    }

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
        try {
            FileWriter fileWriter = new FileWriter("D:/java/NIIT-ICT/src/NV/data.txt",true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String data = id + ", " + name + ", " + age + ", " + salary;
            bufferedWriter.write(data);
            bufferedWriter.close();
            fileWriter.close();
        }
        catch (Exception e){

        }
    }

    public void display() {
        this.listEmployee = getData();
        for (Employee employee : listEmployee) {
            System.out.println(employee);
        }
    }

    public Employee searchById(String id) {
        this.listEmployee = new ArrayList<Employee>(Arrays.asList());
        for (Employee nv : listEmployee) {
            if (nv.getid().equals(id)) return nv;
        }
        return null;
    }

    public void sortByName() {
        this.listEmployee = new ArrayList<Employee>(Arrays.asList());
        Collections.sort(listEmployee);
    }


}
