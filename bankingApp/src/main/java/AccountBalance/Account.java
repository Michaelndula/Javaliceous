package AccountBalance;

class Account {
    int acc_no;
    String acc_name;
    float amount;

    //initialize the object
    void insert(int a, String n, float amt) {
        acc_no = a;
        acc_name = n;
        amount = amt;
    }

    // deposit method
    void deposit(float amt) {
        amount = amount + amt;
        System.out.println(amt + " deposited to Account "+acc_no);
    }

    // withdraw method
    void withdraw(float amt) {
        if (amount < amt) {
            System.out.println("Insufficient Balance");
        } else {
            amount = amount - amt;
            System.out.println("Confirmed " + amt + " Withdrawn form account " + acc_no);
        }
    }

    //method to check the balance of the account
    void checkBalance() {
        System.out.println("Balance is: " + amount);
    }


    //method to display the values of an object
    void display() {
        System.out.println("Account No.: "+ acc_no+"," + " Account Name: " + acc_name +","+ " Account Balance: " + amount);
    }
}

//Creating a test class to deposit and withdraw amount
class TestAccount {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.insert(832345, "Michael", 1000);
        a1.display();
        a1.checkBalance();
        a1.deposit(40000);
        a1.checkBalance();
        a1.withdraw(15000);
        a1.checkBalance();
    }
}
