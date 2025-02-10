public class ClosedState implements AccountState{
    @Override
    public void deposit(Account account, double amount){
        System.out.println("You cannot deposit on a closed account!");
        System.out.println(account.toString());
    }

    @Override
    public void withdraw(Account account, double amount){
        System.out.println(" You cannot withdraw on a closed account!");
        System.out.println(account.toString());
    }

    @Override
    public void activate(Account account){
        account.setAccountState(new ActiveState());
        System.out.println("You cannot activate a closed account!");
    }

    @Override
    public void suspend(Account account){
        System.out.println("You cannot suspend a closed account!");
    }

    @Override
    public void close(Account account){
        System.out.println("Account is already Closed!");
    }
       
}
