package File;

import java.io.FileInputStream;

public class main {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("D:/java/NIIT-ICT/file.txt");
            int data = 0;
            while ((data=fis.read()) != -1) {
                System.out.printf("%s", (char) data);
            }
            fis.close();
        } catch (Exception e) {

        }
    }
}
