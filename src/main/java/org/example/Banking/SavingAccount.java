package org.example.Banking;

public class SavingAccount {


    static private double annualInterestRate;
    private double savingBalance;


    public SavingAccount(double savingBalance) {
        this.savingBalance = savingBalance;
    }


    public double getSavingBalance() {
        return this.savingBalance;
    }


    public static void modifyInterestRate(double newInterestRate) {
        annualInterestRate = newInterestRate;
    }

    //Method to calculate monthly interest
    public void calculateMonthlyInterest() {
        double monthlyI;
        monthlyI = (double) (this.savingBalance * annualInterestRate / 12);
        this.savingBalance += monthlyI;
    }

}
class TestSavingsAccount{
    public static void main(String[] args) {


        SavingAccount saver1, saver2;
        saver1 = new SavingAccount(2000.0);
        saver2 = new SavingAccount(3000.0);

        SavingAccount.modifyInterestRate(0.04);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("This month:\nSaver 1 balance= "+ saver1.getSavingBalance());
        System.out.println("Saver 2 balance= "+ saver2.getSavingBalance());

        SavingAccount.modifyInterestRate(0.05);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("2nd month:\nSaver 2 balance= "+ saver1.getSavingBalance());
        System.out.println("Saver 2 balance= "+ saver2.getSavingBalance());

    }

}
