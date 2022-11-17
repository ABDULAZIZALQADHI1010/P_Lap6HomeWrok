public class BankAccount {
    private double Balance=0;
    private double Interest=0;
    public float NumOfYearsToReach1M(){
        int sumYear=0;
        this.Balance=Balance;
        this.Interest=Interest;
        for (;;) {
            if (Balance<=1000000){
            this.Balance+=((this.getInterest()/100)*this.Balance);
            sumYear++;
            }else
                break;
        }
        return sumYear;
    }
    public BankAccount(double balance, double interest) {
        Balance = balance;
        Interest = interest;
    }
    public double getInterest() {
        return Interest;
    }

    public void withdraw(double amount){
        Balance-=amount;
    }

    public void deposit(double amount){
        Balance+=amount;
    }

    public double getBalance() {
        return Balance;
    }

    public void setInterest(double interest) {
        Interest = interest;
    }
}