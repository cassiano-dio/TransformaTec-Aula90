package abstracts;

//Classe abstrata de uma conta bancária
abstract class BankAccount{

    String owner;
    Double balance;

    //métodod abstrato - sem corpo - (toda classe abstract é obrigada a ter) 
    public abstract void withdraw();

    public void deposit(){
        System.out.println("Deposito feito");
    }
}


//Classes concretas que herdam da classe abstrata e geram objetos
class CheckAccount extends BankAccount{

    //método abstrato implementado na classe concreta
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
        
        //criando objetos da classe concreta que implementa a classe abstrata
        CheckAccount checkAccount = new CheckAccount();

        //chamando o método concreto (implementado na classe abstrata)
        checkAccount.deposit();

        //chamando o método abstrato implementado na classe concreta 
        checkAccount.withdraw();
        

        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.deposit();
        savingsAccount.withdraw();

    }
    
}
