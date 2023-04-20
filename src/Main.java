import demo.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      //Tạo 1 đối tượng tên là nguoi
        // Nhập thông tin cho nguoi
        // In thong tin cua nguoi ra
        // Nếu tuổi người đó lớn hơn 18 thì in ra đã đủ tuổi đi tù
        Person nguoi = new Person();
        nguoi.input();
        nguoi.display();
        if(nguoi.getAge()>18){
            System.out.println("du tuoi di tu");
        }

    }
}