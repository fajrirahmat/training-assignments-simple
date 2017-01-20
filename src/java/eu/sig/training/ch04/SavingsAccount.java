package eu.sig.training.ch04;

// tag::SavingsAccount[]
public class SavingsAccount extends AccountsUtil
{
	private CheckingAccount registeredCounterAccount;
    public Transfer makeTransfer(String counterAccount, Money amount) 
        throws BusinessException {
        // 1. Assuming result is 9-digit bank account number, validate 11-test:
		return super.getTransferResult(SavingsAccount.class, counterAccount, amount);
    }

}
// end::SavingsAccount[]
