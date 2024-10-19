import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Khai báo biến và các thư viện
        Scanner sc = new Scanner(System.in);
        int choice;
        Vehicle[] listofVihicle = new Vehicle[1];
        //Menu for choice of user
        do{
            System.out.println("Menu:");
            System.out.println("1. Nhập thông tin và tạo các đối tượng xe1, xe2, xe3");
            System.out.println("2. Xuất bảng kê khai tiền thuế trước bạ của các xe");
            System.out.println("3. Thoát");
            System.out.println("Nhập lựa chon:");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    sc.nextLine();
                    System.out.println("Nhập thông tin xe 1");
                    Vehicle vehicle;
                    System.out.println("nhập thông tin chủ xe");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("xuất bảng");
                    break;
                case 3:
                    System.out.println("Thoát");
                    break;
                default:
                    System.out.println("Không hợp lệ");
                    break;
            }
        }while (choice != 3);
    }
}