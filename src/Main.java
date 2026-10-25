
    public class Main {
        public static void main(String[] args) {

            Account myAccount = new Account(98.35, "jekyll", 10923847);

            System.out.println("Your Balance: " + myAccount.getBalance() );

            myAccount.deposit(-50);
            myAccount.withdraw(0);
            boolean withdrawlSuccessful = myAccount.withdraw(1000);
            System.out.println("Withdrawl Successful? " + withdrawlSuccessful);

        }
}
