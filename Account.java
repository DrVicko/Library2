package Library2;

public class Account 
{
	private int accNumber, numberIssuedBooks; private String customerName, firstBook, secondBook, thirdBook; 

	Account () { }
	
	Account (int accNumber, String customerName, int numberIssuedBooks, String firstBook, String secondBook, String thirdBook)
	{
		this.accNumber = accNumber; 
		this.customerName = customerName; 
		this.numberIssuedBooks = numberIssuedBooks; 
		this.firstBook = firstBook;
		this.secondBook = secondBook;
		this.thirdBook = thirdBook;
	}

	public int getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	public int getNumberIssuedBooks() {
		return numberIssuedBooks;
	}
	public void setNumberIssuedBooks(int numberIssuedBooks) {
		this.numberIssuedBooks = numberIssuedBooks;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getFirstBook() {
		return firstBook;
	}
	public void setFirstBook(String firstBook) {
		this.firstBook = firstBook;
	}
	public String getSecondBook() {
		return secondBook;
	}
	public void setSecondBook(String secondBook) {
		this.secondBook = secondBook;
	}
	public String getThirdBook() {
		return thirdBook;
	}
	public void setThirdBook(String thirdBook) {
		this.thirdBook = thirdBook;
	}
	
	@Override
	public String toString() 
	{
		return "Account: Number =  " + accNumber + " has Number of books issued = " + numberIssuedBooks + ", Account customer name = " + customerName + " first books issued = " + firstBook + 
				" second book issued " + secondBook + " third book issued " + thirdBook;
	}

}
