package bank_account;

public class TestAccount {
    public static void main(String[] args){
        Account acc = new Account();

        acc.setAcc_no(12345);
        acc.setName("Michael Ndula");
        acc.setEmail("michaelndula@gmail.com");
        acc.setAmount(50000f);

        System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());
    }
}
