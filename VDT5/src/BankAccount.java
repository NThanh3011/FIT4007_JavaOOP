public class BankAccount {
    private double balance;
    private int accountNumber;
    private static int lastAssigedNumber = 1000;
    public static final double OVERDRAFT_FEE = 0.2;

    public BankAccount() {
        lastAssigedNumber++;
        accountNumber = lastAssigedNumber;
    }

    public int getAccountNumber(){
        return accountNumber;
    }
    public static void showInfo(){
        System.out.println("Account number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Overdraft fee: " + OVERDRAFT_FEE);
    }
}
