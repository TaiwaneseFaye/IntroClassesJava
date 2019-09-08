package introToClasses;

public class AccountUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account1 = new Account("Chris Sun", 69.00);
		Account account2 = new Account("Jiahao Wang", 169.00);
		Account account3 = new Account("Kuang Huang", 269.00);

		System.out.println(account1.toString());
		
		System.out.println(account2.toString());
		
		System.out.println(account3.toString());
	}

}
