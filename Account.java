import java.util.*;

public class Account{

	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	private String name;
	private ArrayList<Transaction> transactions;
	
	Account(){
		id = 0;
		balance = 0.0;
		annualInterestRate = 0.0;
		transactions = new ArrayList<>();
	}
	
	Account(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
		transactions = new ArrayList<>();
	}
	
	Account(String newName, int newId, double newBalance) {
		name = newName;
		id = newId;
		balance = newBalance;
		transactions = new ArrayList<>();
	}
	
	Account(int newId, double newBalance, double newAnnualInterestRate) {
		id = newId;
		balance = newBalance;
		annualInterestRate = newAnnualInterestRate;
		transactions = new ArrayList<>();
	}
	
	//return id
	public int getId() {
		return id;
	}
	
	//return name
	public String getName(){
		return name;
	}
	
	//return balance
	public double getBalance() {
		return balance;
	}
	
	//return annualInterestRate
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	//set id
	public void setId(int newId){
		id = newId;
	}
	
	//set name
	public void setName(String name){
		this.name = name;
	}
	
	//set balance
	public void setBalance(double newBalance){
		balance = newBalance;
	}
	
	//set annualInterestRate(
	public void setAnnualInterestRate(double newAnnualInterestRate){
		annualInterestRate = newAnnualInterestRate;
	}
	
	//return dateCreated
	public Date getDateCreated(){
		return dateCreated;
	}
	
	//return monthlyInterestRate
	public double getMonthlyInterestRate(){
		return annualInterestRate / 12;
	}
	
	//return monthlyInterest
	public double getMonthlyInterest(){
		return balance * annualInterestRate / 12;
	}
	
	public void withdraw(double withdrawMoney){
		balance -= withdrawMoney;
		transactions.add(new Transaction('W', withdrawMoney, balance, "Withdraw"));
	}
	
	public void deposit(double depositMoney){
		balance += depositMoney;
		transactions.add(new Transaction('D', depositMoney, balance, "Deposit"));
	}
	
	//return transactions
	public ArrayList<Transaction> getTransactions(){
		return transactions;
	}
	
}