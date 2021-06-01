import domain.Statement;

import static domain.Amount.amountOf;

public class StartApp {
  
    public static void main(String[] args) {
        Account account = new Account(new Statement());
		
		account.deposit(amountOf(1000), date("10/01/2021"));
		account.deposit(amountOf(2000), date("13/01/2021"));
		account.withdrawal(amountOf(500), date("14/01/2021"));
		
		//account.printStatement(System.out);
    }
}
