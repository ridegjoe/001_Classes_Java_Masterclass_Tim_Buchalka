package eu.rideg;

public class Main {

    public static void main(String[] args) {
        // TIM BUCHALKA'S JAVA MASTERCLASS CHALLENGE START
        //
        // This is a challenge, defined by Tim Buchalka
        // This comment part of the code is a part of his Complete Java Master Course from www.udemy.com:
        //
        // https://www.udemy.com/java-the-complete-java-developer-course/
        //
        // I share the challenge text with his permission.
        //
        // CHALLENGE OF CLASSES
        //
        // Create a new class for a bank account
        // Create fields for the account number, balance, customer name, email and phone number.
        //
        // Create getters and setters for each field
        // Create two additional methods
        // 1. To allow the customer to deposit funds (this should increment the balance field).
        // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
        // but not allow the withdrawal to complete if their are insufficient funds.
        // You will want to create various code in the Main class (the one created by IntelliJ) to
        // confirm your code is working.
        // Add some System.out.println's in the two methods above as well.
        //
        // TIM BUCHALKA'S JAVA MASTERCLASS CHALLENGE END
        //
        // The code with the solution is made by myself.

        // Creating a new object based on BankAccount class
        BankAccount joesBankAccount = new BankAccount();

        // Defining fields
        joesBankAccount.setAccount("1234-1234-1234-1234");
        joesBankAccount.setBalance(1000);
        joesBankAccount.setCustomerName("Joe");
        joesBankAccount.setEmailAddress("joe@mail.com");
        joesBankAccount.setPhoneNumber("123-45-678");

        // testing method of deposit fund
        joesBankAccount.depositFund(500);
        joesBankAccount.depositFund(1000);

        //testing method of withdraw fund
        joesBankAccount.withdrawFund(1500);
        joesBankAccount.withdrawFund(2000);




    }
}
