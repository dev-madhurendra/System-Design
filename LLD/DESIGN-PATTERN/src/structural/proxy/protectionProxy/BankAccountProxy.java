package structural.proxy.protectionProxy;

public class BankAccountProxy implements BankAccount {
    private RealBankAccount realAccount;
    private String userRole;
    private String accountNumber;
    private double initialBalance;

    public BankAccountProxy(String accountNumber, double initialBalance, String userRole) {
        this.accountNumber = accountNumber;
        this.initialBalance = initialBalance;
        this.userRole = userRole;
    }

    private RealBankAccount getRealAccount() {
        if (realAccount == null) {
            realAccount = new RealBankAccount(accountNumber, initialBalance);
        }
        return realAccount;
    }

    @Override
    public void deposit(double amount) {
        if (hasPermission("DEPOSIT")) {
            getRealAccount().deposit(amount);
        } else {
            System.out.println("Access denied: User doesn't have deposit permission");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (hasPermission("WITHDRAW")) {
            getRealAccount().withdraw(amount);
        } else {
            System.out.println("Access denied: User doesn't have withdrawal permission");
        }
    }

    @Override
    public double getBalance() {
        if (hasPermission("VIEW_BALANCE")) {
            return getRealAccount().getBalance();
        } else {
            System.out.println("Access denied: User doesn't have balance viewing permission");
            return 0.0;
        }
    }

    private boolean hasPermission(String operation) {
        switch (userRole.toLowerCase()) {
            case "admin":
                return true;
            case "user":
                return operation.equals("DEPOSIT") || operation.equals("VIEW_BALANCE");
            case "readonly":
                return operation.equals("VIEW_BALANCE");
            default:
                return false;
        }
    }
}
