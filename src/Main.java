public class Main {
    public static void main(String[] args) {
        BankAccount Bogdan = new BankAccount();
        Bogdan.deposit(20000);

        while (true){
            try {
                Bogdan.withDraw(6000);
            }catch (LimitException limitException){
                System.out.println(limitException.getMessage());
                try {
                    Bogdan.withDraw(limitException.getRemainingAmount());
                }catch (LimitException A){
                    System.out.println(A.getMessage());
                }
                break;
            }
        }
    }
}