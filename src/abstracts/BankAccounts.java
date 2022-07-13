package abstracts;

abstract class BankAccount{

    String owner;
    Double balance;

    public abstract void withdraw();

    public void deposit(){
        System.out.println("Deposito feito");
    }
}

class CheckAccount extends BankAccount{

    @Override
    public void withdraw() {
        System.out.println("Saque realizado na conta corrente");
        
    }
    
}

class SavingsAccount extends BankAccount{

    @Override
    public void withdraw() {
        System.out.println("Saque realizado na conta poupança");
    }
    
}

public class BankAccounts {

    public static void main(String[] args) {
        
        CheckAccount checkAccount = new CheckAccount();

        checkAccount.deposit();
        checkAccount.withdraw();

        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.deposit();
        savingsAccount.withdraw();

    }
    
}
