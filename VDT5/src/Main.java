public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        System.out.println(account1.getAccountNumber());
        System.out.println(account2.getAccountNumber());
        System.out.println(BankAccount.OVERDRAFT_FEE);
        BankAccount.showInfo();
    }
}