public class LimitException extends  Exception{
    private double RemainingAmount;

    public LimitException(String message, double remainingAmount) {
        super(message);
        RemainingAmount = remainingAmount;
    }

    public double getRemainingAmount() {
        return RemainingAmount;
    }
}
