//Inheritance of circle and cylinder
class circle{
    public double  radius;

    public double  area(){
        return 3.14* radius * radius;
    }
     public double  perimeter() {
         return 2 * 3.14* radius;
     }
}

class cylinder extends circle {
    public double height;

    public double volume() {
        return radius * height;
    }

    public static void main(String[] args) {
        cylinder c1=new cylinder();
        c1.height =5;
        c1.radius =5;

     System.out.println(c1.area());
     System.out.println(c1.volume());
    }
}

//Inheritance for banking  system
class Account {
   public  int accountnumber;
    public String name;
    public String address;
    public  int phonenumber;
    public int balance;

    public Account(int n) {
        this.accountnumber = n;
    }
    public Account(int n, int p) {
        this.accountnumber = n;
        this.phonenumber = p;
    }
    public int getAccountnumber() {
        return accountnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public int getBalance() {
        return balance;
    }

    public  void setBalance(int balance) {
        this.balance = balance;
    }
}

class Savings extends Account {

    public Savings(int acrn) {
        super(acrn);
    }

    public Savings(int acrn, int pnn) {
        super(acrn, pnn);
    }

    public int deposit(int amount) {
        balance += amount;
        return balance;
    }

    public int withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
        return balance;
    }
}

class LoanAccount extends Account {
    public LoanAccount(int acrn) {
        super(acrn);
    }

    public LoanAccount(int acrn, int pnn) {
        super(acrn, pnn);
    }

    public int payEMI(int amt) {
        balance -= amt;
        return balance;
    }

    public static void main(String[] args) {
        LoanAccount obj = new LoanAccount(1, 12345);
        obj.setName("Omkar");
        obj.setAddress("Pune");
        obj.setBalance(100);

        System.out.println("Balance after EMI payment: " + obj.payEMI(50));

    }
}
