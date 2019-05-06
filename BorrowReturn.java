package Library2;

public class BorrowReturn 
{
	public static void borrowBook (int bookOrdinalNumber, int userOrdinalNUmber)
	{
		while (bookOrdinalNumber >= 0 && userOrdinalNUmber >= 0)
		{
			boolean issued = BookManager.bookList.get(bookOrdinalNumber).isBookIssued(); 
			int booksIssued = AccManager.accountList.get(userOrdinalNUmber).getNumberIssuedBooks();
		
			if (booksIssued >= 3 )
			{
				System.out.println("This user has already 3 book issued on his name, he's not allowed to tako more books!");
				break;
			}
			else if (issued == true)
			{
				System.out.println("Sorry the book is already issued to another user. ");
				break; 
			}
			else if (issued == false)
			{
				BookManager.bookList.get(bookOrdinalNumber).setBookIssued(true);
				booksIssued++;
				AccManager.accountList.get(userOrdinalNUmber).setNumberIssuedBooks(booksIssued);
				if (booksIssued == 1)
				{
					AccManager.accountList.get(userOrdinalNUmber).setFirstBook(BookManager.bookList.get(bookOrdinalNumber).getBookName());
				}
				else if (booksIssued == 2)
				{
					AccManager.accountList.get(userOrdinalNUmber).setSecondBook(BookManager.bookList.get(bookOrdinalNumber).getBookName());
				}
				else if (booksIssued == 3)
				{
					AccManager.accountList.get(userOrdinalNUmber).setThirdBook(BookManager.bookList.get(bookOrdinalNumber).getBookName());
				}
				java.util.Date date = new java.util.Date (); 
				System.out.println("\nThe book " +BookManager.bookList.get(bookOrdinalNumber).getBookName() + 
					" is isued to " +AccManager.accountList.get(userOrdinalNUmber).getCustomerName() + " on : " + date.toString()); 
				break;
			}
			break;
		}
	}
	
	public static void returnBook (int returnUserOrdinalNumber, int returnBookOrdinalNumber)
	{
		int booksIssued = AccManager.accountList.get(returnUserOrdinalNumber).getNumberIssuedBooks();
		BookManager.bookList.get(returnBookOrdinalNumber).setBookIssued(false);
		
		if (booksIssued == 1)
		{
			AccManager.accountList.get(returnUserOrdinalNumber).setFirstBook(null);
		}
		if (booksIssued == 2)
		{
			AccManager.accountList.get(returnUserOrdinalNumber).setSecondBook(null);
		}
		if (booksIssued == 3)
		{
			AccManager.accountList.get(returnUserOrdinalNumber).setThirdBook(null);
		}
		booksIssued--; 
		AccManager.accountList.get(returnUserOrdinalNumber).setNumberIssuedBooks(booksIssued);
		java.util.Date date = new java.util.Date (); 
		System.out.println("\nThe book " +BookManager.bookList.get(returnBookOrdinalNumber).getBookName() + 
			" is returned from user  " +AccManager.accountList.get(returnUserOrdinalNumber).getCustomerName() + " on : " + date.toString()); 
	}

}
