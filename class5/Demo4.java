package com.thevarungupta.Day5;

class InSufficientFundException extends Exception{
    public InSufficientFundException(){
        System.out.println("Insufficient amount requested");
    }
    public InSufficientFundException(String message){
        System.out.println(message);
    }
}

class BankAccount{
    private int balance = 0;
    private int accountNumber;

    public BankAccount(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void deposit(int amount){
        balance += amount;
        System.out.println("amount credited: "+ amount);
    }

    public void withdraw(int amount) throws InSufficientFundException {
        if(amount <= balance){
            balance -= amount;
            System.out.println("amount debited: "+ amount);
        }else{
            throw new InSufficientFundException("Hello from exception");
        }
    }
    public int getBalance(){
        return balance;
    }

    public int getAccountNumber(){
        return accountNumber;
    }
}


public class Demo4 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(007);
        System.out.println(account.getBalance());
        account.deposit(5000);
        try {
            account.withdraw(2000);
        } catch (InSufficientFundException e) {
            e.printStackTrace();
        }
        account.deposit(1000);
        try {
            account.withdraw(10000);
        } catch (InSufficientFundException e) {
            e.printStackTrace();
        }
    }
}
