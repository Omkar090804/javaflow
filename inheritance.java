

class Account {
    private String accNo;
    private String name;
    private String address;
    private String phno;
    private String dob;
    protected long balance;

    public Account(String acc, String n, String add, String phno, String dob) {
        accNo = acc;
        name = n;
        address = add;
        this.phno = phno;
        this.dob = dob;
        balance = 0;
    }

    public String getAccNo() {
        return accNo;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhno() {
        return phno;
    }

    public String getDOB() {
        return dob;
    }

    public long getBalance() {
        return balance;
    }

    public void setAddress(String add) {
        address = add;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(String acc, String n, String add, String phno, String dob) {
        super(acc, n, add, phno, dob);
    }

    public void deposit(long amt) {
        balance += amt;
    }

    public void withdraw(long amt) {
        balance -= amt;
    }
}

class LoanAccount extends Account {
    public LoanAccount(String acc, String n, String add, String phno, String dob) {
        super(acc, n, add, phno, dob);
    }

    public void payEMI(long amt) {
        balance -= amt;
    }

    public void repay(long amt) {
        if (balance == amt)
            balance = 0;
    }
}

public class SCInherit {
    public static void main(String[] args) {
       
        SavingsAccount savingsAccount = new SavingsAccount("123456789", "John Doe", "123 Main St", "123-456-7890",
                "01/01/1990");
        savingsAccount.deposit(1000); // Deposit 1000 into the account
        savingsAccount.withdraw(500); // Withdraw 500 from the account
        System.out.println("Savings Account Balance: $" + savingsAccount.getBalance());

       
        LoanAccount loanAccount = new LoanAccount("987654321", "Jane Smith", "456 Elm St", "987-654-3210",
                "05/05/1985");
        loanAccount.payEMI(200); // Pay 200 towards EMI
        loanAccount.repay(800); // Repay 800 towards the loan
        System.out.println("Loan Account Balance: $" + loanAccount.getBalance());
    }
}
