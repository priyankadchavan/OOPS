package Encapsulation;

public class Test {
public static void main(String[] args) {
	 BankAccount acc=new BankAccount();   
	    acc.setAcc_no(7560504000L);  
	    acc.setName("Priyanka Chavan");  
	    acc.setEmail("priyankachavan@gmail.com");  
	    acc.setAmount(5000);  
	    System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());  
}
}
