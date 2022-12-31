package Event;

public class CozDiscount implements Discount {
    int discountRate = 10;

    public CozDiscount(int discountRate) {
        this.discountRate = discountRate;
    }
}
