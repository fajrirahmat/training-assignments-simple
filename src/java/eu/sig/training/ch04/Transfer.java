package eu.sig.training.ch04;

public class Transfer {
    CheckingAccount counterAccount;

    @SuppressWarnings("unused")
	public <T> Transfer(T acct1, CheckingAccount acct2, Money m)
	{
	}


    public CheckingAccount getCounterAccount() {
        return this.counterAccount;
    }
}
