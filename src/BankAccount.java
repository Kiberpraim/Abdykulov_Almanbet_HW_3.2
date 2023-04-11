public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        this.amount += sum;
        System.out.println("Вы пополнили счёт на сумму: " + sum + " Ваш счёт: " + amount);
    }

    public void withDraw (double sum) throws LimitException{
        if(sum > this.amount){
            throw new LimitException("У вас не достаточно денег на счёту для снятия! Вас счёт: " + amount, amount);
        }
        this.amount -= sum;
        System.out.println("С вашего счёта снята сумма: " + sum + " Остаток: " + this.amount);
    }
}
