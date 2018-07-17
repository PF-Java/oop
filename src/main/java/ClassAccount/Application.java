package ClassAccount;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000);
        account.setAnnuaInterestRate(0.045);
        account.withdraw(2500);
        account.deposit(3000);
        Date now = new Date();
        account.setDateCreated(now);
        System.out.println("Số dư tài khoản là: " + account.getBalance());
        System.out.println("Tiền lãi tháng: " + account.getMonthlyInterest());
        System.out.println("Ngày tạo tài khoản: " + account.getDateCreated() );
    }
}
