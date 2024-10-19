import java.util.Scanner;
class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }public static void checkAge(int Age) throws InvalidAgeException{
        if(Age < 18){
            throw new InvalidAgeException("Tuổi phải lớn hơn hoặc bằng 18");
        }

}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Age;
        try {
            System.out.println("Nhập vào tuổi: ");
            Age = Integer.parseInt(scanner.next());
            checkAge(Age);
        } catch (InvalidAgeException e) {
            throw new RuntimeException(e);
        }
    }

    }}