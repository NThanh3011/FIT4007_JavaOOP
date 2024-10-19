import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++){
            System.out.println("Nhap id: ");
            String id = scanner.nextLine();
            System.out.println("Nhap name: ");
            String name = scanner.nextLine();
            System.out.println("Nhap gpa: ");
            double gpa = scanner.nextDouble();
            Student std = new Student(id, name, gpa);
            students.add(std);
        }
        System.out.println("Danh sach sv: ");
        for (Student std: students){
            std.display();
        }








//        ArrayList<Double> dsDiem = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//        //Nhap danh sach diem
//        for (int i =0; i < 45; i++){
//            System.out.println("Nhap diem: " + (i + 1) + ":");
//            double diem = scanner.nextDouble();
//            dsDiem.add(diem);
//        }
//        //Hien thi danh sach
//        System.out.println("DS cua sinh vien: ");
//        for (int i = 0; i < dsDiem.size(); i++){
//            System.out.println("Diem cua sv thu: " + (i + 1) + ":" + dsDiem.get(i));
//        }
   }
}