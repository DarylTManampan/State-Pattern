public class ActiveState implements AccountState{
    @Override
    public void deposit(Account account, double amount){
        account.setBalance(account.getBalance() + amount);
        System.out.println(account.toString());
    }

    @Override
    public void withdraw(Account account, double amount){
        account.setBalance(account.getBalance() + amount);
        System.out.println(account.toString());
    }

    @Override
    public void activate(Account account){

        System.out.println("Account is already activated!");
    }

    @Override
    public void suspend(Account account){

        account.setAccountState(new SuspendedState());
        System.out.println("Account is Suspended");
    }

    @Override
    public void close(Account account){

        account.setAccountState(new ClosedState());
        System.out.println("Account is Closed");
    }
       
}
