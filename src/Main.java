
    public class Main {
        public static void main(String[] args) {

            Account myAccount = new Account(98.35, "jekyll", 10923847);

            System.out.println("Your Balance: " + myAccount.getBalance() );

            myAccount.deposit(1);
            myAccount.withdraw(30);
            boolean withdrawSuccessful = myAccount.withdraw(30);
            System.out.println("Withdraw Successful? " + withdrawSuccessful);
            System.out.println("Holder: " + myAccount.getAccountHolder());

        }
}
