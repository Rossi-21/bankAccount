public class BankAccount {
    private double checking;
    private double savings;
    private static int numOfAccounts = 0;
    private static double allAccountTotal = 0.0;

    public BankAccount(double checking, double savings){
        this.checking = checking;
        this.savings = savings;
        numOfAccounts++;
    }

    public double getChecking(){
        return checking;
    }
    public double getSavings(){
        return savings;
    }
    public void setDeposit(String account, double deposit){
        if (account.equals("checking")){
            this.checking += deposit;
            System.out.println(String.format("Your Checking balance is $%s",getChecking()));
        }
        else if (account.equals("savings")){
            this.savings += deposit;
            System.out.println(String.format("Your Savings balance is $%s",getSavings()));
        }
        BankAccount.allAccountTotal += deposit;
    }
    public void setWithdraw(String account, double withdraw){
            if (account.equals("savings")){
                this.savings -= withdraw;
                if (this.savings <= 0){
                    this.savings += withdraw;
                    System.out.println("I'm sorry Account Holder, I can't let you do that.");
                }
                else {
                    BankAccount.allAccountTotal -= withdraw;
                    System.out.println(String.format("Your Savings balance is $%s",getSavings()));
                }
            }
            else if (account.equals("checking")){
                this.checking -= withdraw;
                if (this.checking <= 0){
                    this.checking += withdraw;
                    System.out.println ("I'm sorry Account Holder, I can't let you do that.");
                }
                else {
                    BankAccount.allAccountTotal -= withdraw;
                    System.out.println(String.format("Your Checking balance is $%s",getChecking()));
                }
            }   
    }
    public String getTotal(){
        double total = getChecking() + getSavings();
        return String.format("Your total account balance is %s", total);            
    }
}
       
    
       
