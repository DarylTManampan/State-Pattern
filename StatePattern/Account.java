public class Account{
    private String accountNumber;
    private Double balance;
    private AccountState accountState;

    public Account(String accountNumber, Double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountState = new ActiveState();
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public Double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }
        public void setAccountState(AccountState accountState){
            this.accountState = accountState;
        }

        public void deposit(Double amount){
            accountState.deposit(this,amount);
        }

        public void withdraw(Double amount){
            accountState.withdraw(this,amount);
        }

        public void activate(){
            accountState.activate(this);
        }

        public void suspend(){
            accountState.suspend(this);
        }

        public void close(){
            accountState.close(this);
        }

    }