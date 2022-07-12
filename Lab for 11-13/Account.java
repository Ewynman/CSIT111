//********************************************************************
//  Account.java       Author: Lewis/Loftus
//
//  Represents a bank account with basic services such as deposit
//  and withdraw.
//********************************************************************

import java.text.NumberFormat;

public class Account
{
    private final double RATE = 0.035;

    private long acctNumber;
    private double balance;
    private String name;

    public Account(String owner, long account, double initial)
    {
        name = owner;
        acctNumber = account;
        balance = initial;
    }
    public double deposit(double amount)
    {
      if (amount<0)
      {
         System.out.println("Negative Valuse Not Allowed");
      }
         balance = balance + amount;
         return balance;  
    }
    public double withdraw(double amount, double fee)
    {
      if (amount>balance+fee)
      {
         System.out.println("Insufficient funds");
      }
         balance = balance - amount - fee;
         return balance;
    }
    public double addInterest()
    {
        balance += (balance * RATE);
        return balance;
    }
    public double getBalance()
    {
        return balance;
    }
    public String toString()
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return (name + "\n" + fmt.format(balance) + "\n");
    }
}
