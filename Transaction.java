public class Transaction{

	private java.util.Date date;
	private char type;
	private double amount;
	private double balance;
	private String description;
	
	public Transaction(char type, double amount, double balance, String description){
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
	}
	
	//set type
	public void setType(char type){
		this.type = type;
	}
	
	//set amount
	public void setAmount(char amount){
		this.amount = amount;
	}
	
	//set balance
	public void setBalance(double balance){
		this.balance = balance;
	}

	//set description
	public void setDescription(String description){
		this.description = description;
	}
	
	//return type
	public char getType(){
		return type;
	}
	
	public double getAmount(){
		return amount;
	}
	
	//return balance
	public double getBalance(){
		return balance;
	}

	//return description
	public String getDescription(){
		return description;
	}
	
}