public class BankAccount {
    private double accountNumber, balance;
    private String accountHolder;

    public double getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public BankAccount(int accountNumber, String accountHolder, int balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;

    }

    public void deposit(double amount)
    {
        balance = balance + amount;
    }

    public void withdraw(double amount)
    {

        if(balance>amount) {
            balance = balance - amount;
            System.out.println("withdraw succesful, current balance"+balance);
        }
        else {
            System.out.println("no sufficient balance");
        }

    }


    public static void main(String[] args){
        BankAccount account1 = new BankAccount(3,"Roshini",700);
        account1.deposit(300);
        account1.withdraw(100);

        System.out.println(account1.balance);
        
        System.out.println("Account Holder:"+ account1.getAccountHolder());
        System.out.println("Account Number:"+ account1.getAccountNumber());
        System.out.println("Account Balance:"+ account1.getBalance());

    }

}

