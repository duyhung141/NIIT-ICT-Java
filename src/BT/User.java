package BT;

import java.util.Scanner;

public class User {
    private static User[] users = {
            new User("1234567890", "user1", 2000),
            new User("8888899999", "user2", 3000),
            new User("6666699999", "user3", 1500),
    };
    private String stk;
    private String password;
    private double amount;
    public User() {
    }

    public User(String stk, String password, double amount) {
        this.stk = stk;
        this.password = password;
        this.amount = amount;
    }

    public String getStk() {
        return stk;
    }

    public String getPassword() {
        return password;
    }

    public double getAmount() {
        return amount;
    }

    public boolean authentication(String stk, String password){
        for(int i=0;i<this.users.length;i++){
            if(users[i].getStk().equals(stk)&&users[i].getPassword().equals(password)){
                this.stk=users[i].getStk();
                this.password=users[i].getPassword();
                this.amount=users[i].getAmount();
                return true;
            } return true;
        }
        return false;
    }
    public boolean login(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số tài khoản: ");
        String stk = scanner.nextLine();
        String password=scanner.nextLine();
        if(authentication(stk,password)){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "User{" +
                "stk='" + stk + '\'' +
                ", password='" + password + '\'' +
                ", amount=" + amount +
                '}';
    }

    public static void main(String[] args) {
        User user = new User();
        if(user.login()){
            System.out.println(user);
        }
    }
}
