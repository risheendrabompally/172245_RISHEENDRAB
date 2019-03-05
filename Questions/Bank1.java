public class Bank1 {

	public static void main(String[] args) {
		Account a=new Account ("1","mouni");
		
		a.credit(5000);
		a.debit(2000);
		a.transfer("1",100);
		System.out.println(a.toString());

	}

}
