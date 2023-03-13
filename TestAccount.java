public class TestAccount {
    public static void main(String[] args){

        BankAccount account1 = new BankAccount(12.00, 24.50);
        BankAccount account2 = new BankAccount(15.00, .75);
        System.out.println(account1.getChecking());
        System.out.println(account2.getSavings());
        account1.setDeposit("checking", 50.00);
        account2.setDeposit("savings", 25.00);
        account1.setWithdraw("savings", 23.50);
        account1.setWithdraw("savings", 23.50);
        System.out.println(account1.getSavings());
    }
}