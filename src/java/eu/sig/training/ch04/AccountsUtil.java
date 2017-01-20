package eu.sig.training.ch04;

public abstract class AccountsUtil
{
	public static final float INTEREST_PERCENTAGE = 0.01f;
	private Money balance = new Money();
	private int transferLimit = 100;

	public void addInterest() {
        Money interest = balance.multiply(INTEREST_PERCENTAGE);
        if (interest.greaterThan(0)) {
            balance.add(interest);
        } else {
            balance.substract(interest);
        }
    }

	public <T extends AccountsUtil> Transfer getTransferResult(Class<T> acct1, String counterAccount, Money amount) throws BusinessException
	{
		int sum = 0; // <1>
		for (int i = 0; i < counterAccount.length(); i++)
		{
			char character = counterAccount.charAt(i);
            int characterValue = Character.getNumericValue(character);
            sum = sum + (9 - i) * characterValue;
        }
        if (sum % 11 == 0) {
            // 2. Look up counter account and make transfer object:
			CheckingAccount acct = Accounts.findAcctByNumber(counterAccount);
			Transfer result = new Transfer(acct1, acct, amount); // <2>
            return result;
        }else {
            throw new BusinessException("Invalid account number!");
        }
	}
	
	public Money getBalance()
	{
		return balance;
	}

	public void setBalance(Money balance)
	{
		this.balance = balance;
	}

	public int getTransferLimit()
	{
		return transferLimit;
	}

	public void setTransferLimit(int transferLimit)
	{
		this.transferLimit = transferLimit;
	}

}
