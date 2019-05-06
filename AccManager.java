package Library2;
import java.util.ArrayList; 

public class AccManager 
{
protected static ArrayList <Account> accountList = new ArrayList <>(); 
	
	protected static void createAccount (int number, String name, int numberIssuedBooks, String firstBook, String secondBook, String thirdBook)
	{
		Account acc = new Account (number, name, numberIssuedBooks, firstBook, secondBook, thirdBook); 
		accountList.add(acc); 
	}
	
	protected static void printAccount ()
	{
		System.out.println("Account data is: ");
		for (Account x : accountList)  
		{
			System.out.println(x + "\n");
		}
	}
	protected static boolean isCreatedNumber (int number)
	{
		for (int i = 0; i < accountList.size(); i++)
		{
			if (accountList.get(i).getAccNumber() == number)
				return false;
		}
		return true;
	}
	
	protected static void printAccountsWithIssuedBooks ()
	{
		for (int i = 0; i < AccManager.accountList.size(); i++)
		{
			if (accountList.get(i).getNumberIssuedBooks() > 0)
			{
				System.out.println(i + " : " + AccManager.accountList.get(i));
			}
		}
	}
	
	protected static void userIssuedBooks (int returnUserOrdinalNumber)
	{
			if (AccManager.accountList.get(returnUserOrdinalNumber).getFirstBook() != null)
			{
				System.out.println("First book issued is: " + AccManager.accountList.get(returnUserOrdinalNumber).getFirstBook());
			}
			if (AccManager.accountList.get(returnUserOrdinalNumber).getSecondBook() != null)
			{
				System.out.println("Second book issued is: " + AccManager.accountList.get(returnUserOrdinalNumber).getSecondBook());
			}
			if (AccManager.accountList.get(returnUserOrdinalNumber).getThirdBook() != null)
			{
				System.out.println("Third book issued is: " + AccManager.accountList.get(returnUserOrdinalNumber).getThirdBook());
			}
	}

}
