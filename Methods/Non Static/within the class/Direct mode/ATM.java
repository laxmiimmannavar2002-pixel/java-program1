class ATM {

    int balance = 10000;

    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }

    public void withdrawMoney() {
        balance = balance - 2000;
        System.out.println("Withdraw: 2000");
        System.out.println("Remaining Balance: " + balance);
    }

    public void depositMoney() {
        balance = balance + 3000;
        System.out.println("Deposit: 3000");
        System.out.println("Final Balance: " + balance);
    }

    public static void main(String[] args) {
       new ATM().displayBalance();
	   new ATM().withdrawMoney();
	   new ATM().depositMoney();
    }
}