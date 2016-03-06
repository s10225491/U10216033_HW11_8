public class TestAccount{
  //main method
  public static void main(String[] args){

    //create an account
    Account myAccount = new Account("George", 1122, 1000);
	
	myAccount.setAnnualInterestRate(0.015);
	
	//deposit $30
    myAccount.deposit(30);
	
    //deposit $40
    myAccount.deposit(40);
	
    //deposit $50
    myAccount.deposit(50);	

    //withdraw $5
    myAccount.withdraw(5);
	
	//withdraw $4
    myAccount.withdraw(4);
	
	//withdraw $2
    myAccount.withdraw(2);

    //print the balance, the monthly interest, and the date when this account was created
    System.out.println("Name : " + myAccount.getName() + "\nBalance : "+ myAccount.getBalance() +
	"\nMonthly interest : "+ myAccount.getMonthlyInterest()+
	"\nCreate Date : "+ myAccount.getDateCreated() );
	
	//Print  summary
	for(int i = 1; i <= myAccount.getTransactions().size(); i++) {
		System.out.println("Type: " + myAccount.getTransactions().get(i).getType());
		System.out.println("Amount: " + myAccount.getTransactions().get(i).getAmount());
		System.out.println("Balance: " + myAccount.getTransactions().get(i).getBalance());
		System.out.println("Description: " + myAccount.getTransactions().get(i).getDescription());
	}
  }
}