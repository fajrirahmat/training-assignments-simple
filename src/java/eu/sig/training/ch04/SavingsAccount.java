package eu.sig.training.ch04;

// tag::SavingsAccount[]
public class SavingsAccount extends BaseAccounts
{
	private CheckingAccount registeredCounterAccount;
    public Transfer makeTransfer(String counterAccount, Money amount) 
        throws BusinessException {
		return super.getTransferResult(SavingsAccount.class, counterAccount, amount);
    }

}
// end::SavingsAccount[]
