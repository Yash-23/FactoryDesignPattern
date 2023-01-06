public class AccountFactory {
    public static BankAccount createAccount(String AccountType){
        if(AccountType == null){
            return null;
        }
        else if(AccountType.equalsIgnoreCase("Personal")){
            return new PersonalAccount();
        }
        else if (AccountType.equalsIgnoreCase("Cooperate")){
            return new CooperateAccount();
        } else if (AccountType.equalsIgnoreCase("Business")) {
            return new BusinessAccount();
        }
        return null;
    }
}
