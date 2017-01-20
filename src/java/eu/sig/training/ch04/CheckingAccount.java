package eu.sig.training.ch04;

// tag::CheckingAccount[]
public class CheckingAccount extends BaseAccounts implements Account
{
    public Transfer makeTransfer(String counterAccount, Money amount)
        throws BusinessException {
        // 1. Check withdrawal limit:
        if (amount.greaterThan(super.getTransferLimit())) {
            throw new BusinessException("Limit exceeded!");
        }
        // 2. Assuming result is 9-digit bank account number, validate 11-test:
		return super.getTransferResult(CheckingAccount.class, counterAccount, amount);
    }

}
// end::CheckingAccount[]
