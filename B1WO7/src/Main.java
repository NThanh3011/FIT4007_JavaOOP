import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        char operator;
        int result = 0;

        try {
            System.out.println("Nhập vào số a: ");
            a = Integer.parseInt(scanner.next());
            System.out.println("Nhập vào số b: ");
            b = Integer.parseInt(scanner.next());
            System.out.println("Nhập toán tử (+,-,*,/)");
            operator = scanner.next().charAt(0);

            switch (operator) {
                case '+':
                    result = a + b;
                    System.out.println("Kết quả của " + a + " + " + b + " = " + result);
                    break;
                case '-':
                    result = a - b;
                    System.out.println("Kết quả của " + a + " - " + b + " = " + result);
                    break;
                case '*':
                    result = a * b;
                    System.out.println("Kết quả của " + a + " * " + b + " = " + result);
                    break;
                case '/':
                    if (b == 0) {
                        throw new ArithmeticException("Không thể chia cho 0.");
                    }
                    result = a / b;
                    System.out.println("Kết quả: " + a + " / " + b + " = " + result);
                    break;
                default:
                    throw new IllegalArgumentException("Toán tử không hợp lệ.");
            }
        }catch (NumberFormatException e) {
            System.out.println("Lỗi: Vui lòng nhập một số nguyên hợp lệ.");
        } catch (ArithmeticException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }finally {
            scanner.close();
        }
    }
}