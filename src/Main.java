public class Main {
    public static void main(String[] args) throws LimitException {
        BankAccount Bogdan = new BankAccount();
        Bogdan.deposit(20000);

        while (true){
            try {
                Bogdan.withDraw(6000);
            }catch (LimitException limitException){
                System.out.println(limitException.getMessage());
                Bogdan.withDraw(limitException.getRemainingAmount());
                break;
            }
        }
    }
}