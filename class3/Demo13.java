package com.thevarungupta.Day3;

interface IBankAccount{
    boolean deposit(double amount);
    boolean withdraw(double amount);
    void getBalance();
}

class SavingAccount implements IBankAccount{
    private double _balance = 0;
    private double _perDayLimit = 0;
    @Override
    public boolean deposit(double amount) {
        _balance += amount;
        return true;
    }

    @Override
    public boolean withdraw(double amount) {
        if(_balance < amount){
            System.out.println("insufficient fund");
            return false;
        }
        // limit 5000
        else if(_perDayLimit + amount > 5000){
            System.out.println("withdraw attempt failed");
            return false;
        }
        else{
            _balance -= amount;
            _perDayLimit += amount;
            System.out.println("Successfully withdraw: "+ amount);
            return true;
        }
    }

    @Override
    public void getBalance() {
        System.out.println("Saving account balance: "+ _balance);
    }
}

class CurrentAccount implements IBankAccount{

    private double _balance;
    @Override
    public boolean deposit(double amount) {
        _balance += amount;
        return true;
    }

    @Override
    public boolean withdraw(double amount) {
        if(_balance < amount){
            System.out.println("insufficient balance");
            return false;
        }
        else{
            _balance -= amount;
            System.out.println("Successfully withdraw: "+ amount);
            return true;
        }
    }

    @Override
    public void getBalance() {
        System.out.println("Current account balance: "+ _balance);
    }
}


public class Demo13 {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount();
        CurrentAccount currentAccount = new CurrentAccount();

        savingAccount.deposit(2000);
        savingAccount.withdraw(1000);
        savingAccount.getBalance();

        currentAccount.deposit(5000);
        currentAccount.withdraw(6000);
        currentAccount.withdraw(2000);
        currentAccount.getBalance();
    }
}
